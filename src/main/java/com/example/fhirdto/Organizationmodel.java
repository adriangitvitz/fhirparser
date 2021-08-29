package com.example.fhirdto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Organizationmodel {
    @Id
    @GeneratedValue
    private int id;

    private boolean active;
    private String identifier_system;
    private String identifier_value;
    private String npi;
    private String coding_system;
    private String coding_code;
    private String coding_display;
    private String name;
    private String telecom_value;
    private String address_line;
    private String address_city;
    private String address_postal;
    private String address_country;
    private String contact_name;
    private String contact_last_name;
    private String contact_middle_name;
    private String contact_number;
    private String contact_number_system;
    private String contact_email;
    private String contact_email_system;

    public Organizationmodel(){}

    public Organizationmodel(int id, boolean active, String identifier_system, String identifier_value, String npi, String coding_system, String coding_code, String coding_display, String name, String telecom_value, String address_line, String address_city, String address_postal, String address_country, String contact_name, String contact_last_name, String contact_middle_name, String contact_number, String contact_number_system, String contact_email, String contact_email_system) {
        this.id = id;
        this.active = active;
        this.identifier_system = identifier_system;
        this.identifier_value = identifier_value;
        this.npi = npi;
        this.coding_system = coding_system;
        this.coding_code = coding_code;
        this.coding_display = coding_display;
        this.name = name;
        this.telecom_value = telecom_value;
        this.address_line = address_line;
        this.address_city = address_city;
        this.address_postal = address_postal;
        this.address_country = address_country;
        this.contact_name = contact_name;
        this.contact_last_name = contact_last_name;
        this.contact_middle_name = contact_middle_name;
        this.contact_number = contact_number;
        this.contact_number_system = contact_number_system;
        this.contact_email = contact_email;
        this.contact_email_system = contact_email_system;
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

    public String getNpi() {
        return npi;
    }

    public void setNpi(String npi) {
        this.npi = npi;
    }

    public String getCoding_system() {
        return coding_system;
    }

    public void setCoding_system(String coding_system) {
        this.coding_system = coding_system;
    }

    public String getCoding_code() {
        return coding_code;
    }

    public void setCoding_code(String coding_code) {
        this.coding_code = coding_code;
    }

    public String getCoding_display() {
        return coding_display;
    }

    public void setCoding_display(String coding_display) {
        this.coding_display = coding_display;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelecom_value() {
        return telecom_value;
    }

    public void setTelecom_value(String telecom_value) {
        this.telecom_value = telecom_value;
    }

    public String getAddress_line() {
        return address_line;
    }

    public void setAddress_line(String address_line) {
        this.address_line = address_line;
    }

    public String getAddress_city() {
        return address_city;
    }

    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }

    public String getAddress_postal() {
        return address_postal;
    }

    public void setAddress_postal(String address_postal) {
        this.address_postal = address_postal;
    }

    public String getAddress_country() {
        return address_country;
    }

    public void setAddress_country(String address_country) {
        this.address_country = address_country;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_last_name() {
        return contact_last_name;
    }

    public void setContact_last_name(String contact_last_name) {
        this.contact_last_name = contact_last_name;
    }

    public String getContact_middle_name() {
        return contact_middle_name;
    }

    public void setContact_middle_name(String contact_middle_name) {
        this.contact_middle_name = contact_middle_name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getContact_number_system() {
        return contact_number_system;
    }

    public void setContact_number_system(String contact_number_system) {
        this.contact_number_system = contact_number_system;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_email_system() {
        return contact_email_system;
    }

    public void setContact_email_system(String contact_email_system) {
        this.contact_email_system = contact_email_system;
    }
}
