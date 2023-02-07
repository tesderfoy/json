package com.example.jsonpostgres.entities;

import javax.persistence.*;

@Entity
@Table(schema ="public", name = "application_org")
public class ApplicationOrg {

    @Id
    @GeneratedValue
    public int id_application_org;
    @OneToOne
    @JoinColumn(name = "fk_first_organisation", referencedColumnName = "id_organisation")
    private Organisation organisationFirst;

    @JoinColumn(name = "fk_second_organisation", referencedColumnName = "id_organisation")
    public Organisation organisationSecond;

    @JoinColumn(name = "fk_third_organisation", referencedColumnName = "id_organisation")
    public Organisation organisationThird;

    public ApplicationOrg() {
    }

    public int getId_application_org() {
        return id_application_org;
    }

    public void setId_application_org(int id_application_org) {
        this.id_application_org = id_application_org;
    }

    public Organisation getOrganisationFirst() {
        return organisationFirst;
    }

    public void setOrganisationFirst(Organisation organisationFirst) {
        this.organisationFirst = organisationFirst;
    }

    public Organisation getOrganisationSecond() {
        return organisationSecond;
    }

    public void setOrganisationSecond(Organisation organisationSecond) {
        this.organisationSecond = organisationSecond;
    }

    public Organisation getOrganisationThird() {
        return organisationThird;
    }

    public void setOrganisationThird(Organisation organisationThird) {
        this.organisationThird = organisationThird;
    }
}
