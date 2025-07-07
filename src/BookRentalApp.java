import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class BookRentalApp {
    
    public static void main (String args [] ) {

        try {

            BufferedReader in = new BufferedReader(new FileReader("book.txt"));
            PrintWriter outBook = new PrintWriter(new BufferedWriter(new FileWriter("bookDetails.txt")));
            outBook.println(String.format("%-25s %-25s %-25s %-25s","FULL TITLE","ISBN","AUTHOR","PRICE PER DAY"));
            outBook.println("------------------------------------------------------------------------------------------------");

            String inData;
            while ((inData = in.readLine()) != null) {
                String[] data = inData.split(";");

                String fullTitle = data[0];
                String fullISBN = data[1];
                String fullAuthor = data[2];
                Double pricePerDay = Double.parseDouble(data[3]);

                outBook.println(String.format("%-25s %-25s %-25s RM%-25s", fullTitle, fullISBN, fullAuthor, pricePerDay));
            }
            in.close();
            outBook.close();

            BufferedReader showOutput = new BufferedReader(new FileReader("bookDetails.txt"));
            String line;
            System.out.println("=== BOOK DETAILS FROM FILE ===");
            while ((line = showOutput.readLine()) != null) {
                System.out.println(line);
            }
            showOutput.close();
            
        }
        catch(FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }

        catch(IOException iox) {
            System.out.println(iox.getMessage());
        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        Scanner input = new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
        
       //STEP 1 : Declare array of object using super class
        Book [] bk = new Book[2];

        //STEP 2 : Instantiate array of object
        for (int i = 0 ; i < 2 ; i++) {

            String fictionNfiction = "";
            String genreId = "";
            String subject = "";
            
            //Additional fee for fiction
            String additionalFee = "";
            //Student discount for non fiction
            String studentDiscount = ""; 

            System.out.println ("");
            System.out.println("Enter fiction or non fiction [0/1]");
            fictionNfiction = input2.nextLine();

            System.out.println ("Enter book title id: ");
            String title = input2.nextLine();

            System.out.println ("Enter name of customer : ");
            String name = input2.nextLine();
            System.out.println ("Enter customer contact number : ");
            String contactNo = input2.nextLine();
            System.out.println ("Enter customer id : ");
            String identification = input2.nextLine();
            System.out.println ("Enter day of renting : ");
            int dayOfRenting = input.nextInt();

            if (fictionNfiction.equalsIgnoreCase("0")) {
                System.out.println ("Enter book genre id: ");
                    genreId = input2.nextLine();
                System.out.println ("Will there be additional fee? [Y/N]");
                    additionalFee = input2.nextLine();
            }
            else if (fictionNfiction.equalsIgnoreCase("1")) {
                System.out.println ("Enter book subject id: ");
                    subject = input2.nextLine();
                System.out.println ("Is the renter a student? [Y/N]");
                    studentDiscount = input2.nextLine();
            }
            
            if (fictionNfiction.equalsIgnoreCase("0")) {
                bk[i] = new Fiction (title, genreId, additionalFee, new Customer(name, contactNo, identification, dayOfRenting));
            }
            else if (fictionNfiction.equalsIgnoreCase("1")) {
                bk[i] = new NonFiction (title, studentDiscount, subject, new Customer(name, contactNo, identification, dayOfRenting));
            }
            System.out.println ("===================================");  
            System.out.println ("           CUSTOMER INFO           ");
            System.out.println ("===================================");

            System.out.println (bk[i]. getCustomer(). toString());
            System.out.println ("===================================");
            System.out.println ("               RECEIPT             ");
            System.out.println ("===================================");

            System.out.println (bk[i]);
            
        }
    }
}
