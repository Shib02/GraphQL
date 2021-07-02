package com.example.TrialAdmin.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.TrialAdmin.model.TrainDetails;
@Repository
public interface AdminRepository extends MongoRepository<TrainDetails, Integer>{

}
