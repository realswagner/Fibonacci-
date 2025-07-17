public class Printer {
    //method for printing the fibonacci sequence
    public void printFib (int n, long[] fibNumbers){
        System.out.println(n + "番目のFibonacci: " + fibNumbers[n - 1]);
        System.out.print(n + " 番目のフィボナッチ数列: ");
        for (long number : fibNumbers){
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
