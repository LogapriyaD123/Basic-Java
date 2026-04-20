import java.util.Scanner;
public class Forloop{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int sum = 0;
          for(int i=1;i<=10;i++)
    if(i%3==0)
    sum+=i;
             System.out.println(sum);
           }
        
    }