public class check_delloitte {
    public static void main(String[] args) {
        int rem;
        int el;
        int sum=0;
        int []arr= {2345, 678, 6789, 567};
        for(int i=0; i< 4; i++){
            if(arr[i]>1000 ){
                rem = arr[i]%1000;
                el = rem/10;
                int wow = el/10;
                int nice = el%10;
                sum = sum +wow + nice;
            }
            else {
                rem = arr[i]%100;
                el= rem/10;
                sum += el;
            }
        }
        System.out.println("The Sum is: " +sum);

    }
    
}
