package kr.ac.kopo.project;

public interface BookListIF {
	public void readAllBook();
	public void writeAllBook();
	public void addBook();
	public void deleteBook();
	public void searchBook();
	public void printBookList();
	public void printBorrowList();
	public void borrowBook(String id);
	public void returnBook(String id);
}
