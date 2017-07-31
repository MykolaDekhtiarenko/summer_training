package com.mdekhtiarenko.entity;

/**
 * Created by mykola.dekhtiarenko on 28.07.17.
 */
public class Address {
    private String postalCode;
    private String town;
    private String street;
    private String building;

    public Address(){}

    public Address(String index, String town, String street, String building) {
        this.postalCode = index;
        this.town = town;
        this.street = street;
        this.building = building;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postalCode='" + postalCode + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                '}';
    }

}
