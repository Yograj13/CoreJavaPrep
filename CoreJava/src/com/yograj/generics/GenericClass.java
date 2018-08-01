package com.yograj.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Car> carList = new ArrayList<>();
		carList.add(new Car());
		carList.add(new Car());
		RentVehicle<Car> rentVehicleList = new RentVehicle(carList, 2, 30);
		System.out.println(rentVehicleList.getTotalRent(2, 30));
	}
	
}

class RentVehicle<T>{
	
	List<T> listOfRentedVehile;
	int numberOfVehicle;
	int rent;
	RentVehicle(List<T> listOfRentedVehile,int numberOfVehicle, int rent){
		this.listOfRentedVehile=listOfRentedVehile;
		this.numberOfVehicle=numberOfVehicle;
		this.rent=rent;
	}
	public int getTotalRent(int numberOfVehicle, int rent) {
		return numberOfVehicle*rent;
	}
}

class Car{
	
}






