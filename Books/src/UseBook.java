public class UseBook {

    public static void main (String[] args) {
        Book bks;
        bks = new Fiction ("Percy Jackson");
        System.out.println("Book: " + bks.getTitle() + " is $" + bks.getPrice());
        bks = new NonFiction ("Hiroshima");
        System.out.println("Book: " + bks.getTitle() + " is $" + bks.getPrice());

    }

}
