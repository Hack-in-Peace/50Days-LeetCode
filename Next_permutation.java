import java.util.Scanner;

public class Next_permutation {
    public void nextpermutation(int[] nums){
        int ind = -1;
        int n= nums.length;
        for(int i= n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverseArray(nums, 0, n-1);
            return;
        }
        for(int i= n-1; i>= ind; i--){
            if(nums[i] > nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }
        reverseArray(nums, ind+1, n-1);
    }
    private void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:  ");
        int n= scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            nums[i]= scanner.nextInt();
        }
        Next_permutation np= new Next_permutation();
        np.nextpermutation(nums);

        System.out.println("Next permutation is: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }



    
}
