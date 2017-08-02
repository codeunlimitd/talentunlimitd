package com.coffieetime.social.coffeetime.api.person.dto;

import com.coffieetime.social.coffeetime.api.common.dto.IdEntityInfo;
import com.coffieetime.social.coffeetime.api.person.infc.Person;
import java.util.Date;

/**
 *
 * @author maulik
 */
public class PersonInfo
        extends IdEntityInfo
        implements Person {

    private String firstName;
    private String lastName; 
    private Date birthDate;
    private String gender;

    public PersonInfo(Person person) {
        super(person);
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName(); 
        this.birthDate = person.getBirthDate();
        this.gender = person.getGender();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
