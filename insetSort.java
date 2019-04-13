public class insetSort {
    public static void insertSort(int[] a){
        if(a!=null){
            for(int i=1;i<a.length;i++){
                int temp=a[i];
                int j=i;
                if (a[j - 1] > temp) {
                    while(j>=1&&a[j-1]>temp) {
                        a[j] = a[j - 1];
                        j--;
                    }
                }
               a[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
    int[]a={38,65,97,76,13,27,49};
    insertSort(a);
    for(int i:a){
        System.out.print(i+" ");
    }
        System.out.println("\n");
    }
}
