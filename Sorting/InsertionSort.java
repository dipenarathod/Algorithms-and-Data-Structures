public class InsertionSort {
    public static void main(String[] args){
        int arr[]={4,0,1,9,8,2,3,7,5,6};
        for(int i=1;i<arr.length;i++){
            int value_at_i=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>value_at_i){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=value_at_i;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
/**
 * Big O=n^2. Big Omega=n
 * Treats array as a smaller array of size 2 and then builds up to array od size n-1
 * We store the value of array at index position i. Our inner loop starring j, starts at i-1.
 * The while loop condition requires j to be non-negative and the value at j to be greater than the value at i. This shows that values are in non-decreasing order.
 * If the above conditions are satisfied, the value at the index position one higher than j, is replaced by the value at j.
 * j is then decremented by 1. If another iteration happens, value at index position one higher than j is replaced by value at j.
 * After the while loop is done executing, all elements till i have been sorted. We then set the value at j+1 to be the value at i.
 * If the list is already sorted, the while loop would have never executed, and j+1 would be equal to i.
 * Otherwise, j+1 would be the index position starting from which the elements have been sorted and j+1 would have the same value as j+2. We need to set it to the smallest
 * element, that is, value_at_i.
 * In our example:
 * First iteration:
 * value_at_i=arr[1]=0, arr[j]=4. 4>0, so in loop: arr[j+1]=arr[1]=4,j=0-1=-1. The loop is then dissatisfied.
 * arr[-1+1]=value_at_i=0. arr[0=0,arr[1]=4
 * Second iteration:arr={0,4,1,9,8,2,3,7,5,6}
 * value_at_i=arr[2]=1, arr[j]=arr[1]=4.4>1, so in loop:
 * arr[j+1]=arr[2]=arr[j]=arr[1]=4
 * now j=j-1=0. arr[0]=0<value_at_i, therefore loop breaks.
 * arr[j+1]=arr[1]=value_at_i=1
 * Now arr={0,1,4,9,8,2,3,7,5,6}
 */
