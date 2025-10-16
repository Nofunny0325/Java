public class GameDemo {
    public static void main(String[] args) {
        Pikachu myPikachu = new Pikachu(100, 27);
        Pikachu yourPikachu = new Pikachu(100, 28);
       // System.out.println("Game start~");
        //myPikachu.attcak(yourPikachu);


        Squirtle yourSquirtle = new Squirtle(120, 21);
        System.out.println("Game start~");
        myPikachu.attcak(yourSquirtle);
        yourSquirtle.attcak(myPikachu);

        System.out.println(yourPikachu);
        System.out.println(yourSquirtle);
    }
}
