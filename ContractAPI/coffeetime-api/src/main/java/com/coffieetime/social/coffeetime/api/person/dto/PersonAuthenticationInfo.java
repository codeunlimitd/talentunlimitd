package com.coffieetime.social.coffeetime.api.person.dto;

import com.coffieetime.social.coffeetime.api.common.dto.IdEntityInfo;
import com.coffieetime.social.coffeetime.api.person.infc.PersonAuthentication;

/**
 *
 * @author maulik
 */
public class PersonAuthenticationInfo
        extends IdEntityInfo
        implements PersonAuthentication {

    private String personId;
    private String userId;
    private String emailId;

    public PersonAuthenticationInfo(PersonAuthentication personAuthentication) {
        super(personAuthentication);
        this.personId = personAuthentication.getPersonId();
        this.userId = personAuthentication.getUserId();
        this.emailId = personAuthentication.getEmailId();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
