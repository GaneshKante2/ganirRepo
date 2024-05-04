public class bubble {
    public static void main(String[] args) {
        
        int arr[]={7,8,3,1,2,2,5,6,8,4};

        for(int j=0;j<arr.length-1;j++){
        for(int i=0;i<arr.length-1-j;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
           

        }
       

    }
    


