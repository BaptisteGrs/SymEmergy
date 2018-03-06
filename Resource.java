package fr.ecp.is1220.core;

public abstract class Resource {
	
	//this class defines the basic architecture of a hospital resource (room, health service, personal)
	
	
	//******FIELDS*******
	
	/**
	 * the unique id of a resource
	 */
	protected int idResource;
	//In each subclasses, a counter will define the id of that resource
	
	/**
	 * each resource will have a name
	 */
	protected String name;
	
	/**
	 * true if the resource is available at a given time, false otherwise
	 */
	protected boolean isAvailable;
	
	//******METHODS*******
	
	/**
	 * The resource will take care of a given patient
	 * @param patient
	 */
	public abstract void handlePatient(Patient patient);
	
}
