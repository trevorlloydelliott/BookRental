
public class OrderItem {
    private Book _book;
    private double _price;
    private int _daysRented;

    public OrderItem() { }

    public OrderItem(Book book, double price, int daysRented) {
        _book = book;
        _price = price;
        _daysRented = daysRented;
    }

    public Book getBook() { return this._book; }
    public void setBook(Book book) { _book = book; }

    public double getPrice() { return this._price; }
    public void setPrice(double price) { _price = price; }

    public int getDaysRented() { return this._daysRented; }
    public void setDaysRented(int daysRented) { _daysRented = daysRented; }
}
