public class Prog1 {

    public static void main(String[] args) {
     int x = RandomNumbers.getRandomInt(1, 9);
     int y = RandomNumbers.getRandomInt(3, 14);
     System.out.println("π power x = "+ Math.pow(Math.PI, x));
     System.out.println("y power π = "+ Math.pow(y, Math.PI));
    }

}
