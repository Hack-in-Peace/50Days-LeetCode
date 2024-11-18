public class Checksum {
    public static void main(String[] args) {
        int rem;
        int el;
        int sum = 0;
        int []arr ={3562,6597,2345,1598};
        for(int i=0; i< 4; i++){
            rem = arr[i]%1000;
            el = rem/10;
            sum += el;
        }
        System.out.println("The Sum is: " +sum);
    
    }
    
    
}
