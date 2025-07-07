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
    
    public Customer (String name, String contactNo, String identification, int dayOfRenting) {

        this.name = name;
        this.contactNo = contactNo;
        this.identification = identification;
        this.dayOfRenting = dayOfRenting;
    }

    public void setName (String name) { this.name = name; }
    public void setContactNo (String contactNo) { this.contactNo = contactNo; }
    public void setIdentification (String identification) { this.identification = identification; }
    public void setDayOfRenting (int dayOfRenting) { this.dayOfRenting = dayOfRenting; }

    public String getName () { return name; }
    public String getContactNo () { return contactNo; }
    public String getIdentification () { return identification;}
    public int getDayOfRenting () { return dayOfRenting; }

    public String toString () {

        return "\n Name : " +name+ "\n Contact No : " +contactNo+ "\n Id : " +identification+ 
        "\n Days of renting : " +dayOfRenting + "\n";
    }
}
