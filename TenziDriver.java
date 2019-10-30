import java.util.Scanner;

/**
 * Rolls a dice and ask the user which dice they would like to roll again, until
 * all 10 dice have the same face value. The program also tells you how long it
 * took you and it keeps a leaderboard of the 3 fastest time.
 * 
 * @author mitzibustamante
 *
 */
public class TenziDriver {
    

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LeaderBoard addScores = new LeaderBoard();
        String enterDiceToRoll;
        String askingPlayer = "Y";
        long start;
        long end;

        while (askingPlayer.equals("Y")) {
            TenziGame tenzi = new TenziGame();
            System.out.println(tenzi);
            while (tenzi.isOver() == false) {
             
                start = tenzi.getTimeElaspsed();
                System.out.println("Which to roll");
                enterDiceToRoll = keyboard.nextLine();
                tenzi.roll(splitToInts(enterDiceToRoll));
                System.out.println(tenzi);
                if (tenzi.isOver() == true) {
                    end = new TenziGame().getTimeElaspsed();
                    System.out.println("Game Over. Your Time is : " + (end - start) / ((double) 1000));
                    addScores.update((end - start));
                    System.out.println(addScores.toString() + "\n");
                }
            }

            System.out.print("Play Again? (Y/N)");
            askingPlayer = keyboard.nextLine();
            
        }
    }
      

    public static int[] splitToInts(String thegame) {
        //split the string passed by the comma 
        String[] splitingIt = thegame.split(",");
        // creates an array of int depending in the length of the string array
        int[] toNumber = new int[splitingIt.length];
        // converts string into int and puts them in array of int
        for (int i = 0; i < splitingIt.length; i++) {
            toNumber[i] = Integer.parseInt(splitingIt[i]);
        }
        return toNumber;

    }
}

