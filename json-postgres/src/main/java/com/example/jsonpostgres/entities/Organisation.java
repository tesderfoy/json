package com.example.jsonpostgres.entities;

import javax.persistence.*;

@Entity
@Table(schema ="public", name = "organisation")
public class Organisation {

    @Id
    @GeneratedValue
    public int id_organisation;
    @Column(name = "full_name")
    public String fullName;

    @Column(name = "abbreviated_name")
    public String abbreviatedName;

    @Column(name = "inn")
    public String inn;
    @Column(name = "kpp")
    public String kpp;

    public Organisation() {
    }

    public int getId_organisation() {
        return id_organisation;
    }

    public void setId_organisation(int id_organisation) {
        this.id_organisation = id_organisation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAbbreviatedName() {
        return abbreviatedName;
    }

    public void setAbbreviatedName(String abbreviatedName) {
        this.abbreviatedName = abbreviatedName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }
}
