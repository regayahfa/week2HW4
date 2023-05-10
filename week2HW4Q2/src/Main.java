public class Main {
    public static void main(String[] args) {
        MovablePoint obj = new MovablePoint(12,10,15,15);
        System.out.println("x=" +obj.getX());
        System.out.println("y="+obj.getY());
        System.out.println("yspeed="+obj.getySpeed());
        System.out.println("xspeed="+obj.getxSpeed());
        System.out.println("------------------------------------------------------");
obj.moveDown();
obj.moveLeft();
obj.moveright();
obj.moveUP();

        System.out.println("x=" +obj.getX());
        System.out.println("y="+obj.getY());
        System.out.println("yspeed="+obj.getySpeed());
        System.out.println("xspeed="+obj.getxSpeed());
    }}
