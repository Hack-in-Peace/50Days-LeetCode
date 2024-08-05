import java.util.Scanner;
public class Sort_0_1_2 {
    public void sortColors(int []nums){
        int low =0; 
        int mid = 0;
        int high = nums.length - 1;
        
        while(mid < high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements(only 0 , 1 , 2s): ");
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }
        Sort_0_1_2 sortt = new Sort_0_1_2();
        sortt.sortColors(nums);

        System.out.println("Sorted array: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }



    }
    
}
