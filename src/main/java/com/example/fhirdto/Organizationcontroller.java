package com.example.fhirdto;

import ca.uhn.fhir.context.FhirContext;
import org.hl7.fhir.r4.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
public class Organizationcontroller {
    @PostMapping(value= {"/fhir/createorganization","/fhir/createorganization/"}, produces = "application/json")
    String newOrganization(@RequestBody Organizationmodel organizationModel){
        FhirContext ctx = FhirContext.forR4();

        Organization organization = new Organization();

        organization.setActive(true);
        organization.addIdentifier().setSystem(organizationModel.getIdentifier_system()).setValue(organizationModel.getIdentifier_value());
        organization.addIdentifier().setUse(Identifier.IdentifierUse.OFFICIAL);

        //NPI
        organization.addIdentifier().setSystem("NPI").setValue(organizationModel.getNpi());

        organization.addType().addCoding().setSystem(organizationModel.getCoding_system()).setCode(organizationModel.getCoding_code()).setDisplay(organizationModel.getCoding_display());
        organization.setName(organizationModel.getName());
        organization.addTelecom().setSystem(ContactPoint.ContactPointSystem.PHONE).setValue(organizationModel.getTelecom_value());


        // Contact info
        switch (organizationModel.getContact_email_system().toLowerCase()) {
            case "work" -> organization.addContact().addTelecom().setSystem(ContactPoint.ContactPointSystem.EMAIL).setValue(organizationModel.getContact_email()).setUse(ContactPoint.ContactPointUse.WORK);
            case "home" -> organization.addContact().addTelecom().setSystem(ContactPoint.ContactPointSystem.EMAIL).setValue(organizationModel.getContact_email()).setUse(ContactPoint.ContactPointUse.HOME);
        }

        switch (organizationModel.getContact_number_system().toLowerCase()){
            case "work" -> organization.addContact().addTelecom().setSystem(ContactPoint.ContactPointSystem.PHONE).setValue(organizationModel.getContact_number()).setUse(ContactPoint.ContactPointUse.WORK);
            case "home" -> organization.addContact().addTelecom().setSystem(ContactPoint.ContactPointSystem.PHONE).setValue(organizationModel.getContact_number()).setUse(ContactPoint.ContactPointUse.HOME);
            case "mobile" -> organization.addContact().addTelecom().setSystem(ContactPoint.ContactPointSystem.PHONE).setValue(organizationModel.getContact_number()).setUse(ContactPoint.ContactPointUse.MOBILE);
        }

        HumanName humanName = new HumanName();
        humanName.addGiven(organizationModel.getContact_name());

        if(!organizationModel.getContact_middle_name().isBlank()){
            humanName.addGiven(organizationModel.getContact_middle_name());
        }

        humanName.setFamily(organizationModel.getContact_last_name());
        //humanName.setFamily(organizationModel.getContact_name());

        organization.addContact().setName(humanName);


        organization.addAddress().addLine(organizationModel.getAddress_line()).setUse(Address.AddressUse.WORK).setCity(organizationModel.getAddress_city()).setPostalCode(organizationModel.getAddress_postal()).setCountry(organizationModel.getAddress_country());

        return ctx.newJsonParser().encodeResourceToString(organization);
    }
}
