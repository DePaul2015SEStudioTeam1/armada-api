package edu.depaul.armada.model;


/**
 * @author ptrzyna, john davidson, jplante
 *
 */
public class Container {
	
	private String name;
	private String containerUniqueId;
	private String CAdvisorURL;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContainerUniqueId() {
		return containerUniqueId;
	}

	public void setContainerUniqueId(String containerUniqueId) {
		this.containerUniqueId = containerUniqueId;
	}

	public String getCAdvisorURL() {
		return CAdvisorURL;
	}

	public void setcAdvisorURL(String CAdvisorURL) {
		this.CAdvisorURL = CAdvisorURL;
	}

}
