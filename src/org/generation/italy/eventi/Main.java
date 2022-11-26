package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Milestone 4
//	    -----------------------------------------------------------------------------------------

		Concert m1 = new Concert("Mariachi Fest\n", LocalDate.now().plusDays(15), 100, LocalTime.now(),
				BigDecimal.valueOf(73d));
		System.out.println(m1);

	}

//		Milestone 3
//		-----------------------------------------------------------------------------------------

//		Planner plan = new Planner("Summer Festival");
//
//		Event e1 = new Event("Rock in Town", LocalDate.now().plusDays(12), 500);
//		Event e2 = new Event("Dance '90", LocalDate.now().plusDays(11), 200);
//		Event e3 = new Event("Cars Exposition", LocalDate.now().plusDays(10), 300);
//		Event e4 = new Event("Jam Session", LocalDate.now().plusDays(10), 100);
//
//		plan.addEvent(e1);
//		plan.addEvent(e2);
//		plan.addEvent(e3);
//		plan.addEvent(e4);
//
//		System.out.println(plan);
//
//		List<Event> tenDaysEvents = plan.getEventsByDate(LocalDate.now().plusDays(10));
//		System.out.println( tenDaysEvents );
//
//		int eventsCount = plan.getEventCount();
//		System.out.println("Numbers of Events: " + eventsCount);
//
//		boolean result = plan.clearEvents();
//		result = plan.clearEvents();
//		System.out.println("Events cancelled: " + result);

//		Milestone 1 & 2
//		-----------------------------------------------------------------------------------------

//		Event event = null;
//
//		Scanner sc = new Scanner(System.in);
//
//		event = new Event("Beautiful Summer", LocalDate.now(), 1000);
//
//		System.out.println("---------------------------");
//		System.out.println("Event created:\n");
//		System.out.println(event + "\n" + "Total event seats: " + event.getTotalSeats() + "\n");
//
//		System.out.print("Do you want to add a reservation [y/n] ");
//		String response = sc.next();
//
//		if (response.equals("y")) {
//			System.out.print("\nHow many seats do you want to book? ");
//			int reservedNumber = sc.nextInt();
//
//			for (int x = 0; x < reservedNumber; x++) {
//				try {
//					event.bookEvent();
//				} catch (Exception e) {
//
//					System.err.println(e.getMessage());
//				}
//
//			}
//		} else {
//			System.out.println("GoodBye, thank you!");
//			System.exit(1);
//
//		}
//
//		System.out.println("---------------------------");
//		int availableSeats = event.getTotalSeats() - event.getReservedSeats();
//		System.out.println("\nYour reserved seats: " + event.getReservedSeats());
//		System.out.println("Total available: " + availableSeats);
//
//		System.out.println("---------------------------");
//		System.out.println("Do you want to cancel a reservations? [y/n] ");
//
//		String response2 = sc.next();
//
//		if (response2.equals("y")) {
//			System.out.println("\nHow many reservations do you want to cancel? ");
//			int canceluserRes = sc.nextInt();
//			for (int x = 0; x < canceluserRes; x++) {
//				try {
//					event.cancelReservation();
//				} catch (Exception e) {
//
//					System.err.println(e.getMessage());
//				}
//
//			}
//		} else {
//			System.out.println("GoodBye, thank you!");
//			System.exit(1);
//
//		}
//		System.out.println("---------------------------");
//		int availableSeats2 = event.getTotalSeats() - event.getReservedSeats();
//		System.out.println("\nYour reserved seats: " + event.getReservedSeats());
//		System.out.println("Total available: " + availableSeats2);
//		sc.close();

//	}
//}

}
