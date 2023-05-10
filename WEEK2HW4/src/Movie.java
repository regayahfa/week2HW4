public class Movie extends product{
    private String disector;

    public Movie(){

    }

    public Movie(String disector) {

        this.disector = disector;
    }

    public Movie(String name, double price, String disector) {
        super(name, price);
        this.disector = disector;
    }
    public String getDirector() {

        return disector;
    }
    public void setDirector(String disector) {
      this.disector=disector;
    }
    double getDiscount(double discout){
return super.getDiscount(discout);
    }
}
