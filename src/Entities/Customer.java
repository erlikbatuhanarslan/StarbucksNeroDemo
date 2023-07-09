package Entities;

import Abstract.Entity;

public class Customer implements Entity {

    private int id;
    private String FirstName;
    private String LastName;
    public int DOB;
    public String NationalityId;


    public Customer(int id, String firstName, String lastName, int dOB, String nationalityId) {
        super();
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        DOB = dOB;
        NationalityId = nationalityId;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public int getDOB() {
        return DOB;
    }
    public void setDOB(int dOB) {
        DOB = dOB;
    }
    public String getNationalityId() {
        return NationalityId;
    }
    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }

}