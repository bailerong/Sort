public class quickSort {
    public static void sort(int[] a,int left,int right){
    int index;
    if(left>=right){
        return ;
    }
    int i=left;
    int j=right;
    index=a[i];
    while(i<j){
        while(i<j&&a[j]>=index)
            j--;
        if(i<j){
            a[i]=a[j];
        }

        while(j>i&&a[i]<=index)
            i++;
        if(i<j){
            a[j]=a[i];
        }

    }
    a[i]=index;
    sort(a,left,i-1);
    sort(a,i+1,right);
    }

    public static void main(String[] args) {
int[] a={9,8,7,6,5,4,3,2,1,0};
sort(a,0,a.length-1);
for(int i:a){
    System.out.print(i+" ");
}
    }
}
