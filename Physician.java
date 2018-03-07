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
	
	/**
	 * this function is called at the beginning of an event "Beginning of consultation"
	 */
	@Override
	public void handlePatient(Patient patient) {
		System.out.println("The physician "+ this.surname + " " + this.name + " " + 
				this.idResource + " is taking care of " + patient.getSurname() + " " + patient.getName());
		
		//the physician is no longer available
		this.isAvailable = false;
		
		//*****CREATION OF A FUTURE EVENT : END OF CONSULTATION**** ???
		
		//If the patient is not in the overseenpatients list, 
		//then its a new patient and we need to add it to the list
		if (!this.overseenPatients.contains(patient)) {
			this.overseenPatients.add(patient);
		}
		 
		//What can the physician do ?
		//We use a random number to define the outcome of the consultation
		double alea = (Math.random())*100;
		if (alea < 35) {
			/*35% of no test required : the patient is released (or hospitalized but in either case
			it leaves the Emergency Department )*/
			patient.setState(StatePatient.released); // not sure if it has to be here or in the event RELEASE
			overseenPatients.remove(patient);
			treatedPatients.add(patient);
		}
		
		if ((35<alea) && (alea<55)){
			// 20% chance of needing a radiography
			//CREATION OF EVENT RADIOGRAPHY TEST
		}
		
		if ((55<alea) && (alea<95)){
			// 40% chance of needing a blood test
			//CREATION OF EVENT BLOOD TEST
		}
		
		if (alea>94){
			// 5% chance of needing a blood test
			//CREATION OF EVENT BLOOD TEST
		}
		
		//creation of event END OF CONSULTATION + EXAM OR RELEASE
	}
	
	
	
	

}
