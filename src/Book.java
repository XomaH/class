public class Book {
    private String bookName;
    private Author Author;
    private int publicData;

    public Book(int publicData, Author author, String bookName) {
        this.publicData = publicData;
        Author = author;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return Author;
    }

    public int getPublicData() {
        return publicData;
    }

    public void setPublicData(int publicData) {
        this.publicData = publicData;
    }
}

