package com.dream.caseStudy.repositories;

import com.dream.caseStudy.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	    
}

