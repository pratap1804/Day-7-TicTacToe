import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

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



        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Your Placements (1-9)");
            int playerPos = scan.nextInt();

            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)) {
                System.out.println("Position Taken");
                playerPos=scan.nextInt();
            }


            placeSymbol(gameBoard, playerPos, "player");

            String result =checkWinner();
            if(result.length()>0) {
                System.out.println(result);
                break;
            }



            int cpuPos = (int)Math.floor(Math.random() % 9 +1);

            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
                cpuPos = (int)Math.floor(Math.random() % 9 +1);
            }
            placeSymbol(gameBoard, cpuPos, "cpu");

            result =checkWinner();
            if(result.length()>0) {
                System.out.println(result);
                break;
            }

        }

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
            playerPositions.add(pos);
        }else if(user.equals("cpu")){
            symbol ='O';
            cpuPositions.add(pos);
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


    public static String checkWinner() {

        List topRow =   Arrays.asList(1,2,3);
        List midRow =   Arrays.asList(4, 5, 6);
        List botRow =   Arrays.asList(7, 8, 9);
        List leftCol =  Arrays.asList(1, 4, 7);
        List midCol =   Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 =   Arrays.asList(1, 5, 9);
        List cross2 =   Arrays.asList(7, 5, 3);



        List <List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);



        for(List l: winning) {
            if(playerPositions.containsAll(l)) {
                return "Congratulations You Have Won!";
            }else if(cpuPositions.containsAll(l)) {
                return " Sorry You Lost!";
            } else if(playerPositions.size()+ cpuPositions.size()==9 ) {
                return "Its A Draw!";
            }
        }
        return "";
    }
}
