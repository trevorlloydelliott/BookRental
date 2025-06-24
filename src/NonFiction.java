public class NonFiction extends Book{
//i am testing this thing out
    private String subject;
    private String studentDiscount;

    public NonFiction () {

        super();
        subject = "";
        studentDiscount = "";
    }

    public NonFiction (String tt, String sb, String sd, Customer cust) {

        super (tt, cust);
        subject = sb;
        studentDiscount = sd;
    }

    public void setSubject (String sb) { subject = sb; }
    public void setStudentDiscount (String sd) { studentDiscount = sd; }
    public String getSubject () { return subject; }
    public String getStudentDiscount () { return studentDiscount; }

    public double calcDiscountFee () {

        double studDis = 0.0;

        if (studentDiscount.equalsIgnoreCase("Y"))
            studDis = super.calcTotal() * 0.3;
        else if (studentDiscount.equalsIgnoreCase("N"))
            studDis = 0;

        return studDis;
    }

    public double calcTotalNonFiction () {

        double totalNonFiction = 0.0;
        
        totalNonFiction = super.calcTotal() - calcDiscountFee();

        return totalNonFiction;
    }

    public String FullSubject () {

        String fullSubject = "";

        if (subject.equalsIgnoreCase("PHY"))
            fullSubject = "PHYSICS";
        else if (subject.equalsIgnoreCase("BM"))
            fullSubject = "BAHASA MELAYU";

        return fullSubject;
    }

    public String toString () {

        return super.toString() + "\n Total fiction : RM" + calcDiscountFee() + "\n Grand Total : RM" +calcTotalNonFiction() + "\n Subject : " + FullSubject();
    }
}
