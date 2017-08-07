package com.mdekhtiarenko.entity;

import com.mdekhtiarenko.entity.enums.Group;
import com.mdekhtiarenko.exeptions.NicknameAlreadyExists;

/**
 * Created by mykola.dekhtiarenko on 28.07.17.
 */
public class Record {
    private String lastName;
    private String firstName;
    private String middleName;
    private String nickname;
    private String comment;
    private Group group;
    private String mobilePhoneNumber;
    private String landlinePhoneNumber;
    private String additionalMobilePhoneNumber;
    private String email;
    private String skype;

    private Address address;

    public Record(){}

    public Record(String lastName, String firstName, String middleName, String nickname, String comment, Group group, String mobilePhoneNumber, String landlinePhoneNumber, String additionalMobilePhoneNumber, String email, String skype) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.landlinePhoneNumber = landlinePhoneNumber;
        this.additionalMobilePhoneNumber = additionalMobilePhoneNumber;
        this.email = email;
        this.skype = skype;
    }

    public String getSignature(){
        String signature = this.lastName + " " + this.firstName.charAt(0) + ".";
        return signature;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname, boolean isNotInNotebook) throws NicknameAlreadyExists {
        if(isNotInNotebook)
            this.nickname = nickname;
        else throw new NicknameAlreadyExists();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getLandlinePhoneNumber() {
        return landlinePhoneNumber;
    }

    public void setLandlinePhoneNumber(String landlinePhoneNumber) {
        this.landlinePhoneNumber = landlinePhoneNumber;
    }

    public String getAdditionalMobilePhoneNumber() {
        return additionalMobilePhoneNumber;
    }

    public void setAdditionalMobilePhoneNumber(String additionalMobilePhoneNumber) {
        this.additionalMobilePhoneNumber = additionalMobilePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Record{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", landlinePhoneNumber='" + landlinePhoneNumber + '\'' +
                ", additionalMobilePhoneNumber='" + additionalMobilePhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                '}';
    }


}
