package ui.pages;

import base.ProjectSpecificMethods;

public class viewLeadPage extends ProjectSpecificMethods{
	
	public viewLeadPage() {
		
	}
	
	public viewLeadPage verifyLeadId() {
		System.out.println(driver.getTitle());
		return this;
	}

}
