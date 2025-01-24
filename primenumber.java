import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        int c=0;
        int t=0;
        
        for(int i=2; i<Math.sqrt(a); i++){
            t++;
            
            if(a%i==0){
                System.out.println(i);
               c++;
                
            }}
        if(c>0){
            System.out.println(a+ " is  not prime number");
        }
        else{
            System.out.println(a+ " iS prime");
        }
        System.out.println("number of time loop is running is " +(t*t));
            
            
    }
}
