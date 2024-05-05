public class recursion {
    void print(int n,  int sum){
        if(n==5){
            sum+=n;
            System.out.print(sum);
            return;
        }
    sum+=n;
    print(n+1,sum);
    }
    public static void main(String[] args) {
        recursion obj=new recursion();
        obj.print(1,  0);     
    }
    
}
