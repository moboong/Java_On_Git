package kr.ac.kopo.project;

public class Book {
	private String title;
	private String author;
	private String borrowId;

	public Book(String title, String author, String borrowId) {
		super();
		this.title = title;
		this.author = author;
		this.borrowId = borrowId;
	}
	
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

	public String getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", borrowId=" + borrowId + "]";
	}
	
}