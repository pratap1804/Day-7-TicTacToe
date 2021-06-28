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

        placeSymbol(gameBoard, pos, "player");

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

    public static void placeSymbol(char[][] gameBoard, int pos, String user) {
        char symbol =' ';

        if(user.equals("player")){
            symbol = 'X';
        }else if(user.equals("cpu")){
            symbol ='O';
        }

        switch (pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
        }

        showBoard(gameBoard);
    }

}
