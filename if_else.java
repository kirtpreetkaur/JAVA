import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n%2 ==0) && (n<5) && (n>2)||(n%2==0)&&(n>20)){
            System.out.println("Not Weird");
        }    
        else{
            System.out.println("Weird");
        }
    }
}
