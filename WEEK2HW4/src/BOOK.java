public  class BOOK extends product{
    private String author;

    public BOOK(){

    }

    public BOOK(String author) {
        this.author = author;
    }

    public BOOK(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    double getDiscount(double discout){
        return super.getDiscount(discout);
    }


}
