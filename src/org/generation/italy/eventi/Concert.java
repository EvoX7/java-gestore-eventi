package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concert extends Event {

	private LocalTime time;
	private BigDecimal price;

	public Concert(String title, LocalDate date, int totalSeats, LocalTime time, BigDecimal price) {
		super(title, date, totalSeats);

		setTime(time);
		setPrice(price);
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDateTime() {

		return getDate() + " / " + getTime().format(DateTimeFormatter.ofPattern("H:m"));
	}

	public String getPriceFormatted() {

		DecimalFormat decimal = new DecimalFormat("#,###.00€");

		return decimal.format(getPrice());
	}

	@Override
	public String toString() {

		return getTitle() + getDateTime() + " / " + getPriceFormatted();
	}

}
