/**
 * 
 */
package com.home.iamhere.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.home.iamhere.entity.User;

/**
 * @author karthik
 *
 */
//@Repository
public interface UserRepository extends MongoRepository<User, ObjectId>{

}
