package com.coffieetime.social.coffeetime.api.common.dto;
  
import com.coffieetime.social.coffeetime.api.common.infc.IdEntity;



/**
 *
 * @author maulik
 */
public class IdEntityInfo implements IdEntity {
    
    private String id;
    
    private String name;
    
    private String typeKey;
    
    private String stateKey;

    public IdEntityInfo(IdEntity idEntity) {
        this.id = idEntity.getId();
        this.name = idEntity.getName();
        this.stateKey = idEntity.getName();
        this.typeKey = idEntity.getTypeKey();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }
     
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTypeKey() {
        return typeKey;
    }

    @Override
    public String getStateKey() {
        return stateKey;
    }
    
    
    
    
}
