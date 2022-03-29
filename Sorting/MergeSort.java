public class MergeSort {
    int arr[];
    public static void main(String[] args){
        int arrToBeSorted[]={1,5,6,3,2,5,3,8,6,4,1};
        MergeSortArray(arrToBeSorted);
        for(int i=0;i<arrToBeSorted.length;i++)
            System.out.println(arrToBeSorted[i]);
    }
    static void MergeSortedArrays(int arr1[],int arr2[],int arr3[]){
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else{
                arr3[k++]=arr2[j++];
            }
        }
        while(j<arr2.length) {
            arr3[k++] = arr2[j++];
        }
        while(i<arr1.length) {
            arr3[k++] = arr1[i++];
        }
    }

    static void MergeSortArray(int arr[]){
        if(arr.length>1){
            int middleIndex=arr.length/2;
            int arr2[]=new int[middleIndex];
            int arr3[]=new int[arr.length-middleIndex];
            for(int i=0;i<middleIndex;i++)
                arr2[i]=arr[i];
            for(int i=middleIndex;i<arr.length;i++)
                arr3[i-middleIndex]=arr[i];
            MergeSortArray(arr2);
            MergeSortArray(arr3);
            MergeSortedArrays(arr2,arr3,arr);
        }
    }
}
