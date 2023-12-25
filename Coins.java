public class Coins {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
         int quarter = num / 25;
          int cent = num % 25;
          
        System.out.println("Use " + quarter + " quarters " + "and " + cent + " cents");
    }
}