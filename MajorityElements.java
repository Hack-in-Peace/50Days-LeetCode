import java.util.Scanner;
public class MajorityElements {
    public int majorElement(int[] nums){
        int cnt =0;
        int el = 0;
        for(int i=0; i<nums.length;i++){
            if(cnt == 0){
                cnt =1;
                el= nums[i];
            }
            else if(nums[i] == el){
                cnt++;
            }
            else {
                cnt--;
            }
        }
        int cnt1= 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == el){
                cnt1++;
            }
        }
        if(cnt1 > (nums.length/2)) {
            return el;
        }
        return -1;
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

        MajorityElements major = new MajorityElements();
        int result = major.majorElement(nums);

        if(result != -1){
            System.out.println("The Majority Element is :  " + result);
        }
        else {
            System.out.println("No Majority Elements found!");
        }
        scanner.close();
    }
    
}
