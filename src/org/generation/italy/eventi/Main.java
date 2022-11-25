package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Event event = null;

		Scanner sc = new Scanner(System.in);

		System.out.print("Welcome to Event Booking System, press ENTER to continue ");
		System.out.println("---------------------------");
		String enter = sc.nextLine();

		System.out.print("Please insert event name: ");
		String eventTitle = sc.nextLine();

		System.out.print("Please insert date for this event (YYYY-MM-DD): ");
		String date = sc.nextLine();
		LocalDate dateEvent = LocalDate.parse(date);

		System.out.print("Please insert alla available seats: ");
		int seats = sc.nextInt();

		try {
			event = new Event(eventTitle, dateEvent, seats);

			System.out.println("---------------------------");
			System.out.println(event + "\n");

		} catch (Exception e) {
			System.err.println(e.getMessage());

		}

		System.out.print("Do you want to add another reservation [y/n] ");
		String response = sc.next();

		if (response.equals("y")) {
			System.out.print("\nHow many reservation do you want to book? ");
			int reservedNumber = sc.nextInt();

			for (int x = 0; x < reservedNumber; x++) {
				try {
					event.bookEvent();
				} catch (Exception e) {

					System.err.println(e.getMessage());
				}

			}
		} else {
			System.out.println("GoodBye, thank you!");
			System.exit(1);

		}

		System.out.println("---------------------------");
		int availableSeats = event.getTotalSeats() - event.getReservedSeats();
		System.out.println("\nTotal Reserved Seats: " + event.getReservedSeats());
		System.out.println("Total available: " + availableSeats);

		System.out.println("-------------------\nDo you want to cancel reservations? [y/n] ");

		String checkforResponse2 = sc.next();

		if (checkforResponse2.equals("y")) {
			System.out.println("\nHow many reservations do you want to cancel ? ");
			int canceluserRes = sc.nextInt();
			for (int x = 0; x < canceluserRes; x++) {
				try {
					event.cancelReservation();
				} catch (Exception e) {

					System.err.println(e.getMessage());
				}

			}
		} else {
			System.out.println("GoodBye, thank you!");
			System.exit(1);

		}
		System.out.println("---------------------------");
		int availableSeats2 = event.getTotalSeats() - event.getReservedSeats();
		System.out.println("\nReserved Seats: " + event.getReservedSeats());
		System.out.println("Total available: " + availableSeats2);
	}
}
