package com.example.jsonpostgres.entities;

import javax.persistence.*;

@Entity
@Table(schema ="public", name = "family")
public class Family {
    @Id
    @GeneratedValue
    public int id_family;



    @ManyToOne
    @JoinColumn(name = "fk_person_kid", referencedColumnName = "id_person")
    private Person personKid;

    @ManyToOne
    @JoinColumn(name = "fk_person_parent_one", referencedColumnName = "id_person")
    private Person personParentOne;

    @ManyToOne
    @JoinColumn(name = "fk_person_parent_two", referencedColumnName = "id_person")
    private Person personParentTwo;

    public Family() {
    }


    public int getId_family() {
        return id_family;
    }

    public void setId_family(int id_family) {
        this.id_family = id_family;
    }

    public Person getPersonKid() {
        return personKid;
    }

    public void setPersonKid(Person personKid) {
        this.personKid = personKid;
    }

    public Person getPersonParentOne() {
        return personParentOne;
    }

    public void setPersonParentOne(Person personParentOne) {
        this.personParentOne = personParentOne;
    }

    public Person getPersonParentTwo() {
        return personParentTwo;
    }

    public void setPersonParentTwo(Person personParentTwo) {
        this.personParentTwo = personParentTwo;
    }
}
