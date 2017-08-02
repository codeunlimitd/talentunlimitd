package com.coffieetime.social.coffeetime.api.person.service;

import com.coffieetime.social.coffeetime.api.person.dto.PersonInfo;

/**
 *
 * @author maulik
 */
public interface PersonService {
    
    
    PersonInfo getPerson(String personId);
    
}
