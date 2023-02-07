package com.example.jsonpostgres.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema ="public", name = "person")
public class Person {
    @Id
    @GeneratedValue
    public int id_person;

    @Basic
    @Column(name = "last_name")
    public String lastName;

    @Column(name = "first_name")
    public String firstName;

    @Column(name = "middle_name")
    public String middleName;
    @Column(name = "date_birth")
    public String dateBirth;

    @Column(name = "gender")
    public String gender;

    @Column(name = "person_type")
    public String personType;

    @Column(name = "snils")
    public String snils;

    @Column(name = "phone")
    public String phone;

    @Column(name = "email")
    public String email;

    @Column(name = "document_type")
    public String documentType;
    @Column(name ="series_and_numbers")
    public String ser_and_num;
    @Column(name = "data_issue")
    public String dateIssue;
    @Column(name = "divission_code")
    public String divCode;
    @Column(name = "organisation_issue")
    public String orgIssue;
    @Column(name = "residence_address")
    public String residenceAddr;
    @Column(name = "residential_addres")
    public String residentialAddr;

    @OneToMany(mappedBy = "personParentOne")
    private List<Family> parentsOne;

    public Person() {
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getSer_and_num() {
        return ser_and_num;
    }

    public void setSer_and_num(String ser_and_num) {
        this.ser_and_num = ser_and_num;
    }

    public String getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(String dateIssue) {
        this.dateIssue = dateIssue;
    }

    public String getDivCode() {
        return divCode;
    }

    public void setDivCode(String divCode) {
        this.divCode = divCode;
    }

    public String getOrgIssue() {
        return orgIssue;
    }

    public void setOrgIssue(String orgIssue) {
        this.orgIssue = orgIssue;
    }

    public String getResidenceAddr() {
        return residenceAddr;
    }

    public void setResidenceAddr(String residenceAddr) {
        this.residenceAddr = residenceAddr;
    }

    public String getResidentialAddr() {
        return residentialAddr;
    }

    public void setResidentialAddr(String residentialAddr) {
        this.residentialAddr = residentialAddr;
    }
}
