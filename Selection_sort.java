import java.util.Scanner;

public class Selection_sort {

    public static void selectionsort(int arr[], int n) {
        for(int i=0; i<= n-2; i++){
            int min = i;
            for(int j=i; j<= n-1; j++){
                if(arr[j] < arr[min]){
                    min=j;

                }
                

            }
            swap(arr, i, min);
        }
        
        
    }
    public static void swap(int arr[], int i,int j) {
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        Selection_sort sort = new Selection_sort();
        sort.selectionsort(arr,n);

        System.out.println("After Selection sort, the array is :  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }




    }
}