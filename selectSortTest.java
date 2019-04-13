public class selectSortTest {
    public static void selectSort(int[] a){
        int min=0;
        int flag=0;//我们的最小元素的位置

        for(int i=0;i<a.length;i++){
            min=a[i];
            flag=i;
            for(int j=i+1;j<a.length;j++){
                if(min>a[j]){
                 min=a[j];
                 flag=j;
                }

            }
            if(flag!=i){
             a[flag]=a[i];
             a[i]=min;
            }
        }

    }

    public static void main(String[] args) {
        int a[]={38,65,97,76,13,27,49};
        selectSort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
}
