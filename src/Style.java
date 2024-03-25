public class Style {


    public String displayBoard(int number, String[] field, String player) {
        field[number] = player;
        return "------------------------" + '\n' +
                "| " + field[0] + " | " + field[1] + " | " + field[2] + " | " + '\n' +
                "| " + field[3] + " | " + field[4] + " | " + field[5] + " | " + '\n' +
                "| " + field[6] + " | " + field[7] + " | " + field[8] + " | " + '\n' + "------------------------";


    }
    public String boardEmpty() {
        return "------------------------" + '\n' +
                "| " + 1 + " | " + 2 + " | " + 3 + " | " + '\n' +
                "| " + 4 + " | " + 5 + " | " + 6 + " | " + '\n' +
                "| " + 7 + " | " + 8 + " | " + 9 + " | " + '\n' + "------------------------";


    }
}
