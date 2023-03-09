package com.aikyam.avsar;

public class Jobs {
     private int id;
     private String job_profile;
     private String location;
     private String category;
     private String status;
     private String description;
	
	public Jobs(){
		super();
		this.job_profile=job_profile;
		this.location=location;
		this.category=category;
		this.status=status;
		this.description=description;
	}
	
	public String getjob_profile() {
		return job_profile;
	}
	public void setjob_profile(String job_profile) {
		this.job_profile=job_profile;
	}
	
	
	
	
	public String getlocation() {
		return location;
	}
	public void setlocation(String location) {
		this.location=location;
	}
	
	
	
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category=category;
	}
	
	
	
	
	public String getstatus() {
		return status;
	}
	public void setstatus(String status) {
		this.status=status;
	}
	
	
	
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description=description;
	}
	
	
	
}
