public class Main {

    public static void main(String[] args) {






        Audi audi = new Audi("red", "100");
        audi.safety = "good";

       double speed =  audi.getSpeed(60, 100);
       System.out.println("speed = " + speed);

        BMW bmw = new BMW("green", "x3");

        speed =  bmw.getSpeed(60, 100);
        System.out.println("speed = " + speed);





        bmw.economy = "bad";
        bmw.speed = 100;
        /*
        System.out.println(audi.color);
        System.out.println(audi.type);
        audi.speed = 150;


        System.out.println(bmw.color);
        System.out.println(bmw.type);*/


       Shop shop = new Shop(audi);
       System.out.println( audi.safety);

       shop = new Shop(bmw);

        System.out.println( shop.car) ;




    }
}
