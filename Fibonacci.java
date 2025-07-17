public class Fibonacci {
    public long[] generateNumbers(int n){
        long fibNumbers[] = new long[n];
        fibNumbers[0] = 0;
        if(n >= 1){ //updated to check for 0 output
            fibNumbers[0] = 0;
        }
        if(n >= 2){ //continue setting sequence
            fibNumbers[1] = 1;
        }

        for (int i = 2; i < n; i++){ 
            fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i - 2];
        }

        return fibNumbers; //return fibonacci array
    }
}