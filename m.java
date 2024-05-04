import java.util.Scanner;

public class m {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     String arr[]=new String[a];
      int b=0;
     for(int i=0;i<a;i++){
        arr[i]=sc.next();
        b+=arr[i].length();

     }
     System.out.println(b);
     }

    }

