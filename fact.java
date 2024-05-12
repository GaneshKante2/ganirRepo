public class fact {
    static int a=0,b=1,c=0;
    static void fiboncci(int n){
        if(n>0){
            c=a+b;
            System.out.print(c);
            a=b;
            b=c;
            fiboncci(n-1);
        }
    }
        public static void main(String[] args) {
            int n=7;
            System.out.print(a+""+b);

            fiboncci(n-2);
    }
}
