package Examples;

class Library {
    String[] books;
    int noOfBooks;

    Library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }
    void addBook(String book) {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added");
    }
    void showAvailableBooks() {
        int availableBooks = 0;
        for (String book : this.books) {
            if (book != null) {
                availableBooks++;
            }
        }
        System.out.println("Available Books are : " + availableBooks);
        for (String book : this.books) {
            if (book == null)  {
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println(book + " - book has been issued.");
                this.books[i] = null;
                return;
            }
        }
    }
    void returnBook(String book) {
        this.books[noOfBooks] = book;
    }
}


public class LibraryExample {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Think and Grow");
        lib.addBook("Python Programming");
        lib.addBook("C language");
        //lib.showAvailableBooks();
        //lib.noOfBooks;
        //System.out.println(lib.noOfBooks);
        lib.issueBook("C language");
        lib.showAvailableBooks();
        lib.returnBook("Java");
        lib.showAvailableBooks();
    }
}
