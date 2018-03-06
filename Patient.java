package fr.ecp.is1220.core;

import java.time.LocalTime;
import java.util.Hashtable;
import java.util.Observable;

public class Patient extends Observable{
	
	//FIELDS
	
	/**
	 * the name of the patient
	 */
	private String name;
	
	/**
	 * the surname of the patient
	 */
	private String surname;
	
	/**
	 * to count the number of patients
	 */
	private static int counter;
	
	/**
	 * the id of the patient
	 */
	private int idPatient;
	
	/**
	 * the insurance policy of the patient
	 */
	private Insurance insurance;
	
	/**
	 * the severity level of the patient
	 */
	private Severity severity;
	
	/**
	 * the current state of the patient
	 */
	private StatePatient state;
	
	/**
	 * the arrival time of the patient
	 */
	private LocalTime time;
	
	/**
	 * the amount the patient will have to pay
	 */
	private double cost = 0;
	
	/**
	 * the current location of the patient
	 */
	//private Room location;
	
	/**
	 * the list of all the events that the patient has been through
	 */
	//private Hashtable<LocalTime,Event> history;

	
	//CONSTRUCTORS
	
	public Patient() {
		super();
	}
	
	public Patient(String name, String surname, Insurance insurance, Severity severity, StatePatient state) {
		super();
		this.name = name;
		this.surname = surname;
		this.insurance = insurance;
		this.severity = severity;
		this.state = state;
		this.idPatient = counter;
		counter++;
		this.time = LocalTime.now();
	}

	
	//GETTERS AND SETTERS
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public StatePatient getState() {
		return state;
	}

	public void setState(StatePatient state) {
		this.state = state;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public static int getCounter() {
		return counter;
	}

	//METHODS
	
	//addHistory
	//addCost;
	
}
