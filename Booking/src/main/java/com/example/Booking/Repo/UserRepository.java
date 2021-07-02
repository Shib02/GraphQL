package com.example.Booking.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.Booking.entity.UserDetails;


//Dao Layer
@Repository
public interface UserRepository extends MongoRepository<UserDetails, Integer>
{

	

}
