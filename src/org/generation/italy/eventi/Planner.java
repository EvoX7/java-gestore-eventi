package org.generation.italy.eventi;

import java.util.ArrayList;
import java.util.List;

public class Planner {
	private String eventTitle;
	private List<Event> eventsProgramme;

	public Planner(String title) {
		
		setEventTitle(title);
		eventsProgramme = new ArrayList<>();
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String title) {
		this.eventTitle = title;
	}

	public List<Event> eventsProgramme() {
		return eventsProgramme;
	}

	public void setEventsProgramme(List<Event> event) {
		this.eventsProgramme = event;
	}

}
