package org.totalbeginner.tutorial;

public class Book {

	public String title;
	public String author;
	private Person person;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(String string) {
		this.title = string;
		this.author = "Unknown Author";
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return this.person;
	}

}
