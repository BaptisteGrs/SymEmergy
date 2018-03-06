package fr.ecp.is1220.core;

public class HumanResource extends Resource {
	
	/**
	 * the surname of this person
	 */
	protected String surname;
	
	/**
	 * the current state of this person
	 */
	protected StateResource state;
	
	/**
	 * the current room of this person
	 */
	private Room location;

	@Override
	public void handlePatient(Patient patient) {
		// TODO Auto-generated method stub

	}

}
