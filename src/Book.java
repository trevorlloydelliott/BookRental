public class Book {
    private String _isbn;
    private String _title;
    private String _author;
    private String _publishedDate;
    private String _language;
    private String _genre;
    private double _price;

    public Book(String isbn, String title, String author, String publishedDate, String language, String genre, double price) {
        _isbn = isbn;
        _title = title;
        _author = author;
        _publishedDate = publishedDate;
        _language = language;
        _genre = genre;
        _price = price;
    }

    public String getIsbn() { return _isbn; }
    public String getTitle() { return _title; }
    public String getAuthor() { return _author; }
    public String getPublishedDate() { return _publishedDate; }
    public String getLanguage() { return _language; }
    public String getGenre() { return _genre; }
    public double getPrice() { return _price; }

    public String toString() {
        return "ISBN: " + _isbn + ", Title: " + _title + ", Author: " + _author + ", PublishedDate: " + _publishedDate +
            ", Language: " + _language + ", Genre: " + _genre + ", Price: " + _price;
    }
}
