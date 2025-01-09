public class Librarian {
  private String name;
  private Library library;


  // Librarian -> library
  // Library -> Librarian
  public Librarian (Library library) {
    this.library = library;
  }

  // addBook()

  public void addBook(Book book) {
    Book[] books = new Book [this.library.size() + 1];
    for (int i = 0; i < this.library.size(); i++) {
      books[i] = this.library.getBooks()[i];
    }
      books[books.length - 1] = book;
      this.library.setBooks(books);
  }

  // removeByTitle()

  // Assume remove the first book with same title
  // 1. Remove the item
  // 2. Return removed item
  public Book removeByTitle(String title) {
    Book targetRemoveBook = null;
    int targetRemoveIndex = -1;
    for (int i = 0; i < this.library.size(); i++) {
      if (this.library.getBooks()[i].getTitle().equals(title)) {
        targetRemoveBook = this.library.getBooks()[i];
        targetRemoveIndex = i;
        break;
      }
    }
    if (targetRemoveIndex != -1) { // book found
      Book[] books = new Book [this.library.size() - 1];
      int idx = 0;
      for (int i = 0; i < this.library.size(); i++) {
        if (i != targetRemoveIndex) // or if (i == targetRemoveIndex), then continue
        books[idx++] = this.library.getBooks()[i];
      }
      this.library.setBooks(books);
    }
    return targetRemoveBook; // if not found, return null
  }


  public static void main(String[] args) {
    // 3 layers
    // Book
    // Library
    // Librarian

    Library lb1 = new Library();
    Librarian lbn = new Librarian(lb1);
    lbn.addBook(new Book("ABC", "Tommy"));
    lbn.addBook(new Book("DEF", "Jenny"));
    lbn.addBook(new Book("ABCD", "Jimmy"));
  
    for (Book book: lb1.getBooks()) {
      System.out.println(book.getTitle() + " " + book.getAuthor());
    }
    for (Book book : lb1.searchByTitle("BC")) {
      System.out.println(book.getTitle() + " " + book.getAuthor());
    }
  
    Book targetRemoveBook = lbn.removeByTitle("DEF");
    System.out.println(targetRemoveBook.getTitle() + " " + targetRemoveBook.getAuthor()); // DEF Jenny
    System.out.println(lb1.size()); // 2
    }
  }

