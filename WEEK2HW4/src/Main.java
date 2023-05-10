public class Main {
    public static void main(String[] args) {
         Movie M1=new Movie("park",100.0,"ACITON");
         System.out.println(M1.getName());
         System.out.println(M1.getPrice());
        System.out.println( M1.getDirector());
        System.out.println( M1.getDiscount(10.0));

         M1.setDirector("horror");
         M1.setName("garden");
         M1.setPrice(120.0);

        System.out.println(M1.getName());
        System.out.println(M1.getPrice());
        System.out.println( M1.getDirector());

        System.out.println( "-----------------------------BOOK-------------------------------");

         BOOK B1=new BOOK("KATY",100.0,"MOON");

        System.out.println(B1.getName());
        System.out.println(B1.getPrice());
        System.out.println( B1.getAuthor());
        System.out.println( B1.getDiscount(5.0));

        B1.setAuthor("NOVELS");
        B1.setName("SOUL");
        B1.setPrice(180.0);

        System.out.println(B1.getName());
        System.out.println(B1.getPrice());
        System.out.println( B1.getAuthor());







    }
}