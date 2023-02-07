package com.example.jsonpostgres.entities;

import javax.persistence.*;

@Entity
@Table(schema ="public", name = "application")
public class Application {
    @Id
    @GeneratedValue
    public int id_application;

    @OneToOne
    @JoinColumn(name = "fk_family", referencedColumnName = "id_family")
    private Family familyId;

    @Column(name = "date_application")
    public String dateApl;

    @Column(name = "date_enrollment")
    public String dateEnr;

    public Application() {
    }

    @JoinColumn(name = "fk_application_org", referencedColumnName = "id_application_org")
    private ApplicationOrg applicationOrg;

    public int getId_application() {
        return id_application;
    }

    public void setId_application(int id_application) {
        this.id_application = id_application;
    }

    public Family getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Family familyId) {
        this.familyId = familyId;
    }

    public String getDateApl() {
        return dateApl;
    }

    public void setDateApl(String dateApl) {
        this.dateApl = dateApl;
    }

    public String getDateEnr() {
        return dateEnr;
    }

    public void setDateEnr(String dateEnr) {
        this.dateEnr = dateEnr;
    }

    public ApplicationOrg getApplicationOrg() {
        return applicationOrg;
    }

    public void setApplicationOrg(ApplicationOrg applicationOrg) {
        this.applicationOrg = applicationOrg;
    }
}
