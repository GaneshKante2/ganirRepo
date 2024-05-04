public class rev {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char a=sb.charAt(front);
            char b=sb.charAt(back);

            sb.setCharAt(front, b);
            sb.setCharAt(back, a);

        }
        System.out.println(sb);


    }
    
}
