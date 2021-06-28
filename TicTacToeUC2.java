import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to the TicTacToe simulation");


        char[][] gameBoard= {{' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice of symbol- 1 for 'X' 2 for 'O': ");
        int symbol = sc.nextInt();

        if(symbol == 1){
            System.out.println("Your symbol is: X");
        } else{
            System.out.println("Your symbol is: O");
        }
    }
}
