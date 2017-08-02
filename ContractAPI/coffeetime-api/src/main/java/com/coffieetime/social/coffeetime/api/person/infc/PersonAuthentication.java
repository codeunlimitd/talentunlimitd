package com.coffieetime.social.coffeetime.api.person.infc;

import com.coffieetime.social.coffeetime.api.common.infc.IdEntity;

/**
 *
 * @author maulik
 */
public interface PersonAuthentication extends IdEntity {
    
    public String getPersonId();
    
    public String getUserId();
    
    public String getEmailId();
    
}
