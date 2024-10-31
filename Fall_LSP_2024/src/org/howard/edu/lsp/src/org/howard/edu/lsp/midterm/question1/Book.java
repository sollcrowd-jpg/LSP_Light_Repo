package org.howard.edu.lsp.midterm.question1;

public class Book {
    // Fields to store book information
    private String title, author, ISBN;
    private int yearPublished;

    // Constructor to initialize a Book object
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getter methods to access private fields
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public int getYearPublished() { return yearPublished; }

    // Override equals method to compare books based on ISBN and author
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (!(obj instanceof Book)) return false; // Check if obj is a Book
        Book other = (Book) obj; // Typecast obj to Book
        return ISBN.equals(other.ISBN) && author.equals(other.author); // Compare ISBN and author
    }

    // Override toString method to return a meaningful string representation of the Book object
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}