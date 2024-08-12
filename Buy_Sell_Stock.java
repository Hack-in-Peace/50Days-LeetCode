import java.util.Scanner;
public class Buy_Sell_Stock {
    public static int maxProfit(int[] nums){
        int mini = nums[0];
        int profit = 0;
        for(int i=0;i<nums.length;i++){
            int cost = nums[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, nums[i]);
        }
        return profit;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Array elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i= 0; i<n; i++){
            nums[i]= scanner.nextInt();

        }
        Buy_Sell_Stock bss = new Buy_Sell_Stock();
        int result = bss.maxProfit(nums);

        System.out.println("The max profit: " +result);




    }
    
}
