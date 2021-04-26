public abstract class Book {
    String mBookTitle;
    double mBookPrice;

    public Book (String Title) {
        mBookTitle=Title;
    }

    public String getTitle() {
        return mBookTitle;
    }

    public double getPrice() {

        return mBookPrice;
    }

    public abstract void setPrice();

}
