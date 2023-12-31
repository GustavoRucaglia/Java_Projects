package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainExceptions;

public class Program {
	
	public static void main(String[] args){
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.println("Room number:");
			int numberRoom = tcd.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy");
			Date checkIn = sdf.parse(tcd.next());
			System.out.println("Check-out date (dd/MM/yyyy");
			Date checkout = sdf.parse(tcd.next());
			
	
			System.out.println("error in reservation: Check-out must be after check-in date ");
	
			Reservation reservation = new Reservation(numberRoom, checkIn, checkout);
			System.out.println(reservation);
				
			System.out.println("\n Enter to update the reservation: ");
			System.out.println("Check-in date (dd/MM/yyyy)");
			Date checkInU = sdf.parse(tcd.next());
			System.out.println("Check-out date (dd/MM/yyyy)");
			Date checkoutU = sdf.parse(tcd.next());
				
			reservation.updateDates(checkInU, checkoutU);
			System.out.println(reservation);
		}
		catch(ParseException e) {
			System.out.println("Invalid date format"); 
		}catch(DomainExceptions e) {
			System.out.println("Error in reservation: " + e);
		}

		tcd.close();
	}
}
