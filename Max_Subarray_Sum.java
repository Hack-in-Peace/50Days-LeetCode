import java.util.Scanner;
public class Max_Subarray_Sum {
    public static int maxSub_array_sum(int[]  nums){
        int sum = 0;
        int maxi = nums[0];
        for (int i=0; i< nums.length; i++){
            sum += nums[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }
        
        Max_Subarray_Sum ans = new Max_Subarray_Sum();
        int result = ans.maxSub_array_sum(nums);

        System.out.println("The largest sum of the subarray is : "+result);

    }
    
}
