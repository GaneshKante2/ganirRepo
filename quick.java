public class quick {
    int partition(int[] arr,int low,int high){
        int pt=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pt){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
           
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
        
    }
    void quickSort(int arr[],int low,int high){
        if(low<high){
            int pvoit=partition(arr, low, high);
            quickSort(arr, low, pvoit-1);
            quickSort(arr, pvoit+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,2,8,5,9};
        int n=arr.length;
        quick obj=new quick();
        obj.quickSort(arr, 0, n-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
}
