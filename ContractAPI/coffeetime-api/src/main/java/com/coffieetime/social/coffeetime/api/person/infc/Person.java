package com.coffieetime.social.coffeetime.api.person.infc;

import com.coffieetime.social.coffeetime.api.common.infc.IdEntity;
import java.util.Date;

/**
 *
 * @author maulik
 */
public interface Person extends IdEntity {
    
    /**
     * 
     * @return 
     */
    public String getFirstName();

    /**
     * 
     * @return 
     */
    public String getLastName();

    
    /**
     * 
     * @return 
     */
    public Date getBirthDate();
    
    /**
     * 
     * @return 
     */
    public String getGender();
    
}
