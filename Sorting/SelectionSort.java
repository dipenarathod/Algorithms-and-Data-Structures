public class SelectionSort {
    public static void main(String[] args){
        int[] arr={1,8,5,9,10,2,10,9};//Array to be sorted
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }
}

/**
 * Find the index position of the smallest element in the list at or after i
 * and swap the elements at i and the smallest index position
 */
