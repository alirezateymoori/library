package com.library.first_project;

import com.library.first_project.book.Book;
import com.library.first_project.library.Library;
import com.library.first_project.member.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
		Library library = new Library();

		// Adding books
		Book book1 = new Book("Java Programming", "Author A", "123456");
		Book book2 = new Book("Data Structures", "Author B", "789101");
		library.addBook(book1);
		library.addBook(book2);

		// Adding members
		Member member1 = new Member("John Doe", "M001");
		Member member2 = new Member("Jane Smith", "M002");
		library.addMember(member1);
		library.addMember(member2);

		// Display books
		for (Book book : library.getBooks()) {
			System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
			if (book.getTitle().equals("Java Programming")) {
				library.deleteBook(book.getIsbn());
			}
			System.out.println("library: " + library.getBooks());
		}

		// Display members
		for (Member member : library.getMembers()) {
			System.out.println("Name: " + member.getName() + ", Member ID: " + member.getMemberId());
		}
	}

}
