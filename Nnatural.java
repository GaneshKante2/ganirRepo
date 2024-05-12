public class Nnatural {
    static void Natural(int n){
        if(n==5){
            System.out.print(n);
            return;
        }
     System.out.print(n);
     Natural(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        Natural(n);
    }
    
}
