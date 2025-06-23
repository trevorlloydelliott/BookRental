public class NonFictions extends Book{
//i am testing this thing out
    private String subject;

    public NonFictions () {

        super();
        subject = "";
    }

    public NonFictions (String tt, String sb, Customer cust) {

        super (tt, cust);
        subject = sb;
    }

    public void setSubject (String sb) { subject = sb; }
    public String getSubject () { return subject; }

    public String getFullSubject () {

        String fullSubject = "";

        if (subject.equalsIgnoreCase("PHY"))
            fullSubject = "PHYSICS";
        else if (subject.equalsIgnoreCase("BM"))
            fullSubject = "BAHASA MELAYU";

        return fullSubject;
    }

    public String toString () {

        return super.toString() + "\n Subject : " + getFullSubject();
    }
}