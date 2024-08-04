import java.util.Arrays;
import java.util.Scanner;
public class TwoSum_2Pointer {
    public static int[] twosum(int n, int []arr , int target){
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;

        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                return new int[] { left, right };
            }
            else if (sum < target){
                left++;
            }
            else {
                right--;
            }
        }
        return new int[] {}; 
    

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        int[] result = twosum(n,arr, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
        scanner.close();
    }
    
}
