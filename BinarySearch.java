import java.util.Scanner;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int n= nums.length;
        for(int i= 0; i< n; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of  elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the target number : ");
        int target = scanner.nextInt();

        BinarySearch bs = new BinarySearch();
        int result = bs.search(nums,target);
        

        if(result != -1){
            System.out.println("Target number found at index: " + result);
        }
        else {
            System.out.println("Target number not found.");
        }
        scanner.close();




    }
    
}
