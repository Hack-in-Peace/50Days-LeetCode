import java.util.Scanner;

public class Rearrange_array_by_sign {
    public static int [] reArray(int[] nums){
        int n = nums.length;
        int posIndex = 0;
        int negIndex = 1;
        int [] ans = new int[n];
        for(int i =0; i< n; i++){
            if(nums[i] < 0){
                ans[negIndex] = nums[i];
                negIndex +=2;

            }
            else {

                ans[posIndex] = nums[i];
                posIndex += 2;

            }
        } 
        return ans;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }
        Rearrange_array_by_sign re_array = new Rearrange_array_by_sign();

        int[] result = re_array.reArray(nums);

        System.out.println("The array after rearranging by sign is: "+result);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }



    }
    
}
