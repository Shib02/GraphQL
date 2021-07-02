package com.example.Trial.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Trial.model.TrainDetails;
@Repository
public interface UserRepository extends MongoRepository<TrainDetails, Integer> {

}
