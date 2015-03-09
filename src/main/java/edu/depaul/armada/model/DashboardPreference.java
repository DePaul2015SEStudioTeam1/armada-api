/**
 * 
 */
package edu.depaul.armada.model;

import java.io.Serializable;

/**
 * DashboardPreference is used to transfer user preferences from the Dashboard to Armada.
 * @author Roland T Craddolph
 *
 */
public class DashboardPreference implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String name;
	public int value;
}
