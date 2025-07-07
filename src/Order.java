import java.time.LocalDateTime;

public class Order {
    private Customer _customer;
    private LocalDateTime _date;
    private List<OrderItem> _items;

    public Order() {
        this._items = new List<OrderItem>();
    }

    public Customer getCustomer() { return this._customer; }
    public void setCustomer(Customer customer) { _customer = customer; }

    public LocalDateTime getDate() { return this._date; }
    public void setDate(LocalDateTime date) { _date = date; }

    public List<OrderItem> getOrderItems() { return this._items; }

    public void addItem(OrderItem item) { _items.add(item); }

    public double getTotalPrice() {
        double total;

        for (int i = 0; i < _items.size(); i++) {
            total += _items[i].getPrice();
        }

        return total;
    }

    public LocalDate getDueDate(OrderItem item) {
        return _date.plusDays(item.getDaysRented());
    }
}

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
    public void setBook(String book) { _book = book; }

    public String getPrice() { return this._price; }
    public void setPrice(double price) { _price = price; }

    public String getDaysRented() { return this._daysRented; }
    public void setDaysRented(int daysRented) { _daysRented = daysRented; }
}
