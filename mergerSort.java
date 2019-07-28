public class mergerSort {
    public static void Merge(int[] a,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] L=new int[n1];//我们的左区间数组；
        int[] R=new int[n2];//我们的右区间数组；
        int i,j,k;
        //为我们的左数组赋值
        for( i=0,k=left;i<n1;i++,k++){
            L[i]=a[k];
        }
        //为我们的右数组赋值
        for( i=0,k=mid+1;i<n2;i++,k++){
            R[i]=a[k];
        }

        for(k=left,i=0,j=0;i<n1&&j<n2;k++) {
            if (L[i] > R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
        }
        //将我们剩下的进行放入我们的a数组中
        if(i<n1){
            for(j=i;j<n1;j++,k++)
                a[k] = L[j];
        }
        if(j<n2){
            for(i=j;i<n2;i++,k++){
                a[k]=R[i];
            }
        }
    }
    public static void MergerSort(int[] a,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            MergerSort(a,left,mid);
            MergerSort(a,mid+1,right);
            Merge(a,left,mid,right);
        }
    }

    public static void main(String[] args) {
    int[] a={0,1,2,3,4,5,6,7,8,9};
    int len=a.length;
    MergerSort(a,0,len-1);
    for(int i:a){
        System.out.print(i+" ");
    }
    }
}
