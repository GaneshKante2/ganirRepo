public class merge {
    void conquer(int arr[],int mid,int si,int ei){
        int merge[]=new int[ei-si+1];
        int id1=si;
        int id2=mid+1;
        int x=0;
        while(id1<=mid && id2<=ei){
            if(arr[id1]<=arr[id2]){
                merge[x]=arr[id1];
                x++;
                id1++;
            }
            else{
                merge[x]=arr[id2];
                x++;
                id2++;

            }
        }
        while(id1<=mid){
            merge[x]=arr[id1];
                x++;
                id1++;

        }
        while(id2<=ei){
            merge[x]=arr[id2];
                x++;
                id2++;

        }
        for(int i=0,j=si;i<merge.length;i++,j++){
            arr[j]=merge[i];

        }
    }
    void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,mid,si,ei);   
        
    }
    public static void main(String[] args) {
        int arr[]={6,2,8,5,3};
        int n=arr.length;
        merge obj=new merge();
        obj.divide(arr, 0, n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
}
