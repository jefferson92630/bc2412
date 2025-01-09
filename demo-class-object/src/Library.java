public class Library {
  private Book[] books;

  public Library() {
    this.books = new Book[0];
  }


  // Search a sub-string of the title
  // What Book object you are going to return?
  public Book[] searchByTitle(String title) { // Didn't change the value of this.books
    int count = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle().contains(title)) 
        count++;
  }

    Book[] books = new Book[count];
    int idx = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getName().contains(title)) 
      books[idx++] = this.books[i];
  }
    return books;
}

  public Book[] getBooks() {
    return this.books;
  }

  public void setBooks(Book[] books) {
    this.books = books;

  }
  public int size() {
    return this.books.length;
  }

  // A library has many books
  // A Book has attributes, title & author
  // The library has functions:
  // 1) add a book, return void
  // 2) removeByTitle, return Book.
  // 3) searchbyTitle, return Book[]

  // Librarian (add/remove), Library(search), Book
  
}











