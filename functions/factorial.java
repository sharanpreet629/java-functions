import java.util.*;

public class factorial {
    
    public static void fact(int num){
        if(num<0){
            System.out.print("Invalid Number");
        }else if(num==0){
            System.out.print("Factorial of "+ num + " is 1");
        }else{
            int fact = 1;
            for(int i =1; i<=num;i++){
                fact = fact*i;
            }
            System.out.print("Factorial of "+ num + " is " + fact);
        }
        
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        fact(num);
        
    }
    
}
