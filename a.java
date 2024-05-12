import java.util.*;

public class a {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size=sc.nextInt();
                int [] ganni=new int [size];
                System.out.println("neter vales");
                for(int i=0;i<size;i++){
                    ganni[i]=sc.nextInt();
                }
                
                int max=Integer.MIN_VALUE;
                int min =Integer.MAX_VALUE;
                

               for(int i=0;i<size;i++){
               if(ganni[i]<min){
                min=ganni[i];
               }
               if(ganni[i]>max){
                max=ganni[i];
               }
               
               }
               System.out.println("yhe large is"+max);
               System.out.println(min);
        }
      }   
      
    }
    

