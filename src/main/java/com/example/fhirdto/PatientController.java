package com.example.fhirdto;

import ca.uhn.fhir.context.FhirContext;
import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.codesystems.AdministrativeGender;
import org.hl7.fhir.r4.model.codesystems.AdministrativeGenderEnumFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
public class PatientController {
    @PostMapping(value = {"/fhir/createpatient", "/fhir/createpatient"}, produces = "application/json")
    String newPatient(@RequestBody Patientmodel patientmodel) throws ParseException {
        FhirContext fhirContext = FhirContext.forR4();

        Patient patient = new Patient();

        patient.setActive(patientmodel.isActive());
        patient.addIdentifier().setSystem(patientmodel.getIdentifier_system()).setValue(patientmodel.getIdentifier_value());
        patient.addIdentifier().setSystem("Birth Certificate Number").setValue(patientmodel.getBirth_certificate_number());
        patient.addIdentifier().setSystem("Social Security Number").setValue(patientmodel.getSocial_security_number());
        patient.addIdentifier().setSystem("Driver License Number").setValue(patientmodel.getDriver_license_number());

        patient.addTelecom().setSystem(ContactPoint.ContactPointSystem.PHONE).setValue(patientmodel.getTelecom_value());
        patient.addTelecom().setSystem(ContactPoint.ContactPointSystem.EMAIL).setValue(patientmodel.getEmail());

//        Coding coding = new Coding();
//        coding.setCode("");
//
//        CodeableConcept codeableConcept = new CodeableConcept():
//        codeableConcept.addCoding(coding);
//
//        patient.setMaritalStatus(codeableConcept);


        HumanName humanName = new HumanName();
        humanName.setFamily(patientmodel.getFamily());
        humanName.addGiven(patientmodel.getGiven());
        humanName.addGiven(patientmodel.getMiddle_name());
        humanName.addSuffix(patientmodel.getSuffix());

        if(patientmodel.getGender().equalsIgnoreCase("male")){
            patient.addName(humanName);
            patient.setGender(Enumerations.AdministrativeGender.MALE);
        }else{
            patient.addName(humanName);
            patient.setGender(Enumerations.AdministrativeGender.FEMALE);
        }

        String birthdate = patientmodel.getBirthdate();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date datebirth = format.parse(birthdate);


       patient.setLanguage(patientmodel.getLanguage());

        patient.setBirthDate(datebirth);
        patient.addAddress().addLine(patientmodel.getAddress_line()).setUse(Address.AddressUse.HOME).addLine(patientmodel.getAddress_line_2()).setUse(Address.AddressUse.HOME);
        patient.addAddress().setCity(patientmodel.getAddress_city());
        patient.addAddress().setState(patientmodel.getAddress_state());
        patient.addAddress().setPostalCode(patientmodel.getAddress_postal());
        patient.addAddress().setCity(patientmodel.getAddress_city());

        return fhirContext.newJsonParser().encodeResourceToString(patient);
    }
}
