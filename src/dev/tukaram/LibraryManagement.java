package dev.tukaram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class LibraryManagement {
	
	private static void addBook(Map book) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Book Details  ");
		System.out.println("Enter Book Name  ");
		String name = sc.nextLine();
		
		System.out.println("Enter Author Name  ");
		String author = sc.nextLine();
		
		System.out.println("Enter Year of  Publications  ");
		int yearofPublications = sc.nextInt();
		
		System.out.println("Enter Available Stocks ");
		int avaliableStock = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter your Gener	TECHNOLOGY,/HORROR,/MEDICAL,/MYTHOLOGY,/LAW,/ROMANTIC");
		
		String input = sc.nextLine();
		
		String sanitizedInput = input.trim().toUpperCase(); 
		Gener gener = Gener.valueOf(sanitizedInput);
		
		Book newBook = new Book(name,author,yearofPublications,avaliableStock,gener);
			
		book.put(Book.generateBookId(), newBook);
		
	}
	
	private static void dispalyBook() {
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mainChoice =  0;
		
		final int ADD_BOOK = 1;
		final int DISPLAY_BOOK = 2;
		final int HASCODE_BOOK = 3;
		final int EQUALS_BOOK = 4;
		
		Map <Integer, Book> books = new HashMap<>();
		
		
		
		
		do {
			
			System.out.println("1.Add Book\n2.Disaply\n3.HashCode\n4.Equals\n5Exit\nEnter Main Choice");
			
			mainChoice = sc.nextInt();
			
			switch(mainChoice) {
			
			case ADD_BOOK:

			 addBook(books);
			 
				
				break;
			
			case DISPLAY_BOOK:
			
			    System.out.println(books);
				
				break;
				
			case HASCODE_BOOK:
				
				break;
			
			case EQUALS_BOOK:
				Book book = new Book("java","james",1994,120,Gener.HORROR);
				
				Book book1 = new Book("java","james",2004,120,Gener.LAW);
				
				Book book2 = new Book("java","james",2004,120,Gener.LAW);
				
				System.out.println(book2.equals(book1));
				
				break;
				
			default:
				System.out.println("Wrong Choice ");
				break;
			
			
			}
			
		}while(mainChoice != 5);

	}

}
