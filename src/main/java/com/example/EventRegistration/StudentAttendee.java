package com.example.EventRegistration;

public class StudentAttendee implements Attendee {

    /*
    1. Create the following attributes:
        a. name (String)
        b. batch (int)
        c. department (String)
    2. Make this class an implementation of Attendee interface and override the interface methods.
    */
	String name;
	int batch;
	String department;

    // This method sets the details of the Attendee.
    public void setAttendeeDetails(String name, String department, int batch) {
    	this.name=name;
    	this.department=department;
    	this.batch=batch;
    }

    /* This method prints the Registration Confirmation
        For example, if the Attendee's name is John, the confirmation statement is as follows:
        Hi John, your registration for the Graduation Ceremony is successful
     */
    public void printRegistrationConfirmation() {
    	System.out.println("Hi "+this.name+", your registration for Graduation Ceremony is successful");
    }

    // This method returns the Attendee's name.
   public String getAttendeeName() {
    	return this.name;
    }

}
