package com.example.Booking.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "userDetails")
public class UserDetails 
{

	
	@Id
	private int id;
	private long pnrNo;
	private String name;
	private int age;
	private String sex;
	private String address;
	private int trainNo;
	private String trainName;
	private String startStation;
	private String destStation;
	private String classType;
	private int adults;
	private int children;
	private String payment;

	public UserDetails() {
		super();
	}

	

	public UserDetails(int id, long pnrNo, String name, int age, String sex, String address, int trainNo,
			String trainName, String startStation, String destStation, String classType, int adults, int children,
			String payment) {
		super();
		this.id = id;
		this.pnrNo = pnrNo;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.startStation = startStation;
		this.destStation = destStation;
		this.classType = classType;
		this.adults = adults;
		this.children = children;
		this.payment = payment;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPnrNo() {
		return pnrNo;
	}


	public void setPnrNo() {			// 0 to 1
		long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		this.pnrNo = number;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getDestStation() {
		return destStation;
	}

	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", pnrNo=" + pnrNo + ", name=" + name + ", age=" + age + ", sex=" + sex
				+ ", address=" + address + ", trainNo=" + trainNo + ", trainName=" + trainName + ", startStation="
				+ startStation + ", destStation=" + destStation + ", classType=" + classType + ", adults=" + adults
				+ ", children=" + children + ", payment=" + payment + "]";
	}
	
	
}