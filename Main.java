import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in); //scanner setup
        Fibonacci fib = new Fibonacci(); //fibonacci sequence object creation
        Printer printer = new Printer(); //initialize printing method for use in main

        while(true){
            System.out.println("Enter N (<=70) or 'quit/exit' to stop");
            String input = scan.nextLine();
            //input from scanner
            if(input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit")){
                //method for exiting program
                System.out.println("stopping program");
                break;
            }

            try {
                int n = Integer.parseInt(input);
                if(n < 1 || n > 70){
                    System.out.println("Please enter between 1 or 70");
                    continue;
                }

                long[] fibNumbers = fib.generateNumbers(n);
                printer.printFib(n, fibNumbers);
            } catch(NumberFormatException e){
                //checks for whole integer input
                System.out.println("invalid input, please enter whole number or quit 'quit/exit'");
            }
        }
        scan.close();
        //scanner close program finished
    }
}