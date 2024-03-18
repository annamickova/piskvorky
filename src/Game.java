import java.util.Arrays;
import java.util.Scanner;

public class Game {

    private String[] field;
    private String player;

    public Game() {
        this.field = new String[9];
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
        return "welcome in tic tac toe";
    }

    public void choose(String player){
        Scanner sc = new Scanner(System.in);
        int answer;
        System.out.println("player " + player);
        System.out.println("choose your characters placement");
        answer = sc.nextInt();
        field[answer-1] = player;
    }

    public void start(){
       System.out.println(intro());
       while (!victory()){
           try {
               for (int i = 0; i < 5; i++) {
                   choose("X");
                   choose("O");
               }
           }catch (IndexOutOfBoundsException e){

           }
       }

    }

    public boolean victory(){

        for (int i = 0; i < 8; i++) {
            switch (i){
                case 0:
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "field=" + Arrays.toString(field);
    }
}
