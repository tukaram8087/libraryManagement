package dev.tukaram;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Book {

	String name;
	String author;
	int yearofpublication;
	int availbalestock;
	Gener generic;
	
	private static AtomicInteger idGenerator = new AtomicInteger(1);
	
	public static int generateBookId() {
		return idGenerator.getAndIncrement();
	}
	
	

	public Book(String name, String author, int yearofpublication, int availbalestock, Gener generic) {
		super();
		this.name = name;
		this.author = author;
		this.yearofpublication = yearofpublication;
		this.availbalestock = availbalestock;
		this.generic = generic;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearofpublication() {
		return yearofpublication;
	}

	public void setYearofpublication(int yearofpublication) {
		this.yearofpublication = yearofpublication;
	}

	public int getAvailbalestock() {
		return availbalestock;
	}

	public void setAvailbalestock(int availbalestock) {
		this.availbalestock = availbalestock;
	}

	public Gener getGeneric() {
		return generic;
	}

	public void setGeneric(Gener generic) {
		this.generic = generic;
	}


	@Override
	public int hashCode() {
		return Objects.hash(author, availbalestock, generic, name, yearofpublication);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && availbalestock == other.availbalestock
				&& generic == other.generic && Objects.equals(name, other.name)
				&& yearofpublication == other.yearofpublication;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", yearofpublication=" + yearofpublication
				+ ", availbalestock=" + availbalestock + ", generic=" + generic + "]";
	}

	
}
