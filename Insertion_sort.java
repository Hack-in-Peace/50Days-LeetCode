import java.util.Scanner;

public class Insertion_sort {
    public static void insertion_sort(int[] arr, int n) {
        for(int i=0; i<= n-1; i++){
            int j= i;
            while(j>0 && arr[j-1]> arr[j]){

                int temp= arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }


        
    }  
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        Insertion_sort sorting = new Insertion_sort();
        sorting.insertion_sort(arr, n);

        System.out.println("After Insertion sort, the array is :  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
