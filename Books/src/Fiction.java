public class Fiction extends Book{

    public Fiction(String Title) {

        super(Title);
        setPrice();
    }

    public void setPrice() {

        super.mBookPrice=24.99;
    }

}
