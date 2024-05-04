import java.util.*;


public class Arrays {
   public static void main(String args[]) {
    System.out.println("zero index "+ 10 + 20 +"wow");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
      }
      int x=7;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==x){
                System.out.println(i +" "+ j );

            }
            
        }
        
      }
     
}
}


      