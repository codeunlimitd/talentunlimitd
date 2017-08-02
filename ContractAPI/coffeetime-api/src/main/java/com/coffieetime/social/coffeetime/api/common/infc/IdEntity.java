package com.coffieetime.social.coffeetime.api.common.infc;

/**
 *
 * @author maulik
 */
public interface IdEntity {
    
    /**
     * Unique identity key of each object
     * @return 
     */
    public String getId();
    
    /**
     * Name of the object
     * @return 
     */
    public String getName();
    
    /**
     * Type key of the object
     * @return 
     */
    public String getTypeKey();
    
    /**
     * StateKey of the object
     * @return 
     */
    public String getStateKey();
    
}
