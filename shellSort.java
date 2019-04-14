public class shellSort{
    public static void shellSort(int[] a){
    int gap=3;
    int temp=0;
    int i=0,j=0;
    for(gap=3;gap>0;gap--){
        for( i=gap;i<a.length;i++){
            temp=a[i];
            for( j=i-gap;j>=0;j-=gap){
            if(temp<a[j]){
                a[j+gap]=a[j];
            }
          else
              break;
             }
             a[j+gap]=temp;
            }
        }
    }


    public static void main(String[] args) {

int []a={5,3,4,7,3,4};
shellSort(a);
for(int i:a){
    System.out.print(i+" ");
}
    }
}
