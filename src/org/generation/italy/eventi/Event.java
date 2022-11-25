package org.generation.italy.eventi;

import java.time.LocalDate;

public class Event {

	private String title;
	private LocalDate date;
	private int totalSeats;
	private int reservedSeats = 0;

	public Event(String title, LocalDate date, int totalSeats) throws Exception {

		setTitle(title);
		setDate(date);
		this.totalSeats = totalSeats;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) throws Exception {
		if (date.isBefore(LocalDate.now())) {
			throw new Exception("Not a valid date, please restart the process");
		}
		this.date = date;
	}

	public int getTotalSeats() {

		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) throws Exception {
		if (totalSeats <= 0) {
			throw new Exception("Negative values are forbidden");
		}
		this.totalSeats = totalSeats;
	}

	public int getReservedSeats() {
		return reservedSeats;
	}

//	Methods

	public void bookEvent() throws Exception {
		if (reservedSeats == totalSeats || date.isBefore(LocalDate.now())) {
			throw new Exception("Sorry, you cannot book event/seats not available");
		}
		reservedSeats++;

	}

	public void cancelReservation() throws Exception {
		if (reservedSeats == 0 || date.isBefore(LocalDate.now())) {

			throw new Exception("System error, please insert a valid number");
		}
		reservedSeats--;

	}
	

	@Override
	public String toString() {
		return "Title: " + getTitle() + "\nDate : " + getDate();
	}

}
