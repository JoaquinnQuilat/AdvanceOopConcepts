public class NonFiction extends Book{

    public NonFiction(String Title) {

        super(Title);
        setPrice();
    }

    public void setPrice() {

        super.mBookPrice=37.99;
    }

}