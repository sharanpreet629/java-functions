package functions;

import java.util.Scanner;

public class basic {

    public static float multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        System.out.print(multiply(a, b));
        
    }
    
}
