import java.util.Scanner;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        int i=0;
        int n = nums.length;
        for(int j=0; j<n; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }

        }
        return (i+1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        
        System.out.println("Enter the array elements: ");
        for(int j=0; j<n;j++){
            nums[j] = scanner.nextInt();
        }
        RemoveDuplicates remove = new RemoveDuplicates();
        int result = remove.removeDuplicates(nums);

        System.out.println("After removing the duplicates The array is: " + result);
        System.out.println("The modified array is: ");
        for (int k = 0; k < result; k++) {
            System.out.print(nums[k] + " ");
        }

    }
    
}
