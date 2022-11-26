package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Main {

	public static void main(String[] args) {

		Event event = null;

		Scanner sc = new Scanner(System.in);

		try {
			event = new Event("Beautiful Summer", LocalDate.now(), 1000);

			System.out.println("---------------------------");
			System.out.println("Event created:\n");
			System.out.println(event + "\n" + "Total event seats: " + event.getTotalSeats() + "\n");

		} catch (Exception e) {
			System.err.println(e.getMessage());

		}

		System.out.print("Do you want to add a reservation [y/n] ");
		String response = sc.next();

		if (response.equals("y")) {
			System.out.print("\nHow many seats do you want to book? ");
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
		System.out.println("\nYour reserved seats: " + event.getReservedSeats());
		System.out.println("Total available: " + availableSeats);

		System.out.println("---------------------------");
		System.out.println("Do you want to cancel a reservations? [y/n] ");

		String response2 = sc.next();

		if (response2.equals("y")) {
			System.out.println("\nHow many reservations do you want to cancel? ");
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
		System.out.println("\nYour reserved seats: " + event.getReservedSeats());
		System.out.println("Total available: " + availableSeats2);
		sc.close();
	}

}
