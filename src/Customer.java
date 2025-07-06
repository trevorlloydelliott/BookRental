public class Customer {
    
    private String name;
    private String contactNo;
    private String identification;
    private int dayOfRenting;

    public Customer () {

        name = "";
        contactNo = "";
        identification = "";
        dayOfRenting = 0;

    }
    
    public Customer (String nm, String cn, String id, int dr) {

        name = nm;
        contactNo = cn;
        identification = id;
        dayOfRenting = dr;
    }

    public void setName (String nm) { name = nm; }
    public void setContactNo (String cn) { contactNo = cn; }
    public void setIdentification (String id) { identification = id; }
    public void setDayOfRenting (int dr) { dayOfRenting = dr; }

    public String getName () { return name; }
    public String getContactNo () { return contactNo; }
    public String getIdentification () { return identification;}
    public int getDayOfRenting () { return dayOfRenting; }

    public String toString () {

        return "\n Name : " +name+ "\n Contact No : " +contactNo+ "\n Id : " +identification+ 
        "\n Days of renting : " +dayOfRenting + "\n";
    }
}
