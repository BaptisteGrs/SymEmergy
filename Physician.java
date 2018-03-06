package fr.ecp.is1220.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Physician extends HumanResource implements Observer {
	
	//****FIELDS****
	/**
	 * keeps tracks of all patient currently overseen by the physician
	 */
	private List<Patient> overseenPatients = new ArrayList<Patient>();
	
	/**
	 * keeps tracks of all patient treated by the physician
	 */
	private List<Patient> treatedPatients = new ArrayList<Patient>();
	
	private static int counter = 0;
	
	//****CONSTRUCTOR****
	public Physician(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.idResource = counter;
		counter++;
		this.state = null;
		this.isAvailable = true;
		//this.location = Room couloir;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void handlePatient(Patient patient) {
		System.out.println("The physician "+ this.surname + " " + this.name + " " + 
				this.idResource + " is taking care of " + patient.getSurname() + " " + patient.getName());
		
		//the physician is no longer available
		this.isAvailable = false;
		
		//If the patient is not in the overseenpatients list, 
		//then its a new patient and we need to add it to the list
		if (!this.overseenPatients.contains(patient)) {
			this.overseenPatients.add(patient);
		}
		 
		//What can the physician do ?
		//
		//
		
		
		//creation of event END OF CONSULTATION + EXAM OR RELEASE
	}
	
	
	
	

}
