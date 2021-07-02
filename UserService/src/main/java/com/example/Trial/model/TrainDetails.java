package com.example.Trial.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Train Details")
public class TrainDetails {

	@Id
	private Integer trainNo;
private String trainName;
	private String startStation;
	private String destStation;
	private String arrivalTime;
	
private String deptTime;
private String duration;
	private int noOfSeats;
	
	private Integer firstClassACFare;
	private Integer twoTierAcFare;
	private Integer threeTierAcFare;
	private Integer sleeperFare;
	
	public TrainDetails() {
		super();
	}

	public TrainDetails(Integer trainNo, String trainName, String startStation, String destStation, String arrivalTime,
			String deptTime, String duration, int noOfSeats, Integer firstClassACFare, Integer twoTierAcFare,
			Integer threeTierAcFare, Integer sleeperFare) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.startStation = startStation;
		this.destStation = destStation;
		this.arrivalTime = arrivalTime;
		this.deptTime = deptTime;
		this.duration = duration;
		this.noOfSeats = noOfSeats;
		this.firstClassACFare = firstClassACFare;
		this.twoTierAcFare = twoTierAcFare;
		this.threeTierAcFare = threeTierAcFare;
		this.sleeperFare = sleeperFare;
	}

	public Integer getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(Integer trainNo) {
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

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDeptTime() {
		return deptTime;
	}

	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Integer getFirstClassACFare() {
		return firstClassACFare;
	}

	public void setFirstClassACFare(Integer firstClassACFare) {
		this.firstClassACFare = firstClassACFare;
	}

	public Integer getTwoTierAcFare() {
		return twoTierAcFare;
	}

	public void setTwoTierAcFare(Integer twoTierAcFare) {
		this.twoTierAcFare = twoTierAcFare;
	}

	public Integer getThreeTierAcFare() {
		return threeTierAcFare;
	}

	public void setThreeTierAcFare(Integer threeTierAcFare) {
		this.threeTierAcFare = threeTierAcFare;
	}

	public Integer getSleeperFare() {
		return sleeperFare;
	}

	public void setSleeperFare(Integer sleeperFare) {
		this.sleeperFare = sleeperFare;
	}

	@Override
	public String toString() {
		return "TrainDetails [trainNo=" + trainNo + ", trainName=" + trainName + ", startStation=" + startStation
				+ ", destStation=" + destStation + ", arrivalTime=" + arrivalTime + ", deptTime=" + deptTime
				+ ", duration=" + duration + ", noOfSeats=" + noOfSeats + ", firstClassACFare=" + firstClassACFare
				+ ", twoTierAcFare=" + twoTierAcFare + ", threeTierAcFare=" + threeTierAcFare + ", sleeperFare="
				+ sleeperFare + "]";
	}
	
	
}