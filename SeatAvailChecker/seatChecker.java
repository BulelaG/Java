package SeatAvailChecker;
import java.util.Scanner;

public class seatChecker {
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        //your code goes here

        // Input for row and column
        System.out.print("Enter row number: ");
        int row = sc.nextInt();
        System.out.print("Enter column number: ");
        int col = sc.nextInt();
        
        // Check if the seat is free or sold
        if (seats[row][col] == 0) {
            System.out.println("Free");
        } else {
            System.out.println("Sold");
        }
        
        // Close the scanner
        sc.close();


    }

}

