package com.library.first_project.library;

import com.library.first_project.book.Book;
import com.library.first_project.member.Member;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // CRUD operations for Books
    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void updateBook(String isbn, String newTitle, String newAuthor) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                break;
            }
        }
    }

    public void deleteBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    // CRUD operations for Members
    public void addMember(Member member) {
        members.add(member);
    }

    public List<Member> getMembers() {
        return members;
    }

    public void updateMember(String memberId, String newName) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                member.setName(newName);
                break;
            }
        }
    }

    public void deleteMember(String memberId) {
        members.removeIf(member -> member.getMemberId().equals(memberId));
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", members=" + members +
                '}';
    }
}
