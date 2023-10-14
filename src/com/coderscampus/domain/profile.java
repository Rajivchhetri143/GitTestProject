 package com.coderscampus.domain;

 import java.time.LocalDate;
 
 
 /**
  * Branches
  * main/master -> represents the code that"s actually live on the internet (ie coderscampus.com)
  * UAT
  *QA
  *development
  *
  * 
  * Environments
  * Production -> main/master  
  *UAT (not typical)
  *QA
  *Dev
  */
 public class profile {
  private Integer id;
  private String profileName;
  private LocalDate getcreatedDate;
 
  public LocalDate getCreatedDate() {
	  return createdDate;
}
public  void setId(Integer id) {
	this.id = id;
}
public String getProfileName() {
	 return profileName;
  }
  public void setProfileNameStringName(String name) {
   this.profileName = name;
  }
}
