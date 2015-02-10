/**
 * 
 */
package edu.depaul.armada.service;

import java.util.List;

import edu.depaul.armada.model.AgentContainer;

/**
 * Used to interact with the armada "hub"
 * 
 * @author Paul A. Trzyna
 */
public interface ArmadaService {

	/**
	 * Sends a new AgentContainer instance to armada
	 * 
	 * @param container	container we want to send
	 */
	void send(AgentContainer container);

	/**
	 * Sends a list of new AgentContainers to armada
	 * 
	 * @param containers	containers we want to send
	 */
	void send(List<AgentContainer> container);
}
