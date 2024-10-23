import java.util.Scanner;

public class Bubble_sort {
    public static void bubble_sort(int[] arr, int n) {
        for(int i=n-1; i>= 1; i--){
            for(int j=0; j<= i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n= scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        Bubble_sort sorttt = new Bubble_sort();
        sorttt.bubble_sort(arr, n);

        System.out.println("After Bubble, the array is :  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
    
}
