/**
 * 
 */
package edu.depaul.armada.service;

import java.util.List;

import edu.depaul.armada.model.ContainerLog;

/**
 * Used to interact with the armada "hub"
 * 
 * @author Paul A. Trzyna
 */
public interface ArmadaService<Container> {

	/**
	 * Inserts a new Container instance or updates the existing one
	 * if it already exists.
	 * 
	 * @param container	container we want to save/update
	 */
	void store(Container container);
	
	/**
	 * Inserts a new ContainerLog instance
	 * 
	 * @param ContainerLog instance we want to insert
	 */
	void store(ContainerLog containerLog);
	
	/**
	 * All containers with given
	 * 
	 * @return list of logs matching container id
	 */
	List<ContainerLog> getAll(String containerId);
	
	/**
	 * Used to paginate results
	 * 
	 * @param id	id of last first container in the page
	 * @param count	number of items in the page
	 * @return list of containers representing a page
	 */
	List<Container> get(long id, int count);
	
	/**
	 * Gets all containers in the database
	 * 
	 * @return list of containers in the db
	 */
	List<Container> getAll();
	
}
