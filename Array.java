public class Array {
    public static void main(String[] args) {
       int[] arr = {10, 45, 67 ,23, 56, 68, 90, 87, 98};
       int n = arr.length;
       for(int i = 0; i<n; i++){
        if(arr[i]<35){
            System.out.print(i + " ");
        }
       }
       System.out.println();
        int[] a = new int[26];
        int b =a.length;
        for( int i =0; i<b; i++){
            System.out.print(a[i]+" ");
        }

    }
}
