import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer _customer;
    private LocalDateTime _date;
    private ArrayList<OrderItem> _items;

    public Order() {
        this._items = new ArrayList<OrderItem>();
    }

    public Customer getCustomer() { return this._customer; }
    public void setCustomer(Customer customer) { _customer = customer; }

    public LocalDateTime getDate() { return this._date; }
    public void setDate(LocalDateTime date) { _date = date; }

    public ArrayList<OrderItem> getOrderItems() { return this._items; }

    public void addItem(OrderItem item) { _items.add(item); }

    public double getTotalPrice() {
        double total = 0.0;

        for (int i = 0; i < _items.size(); i++) {
            total += _items.get(i).getPrice();
        }

        return total;
    }

    public LocalDateTime getDueDate(OrderItem item) {
        return _date.plusDays(item.getDaysRented());
    }
}
