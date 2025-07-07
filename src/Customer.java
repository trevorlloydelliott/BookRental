public class Customer {
    private String _name;
    private String _contactNumber;
    private String _identification;
    
    public Customer(String name, String contactNumber, String identification) {
        _name = name;
        _contactNumber = contactNumber;
        _identification = identification;
    }

    public String getName() { return _name; }
    public String getContactNumber() { return _contactNumber; }
    public String getIdentification() { return _identification;}

    public String toString() {
        return "Name: " + _name + ", Contact No: " + _contactNumber + ", Id: " + _identification;
    }
}
