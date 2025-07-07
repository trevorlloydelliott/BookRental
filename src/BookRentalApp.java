import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class BookRentalApp {
    public static void main(String args[]) {

        ArrayList<Book> bookList = new ArrayList<Book>();
        
        System.out.println("WELCOME TO ADA'S BOOK RENTAL SHOP");
        System.out.println("---");

        try {
            System.out.println("Loading book database...");

            BufferedReader reader = new BufferedReader(new FileReader("src/data/books.csv"));

            String readLine;
            reader.readLine();

            while ((readLine = reader.readLine()) != null) {
                String[] data = readLine.split(",");

                String isbn = data[0];
                String title = data[1];
                String author = data[2];
                String publishedDate = data[3];
                String language = data[4];
                String genre = data[5];
                Double price = Double.parseDouble(data[6]);

                Book book = new Book(isbn, title, author, publishedDate, language, genre, price);
                bookList.add(book);
            }

            reader.close();
        }
        catch(FileNotFoundException fe) {
            handleError(fe.getMessage());
            return;
        }
        catch(IOException iox) {
            handleError(iox.getMessage());
            return;
        }
        catch(Exception e) {
            handleError(e.getMessage());
            return;
        }

        Scanner input = new Scanner(System.in);

        registerCustomer(input);
        
        Order order = new Order();
        int bookId;

        System.out.println("Currently available books:");

        do {
            listBooks(bookList);

            System.out.print("Please choose a book to add to your order, or choose 0 to finish: ");
            bookId = Integer.parseInt(input.nextLine());

            if (bookId == 0) {
                continue;
            }

            if (bookId < 1 || bookId > bookList.size()) {
                System.out.println("Invalid book.");
                continue;
            }

            Book bookToAdd = bookList.get(bookId - 1);

            System.out.print("How many days would you like to rent this book? ");
            int daysToRent = Integer.parseInt(input.nextLine());

            if (daysToRent < 1) {
                System.out.println("You must rent for at least one day.");
                continue;
            }

            order.addItem(new OrderItem(bookToAdd, bookToAdd.getPrice(), daysToRent));

            System.out.println("Added " + bookToAdd.getTitle() + " to order.");
        }
        while (bookId != 0);

        // output details of order
        System.out.println("Total price: " + order.getTotalPrice());

        input.close();
    }

    public static Customer registerCustomer(Scanner input) {
        System.out.println("Please register as a new customer.");
        
        System.out.print("What is your name? ");
        String customerName = input.nextLine();

        System.out.print("What is your contact number? ");
        String contactNumber = input.nextLine();

        System.out.print("What is your identification? ");
        String identification = input.nextLine();

        System.out.println("Thank you for registering.");

        return new Customer(customerName, contactNumber, identification);
    }

    public static void listBooks(ArrayList<Book> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            System.out.println((i + 1) + ": " + book.toString());
        }
    }


    public static void handleError(String message) {
        System.out.println("We're sorry, we are having technical difficulties at the moment. (Error: " + message + ")");
    }
}
