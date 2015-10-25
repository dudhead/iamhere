/**
 * 
 */
package com.home.iamhere.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.home.iamhere.entity.Place;

/**
 * @author karthik
 *
 */
//@Repository
public interface PlaceRepository extends MongoRepository<Place, ObjectId>{

}
