import java.util.Scanner;
public class Once_Twice {
    public int singleNumber(int[] nums) {
        int xor =0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }

        Once_Twice cub = new Once_Twice();
        int result = cub.singleNumber(nums);

        System.out.println("The number which appears once , than other numbers twice is: " + result);
        
        }
    }
    

