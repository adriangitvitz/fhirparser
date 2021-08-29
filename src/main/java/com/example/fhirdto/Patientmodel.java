package com.example.fhirdto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Patientmodel {
    @Id
    @GeneratedValue
    private int id;

    private boolean active;
    private String identifier_system;
    private String identifier_value;
    private String identifier_use;
    private String family;
    private String given;
    private String middle_name;
    private String suffix;
    private String telecom_value;
    private String gender;
    private String birthdate;
    private String email;
    private boolean deceased;
    private String address_line;
    private String address_line_2;
    private String address_city;
    private String address_state;
    private String address_country;
    private String address_postal;
    private String language;

    private String birth_certificate_number;
    private String social_security_number;
    private String driver_license_number;

    public Patientmodel() { }

    public Patientmodel(int id, boolean active, String identifier_system, String identifier_value, String identifier_use, String family, String given, String middle_name, String suffix, String telecom_value, String gender, String birthdate, String email, boolean deceased, String address_line, String address_line_2, String address_city, String address_state, String address_country, String address_postal, String language, String birth_certificate_number, String social_security_number, String driver_license_number) {
        this.id = id;
        this.active = active;
        this.identifier_system = identifier_system;
        this.identifier_value = identifier_value;
        this.identifier_use = identifier_use;
        this.family = family;
        this.given = given;
        this.middle_name = middle_name;
        this.suffix = suffix;
        this.telecom_value = telecom_value;
        this.gender = gender;
        this.birthdate = birthdate;
        this.email = email;
        this.deceased = deceased;
        this.address_line = address_line;
        this.address_line_2 = address_line_2;
        this.address_city = address_city;
        this.address_state = address_state;
        this.address_country = address_country;
        this.address_postal = address_postal;
        this.language = language;
        this.birth_certificate_number = birth_certificate_number;
        this.social_security_number = social_security_number;
        this.driver_license_number = driver_license_number;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getIdentifier_system() {
        return identifier_system;
    }

    public void setIdentifier_system(String identifier_system) {
        this.identifier_system = identifier_system;
    }

    public String getIdentifier_value() {
        return identifier_value;
    }

    public void setIdentifier_value(String identifier_value) {
        this.identifier_value = identifier_value;
    }

    public String getIdentifier_use() {
        return identifier_use;
    }

    public void setIdentifier_use(String identifier_use) {
        this.identifier_use = identifier_use;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGiven() {
        return given;
    }

    public void setGiven(String given) {
        this.given = given;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getTelecom_value() {
        return telecom_value;
    }

    public void setTelecom_value(String telecom_value) {
        this.telecom_value = telecom_value;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDeceased() {
        return deceased;
    }

    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }

    public String getAddress_line() {
        return address_line;
    }

    public void setAddress_line(String address_line) {
        this.address_line = address_line;
    }

    public String getAddress_line_2() {
        return address_line_2;
    }

    public void setAddress_line_2(String address_line_2) {
        this.address_line_2 = address_line_2;
    }

    public String getAddress_city() {
        return address_city;
    }

    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }

    public String getAddress_state() {
        return address_state;
    }

    public void setAddress_state(String address_state) {
        this.address_state = address_state;
    }

    public String getAddress_country() {
        return address_country;
    }

    public void setAddress_country(String address_country) {
        this.address_country = address_country;
    }

    public String getAddress_postal() {
        return address_postal;
    }

    public void setAddress_postal(String address_postal) {
        this.address_postal = address_postal;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBirth_certificate_number() {
        return birth_certificate_number;
    }

    public void setBirth_certificate_number(String birth_certificate_number) {
        this.birth_certificate_number = birth_certificate_number;
    }

    public String getSocial_security_number() {
        return social_security_number;
    }

    public void setSocial_security_number(String social_security_number) {
        this.social_security_number = social_security_number;
    }

    public String getDriver_license_number() {
        return driver_license_number;
    }

    public void setDriver_license_number(String driver_license_number) {
        this.driver_license_number = driver_license_number;
    }
}
