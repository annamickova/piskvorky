import java.util.Arrays;
import java.util.Scanner;

public class Game {

    private String[] field;
    private String player;
    private Style style;

    public Game() {
        this.field = new String[9];
        this.style = new Style();
        init();
    }

    private String[] init(){
        field[0] = "1";
        field[1] = "2";
        field[2] = "3";
        field[3] = "4";
        field[4] = "5";
        field[5] = "6";
        field[6] = "7";
        field[7] = "8";
        field[8] = "9";
        return field;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String intro(){
        return "welcome in tic tac toe" + style.boardEmpty();
    }

    public void choose(String player){
        Scanner sc = new Scanner(System.in);
        int answer;
        System.out.println("player " + player);
        System.out.println("choose your characters placement");
        answer = sc.nextInt();
        System.out.println(style.displayBoard(answer-1, field, player));
        if (!field[answer-1].equals("X") && player.equals("O")){
            field[answer-1] = player;
        }if (!field[answer-1].equals("O") && player.equals("X")){
            field[answer-1] = player;
        }
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i]);
        }

    }

    public void start(){
       System.out.println(intro());

       while (!victory("X", "O")){
           try {
               choose("X");
               choose("O");
           }catch (IndexOutOfBoundsException e){

           }
       }

    }

    public boolean victory(String player1, String player2){
        boolean vic = false;
        String line = "";
        for (int i = 0; i < 8; i++) {
            switch (i){
                case 0 -> line = field[0] + field[1] + field[2];
                case 1 -> line = field[3] + field[4] + field[5];
                case 2 -> line = field[6] + field[7] + field[8];
                case 3 -> line = field[1] + field[3] + field[6];
                case 4 -> line = field[1] + field[4] + field[7];
                case 5 -> line = field[2] + field[5] + field[8];
                case 6 -> line = field[0] + field[4] + field[8];
                case 7 -> line = field[2] + field[4] + field[6];
            }
            if (line.equals(player1+player1+player1)){
                System.out.println("player " + player1 + " won");
                vic = true;
            } if (line.equals(player2+player2+player2)){
                System.out.println("player " + player2 + " won");
                vic = true;
            }
        }

        return vic;
    }

    @Override
    public String toString() {
        return "field=" + Arrays.toString(field);
    }
}
