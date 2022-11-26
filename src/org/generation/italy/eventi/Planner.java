package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Planner {

	private String eventTitle;
	private List<Event> events;

	public Planner(String title) {

		setEventTitle(title);
		setEvents(new ArrayList<>());
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String title) {
		this.eventTitle = title;
	}

	public List<Event> getEvents() {
		return events;
	}

	private void setEvents(List<Event> events) {
		this.events = events;
	}

	public void addEvent(Event event) {
		getEvents().add(event);
	}

	public List<Event> getEventsByDate(LocalDate date) {
		List<Event> result = new ArrayList<>();

		for (Event e : getEvents()) {
			result.add(e);

		}
		return result;
	}

	public int getEventCount() {

		return getEvents().size();
	}

	public boolean clearEvents() {

		if (getEventCount() < 1)
			return false;

		getEvents().clear();
		return true;
	}
	
	@Override
	public String toString() {
		
		String res = getEventTitle() + "\n";
		
		for (Event e : getEvents()) 
			res += e.toString() + "\n";
		
		return res;
	}

}
