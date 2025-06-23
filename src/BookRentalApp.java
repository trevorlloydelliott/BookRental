import java.util.*;

public class BookRentalApp {
    
    public static void main (String args [] ) {

        Scanner input = new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
        
       //STEP 1 : Declare array of object using super class
        Book [] bk = new Book[2];

        //STEP 2 : Instantiate array of object
        for (int i = 0 ; i < 2 ; i++) {

            String fictionNfiction = "";
            String gid = "";
            String sb = "";


            System.out.println("Enter fiction or non fiction [0/1]");
            fictionNfiction = input2.nextLine();

            System.out.println ("Enter book title id: ");
            String tt = input2.nextLine();

            if (fictionNfiction.equalsIgnoreCase("0")) {
                System.out.println ("Enter book genre id: ");
                    gid = input2.nextLine();
            }
            else if (fictionNfiction.equalsIgnoreCase("1")) {
                System.out.println ("Enter book subject id: ");
                    sb = input2.nextLine();
            }
            
    
            System.out.println ("Enter name of customer : ");
            String nm = input2.nextLine();
            System.out.println ("Enter customer contact number : ");
            String cn = input2.nextLine();
            System.out.println ("Enter customer id : ");
            String id = input2.nextLine();
            System.out.println ("Enter day of renting : ");
            int dr = input.nextInt();
            
            if (fictionNfiction.equalsIgnoreCase("0")) {
                bk[i] = new Fiction (tt, gid, new Customer(nm, cn, id, dr));
            }
            else if (fictionNfiction.equalsIgnoreCase("1")) {
                bk[i] = new NonFictions (tt, sb, new Customer(nm, cn, id, dr));
            }
            

            System.out.println (bk[i]);
            
        }
    }
}
