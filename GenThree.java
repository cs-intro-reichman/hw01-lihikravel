public class GenTree {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int range = b - a;
        
        int randomNumber1 = (int)(Math.random() * (range)) + a ;
        int randomNumber2 = (int)(Math.random() * (range)) + a ;
        int randomNumber3 = (int)(Math.random() * (range)) + a ;
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
        int x= 0;

        int mid = Math.min(randomNumber1, randomNumber2);
        int min = Math.min(mid, randomNumber3); 
        System.out.println("The minimal generated number was " + min);
          
    }
}