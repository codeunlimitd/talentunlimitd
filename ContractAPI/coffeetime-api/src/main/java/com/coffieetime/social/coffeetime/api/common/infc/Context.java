package com.coffieetime.social.coffeetime.api.common.infc;

import java.util.Date;

/**
 *
 * @author maulik
 */
public interface Context
        extends IdEntity {
    
    
    public String getAuthPrincipalId();
    
    public String getPrincipalId();
    
    public Date getCurrentDate();
    
    

}
