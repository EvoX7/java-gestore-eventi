package org.generation.italy.eventi;

import java.util.ArrayList;
import java.util.List;

public class Planner {
	private String title;
	private List<Event> events;

	public Planner(String title) {
		
		setTitle(title);
		this.events = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Event> getEvent() {
		return events;
	}

	public void setEvent(List<Event> event) {
		this.events = event;
	}

}
