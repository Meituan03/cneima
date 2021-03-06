package com.yc.cinema.entity;

import java.io.Serializable;

public class FilmBean implements Serializable {

	private static final long serialVersionUID = -3599431521998130260L;
	private String filmname;
	private String typeid;
	private String actor;
	private String director;
	private String minprice;
	private String maxprice;
	private String ticketprice;

	public String getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(String ticketprice) {
		this.ticketprice = ticketprice;
	}

	public String getFilmname() {
		return filmname;
	}

	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}

	public String getTypeid() {
		return typeid;
	}

	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getMinprice() {
		return minprice;
	}

	public void setMinprice(String minprice) {
		this.minprice = minprice;
	}

	public String getMaxprice() {
		return maxprice;
	}

	public void setMaxprice(String maxprice) {
		this.maxprice = maxprice;
	}

	@Override
	public String toString() {
		return "FilmBean [filmname=" + filmname + ", typeid=" + typeid + ", actor=" + actor + ", director=" + director
				+ ", minprice=" + minprice + ", maxprice=" + maxprice + ", ticketprice=" + ticketprice + "]";
	}

}
