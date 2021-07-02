package com.example.Booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.Booking.Repo.UserRepository;
import com.example.Booking.entity.UserDetails;





@Service
public class BookingService implements GraphQLQueryResolver, GraphQLMutationResolver {
	
	@Autowired
	private UserRepository userRepo;
	
	int id;
	
	public List<UserDetails> getAll() {
		return userRepo.findAll();
	}
	

	public UserDetails getUserDetailsById(long pnrNo) {
		List<UserDetails> userDetails=userRepo.findAll();
		for(UserDetails x:userDetails) {
			if(x.getPnrNo()==pnrNo) {
				id=x.getId();
			}	
		}
		return userRepo.findById(id)
				.orElseThrow();	
	}
	
	//Mutation 
	
	public UserDetails deleteUserBookingDetails(long pnrNo) {
		List<UserDetails> userDetails=userRepo.findAll();
		for(UserDetails x:userDetails) {
				if(x.getPnrNo()==pnrNo) {
					id=x.getId();
				}	
		}
		UserDetails existingDetails=userRepo.findById(id)
					.orElseThrow();
		userRepo.delete(existingDetails);
		return existingDetails;
		}
	
	public UserDetails addUserBookingDetails(int id,long pnrNo,String name,int age,String sex,String address,
			int trainNo, String trainName, String startStation, String destStation,String classType,int adults,
			int children,String payment) {
		UserDetails ud = new UserDetails();
		ud.setId(id);
		ud.setPnrNo();
		ud.setName(name);
		ud.setAge(age);
		ud.setSex(sex);
		ud.setAddress(address);
		ud.setTrainNo(trainNo);
		ud.setTrainName(trainName);
		ud.setStartStation(startStation);
		ud.setDestStation(destStation);
		ud.setClassType(classType);
		ud.setAdults(adults);
		ud.setChildren(children);
		ud.setPayment("pending");
		userRepo.save(ud);	
		return ud;
	}
	


}
