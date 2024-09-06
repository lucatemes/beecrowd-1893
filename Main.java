import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int lua1= in.nextInt();
        int lua2= in.nextInt();

        if (lua2 >= 0 && lua2 <= 2) {
         System.out.println("nova");
        } else if (lua2 >= 97 && lua2 <= 100) {
         System.out.println("cheia");
        } else if (lua2 > lua1) {
         System.out.println("crescente");
        } else {
         System.out.println("minguante");
        }
    }
}