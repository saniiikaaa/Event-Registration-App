package com.example.EventRegistration;

import java.util.ArrayList;
import java.util.List;

public class GraduationCeremonyEvent implements CollegeEvent {

    /*
    1. Create the following attributes:
        a. name (initialize it as "Graduation Ceremony".
        b. address (String)
        c. time (String)
        d. date (String)
        e. count (int) (initially 0)
        f. eventAttendees (List of Attendee)
        NOTE: Initialize the address, time and date attributes with some values.
    2. Inject Attendee with attribute name "attendee" with setter injection.
    3. Make this class an implementation of CollegeEvent interface and override the interface methods.
    */

	String name="Graduation Ceremony";
	String address="Auditorium";
	String time="10AM";
	String date="12 Nov 2023";
	int count=0;
	ArrayList<Attendee> eventAttendees;
	Attendee attendee;
    
    /*
       This method registers attendee for the ceremony i.e. it adds the
       attendee to the eventAttendees list and increases the AttendeeCount attribute
       which is the count of attendee attending the event.
     */
	public GraduationCeremonyEvent() {
		eventAttendees=new ArrayList<Attendee>();
	}
    public void registerStudent(Attendee user) {
    	eventAttendees.add(user);
    }

    /*
        This method returns the list af attendees.
     */
   public List<Attendee> getAllAttendees(){
	   return eventAttendees;
   }


    /*
    This method prints the event details.
    For example: "The Graduation Ceremony details are as follows:
                 Venue: Auditorium
                 Time: 10AM
                 Date: 12 Nov 2023"
     */
    public void printEventDetails() {
    	System.out.println("The "+this.name+" details are as follows:\nVenue:"+this.address+"\n"+"Time:"+this.time+"\n"+"Date:"+this.date);
    }

    // This method returns the attendeeCount.
    public int getAttendeeCount() {
    	return eventAttendees.size();
    }

    // This method sets the attendee.
    public void setAttendee(Attendee attendee) {
    	this.attendee=attendee;
    }
	
}
