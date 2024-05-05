public class advrecur {
     int ganni(int n){
        if(n==1){
           return 1;
        }
        int a=ganni(n-1);
        int m=n*a;
        return m;
    }
    public static void main(String[] args) {
        advrecur obj=new advrecur();
        int ans=obj.ganni(5);
        System.out.println(ans);
    }
    
}
