package com.example.EventRegistration;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class EventRegistrationApplication {

	public static void main(String[] args) {
		// Import scanner and take ClassPathXmlApplicationContext.
		String name="";
		String department="";
		int batch;
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to the Graduation Ceremony Registration Application");
		// Take the college event bean from the application context.
		
		CollegeEvent event = (CollegeEvent) context.getBean("event");
		// Print the event details.
       event.printEventDetails();
       
		while (true) {
			StudentAttendee student=(StudentAttendee) context.getBean("student");
			System.out.println("Do you want to register for the ceremony\n1. Yes\n2. No");
			int input = scanner.nextInt();
			if (input == 1) {
				/*
				 1. Take attendee details from the console.
				 2. Get studentAttendee bean from context and set the attendee details
				 3. Register the attendee for the event.
				 4. Print the registration confirmation.
				 */
				System.out.println("Please enter your name");
				scanner.nextLine();
				name=scanner.next();
				
				
				System.out.println("Please enter your department");
				scanner.nextLine();
				department=scanner.next();
				
				
				System.out.println("In which year did you pass out?");
				batch=scanner.nextInt();
				
				student.setAttendeeDetails(name, department, batch);
				event.setAttendee(student);
				event.registerStudent(student);
				student.printRegistrationConfirmation();

			} else if(input == 2) {
				break;
			} else {
				System.out.println("Invalid Choice");
				return;
			}
		}

		// Get the number of attendees and print along with the statement below
		System.out.println("No. of attendees registered are: " + event.getAttendeeCount());
		System.out.println("The list of attendees are:");
		// Print all the attendee names with their reference ids as given in the sample output..
        for(int i=0;i<event.getAttendeeCount();i++)
        {
        	System.out.println(event.getAllAttendees().get(i).getAttendeeName()+"  Reference id: "+event.getAllAttendees().get(i).getAttendeeName().toString());
        }
	}

}
