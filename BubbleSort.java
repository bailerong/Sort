public class BubbleSort {
    public static void bubbleSort(int[] a){
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=a.length-1;j>i;j--){
               if(a[j]<a[j-1]){
                   temp=a[j];
                   a[j]=a[j-1];
                   a[j-1]=temp;
               }
            }
        }
    }
    public static void main(String[] args) {
    int[] a={36,25,48,12,25,65,43,57};
    bubbleSort(a);
    for(int i:a){
        System.out.print(i+" ");
    }
        System.out.println("\n");
    }
}
