import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to the TicTacToe simulation");


        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice of symbol- 1 for 'X' 2 for 'O': ");
        int symbol = sc.nextInt();

        chooseSymbol(symbol);

        showBoard(gameBoard);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Placements (1-9)");
        int pos = scan.nextInt();
        System.out.println(pos);

    }

    public static void chooseSymbol(int symbol) {


        if (symbol == 1) {
            System.out.println("Your symbol is: X");
        } else {
            System.out.println("Your symbol is: O");
        }
    }

    public static void showBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placeSymbol(char[][] gameBoard, int pos) {
        switch (pos) {
            case 1:
                gameBoard[0][0] = 'X';
                break;
            case 2:
                gameBoard[0][2] = 'X';
                break;
            case 3:
                gameBoard[0][4] = 'X';
                break;
            case 4:
                gameBoard[2][0] = 'X';
                break;
            case 5:
                gameBoard[2][2] = 'X';
                break;
            case 6:
                gameBoard[2][4] = 'X';
                break;
            case 7:
                gameBoard[4][0] = 'X';
                break;
            case 8:
                gameBoard[4][2] = 'X';
                break;
            case 9:
                gameBoard[4][4] = 'X';
                break;
        }

        showBoard(gameBoard);
    }

}
