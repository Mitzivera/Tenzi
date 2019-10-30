import java.util.ArrayList;

/**
 * This is where the games is actually going to be. The dices are created and
 * with the user input those dices only roll and it all prints it out in one
 * single line
 * 
 * @author mitzibustamante
 *
 */
public class TenziGame {
    // Instance - variable
    private int turns;
    private long startTime;
    private long endTime;
    private ArrayList<Die> theDice;

    // Contractor
    /**
     * The object TenziGame in which all the 10 dices are creates and can roll the
     * dice that the user wants
     */
    public TenziGame() {
        turns = 0;
        // sets the time to when the player starts
        startTime = System.currentTimeMillis();
        endTime = 0;
        // creates the 10 objects of dice
        theDice = new ArrayList<Die>();
        theDice.add(new Die());
        theDice.add(new Die());
        theDice.add(new Die());
        theDice.add(new Die());
        theDice.add(new Die());
        theDice.add(new Die());
        theDice.add(new Die());
        theDice.add(new Die());
        theDice.add(new Die());
        theDice.add(new Die());

    }

    // Method
    /**
     * Check of all the dices have the same face value
     * 
     * @return: true if all the dice have the same face value or return false if all
     *          the dices don't have the same face value
     */
    public boolean isOver() {
        // checks that each dice have the same face value checking one by one.
        int zeroValue = theDice.get(0).getFaceValue();
        int oneValue = theDice.get(1).getFaceValue();
        int secondValue = theDice.get(2).getFaceValue();
        int thirdValue = theDice.get(3).getFaceValue();
        int fourthValue = theDice.get(4).getFaceValue();
        int fifthValue = theDice.get(5).getFaceValue();
        int sixthValue = theDice.get(6).getFaceValue();
        int seventhValue = theDice.get(7).getFaceValue();
        int eighthValue = theDice.get(8).getFaceValue();
        int ninethValue = theDice.get(9).getFaceValue();
        if (zeroValue == oneValue) {
            if (oneValue == secondValue) {
                if (secondValue == thirdValue) {
                    if (thirdValue == fourthValue) {
                        if (fourthValue == fifthValue) {
                            if (fifthValue == sixthValue) {
                                if (sixthValue == seventhValue) {
                                    if (seventhValue == eighthValue) {
                                        if (eighthValue == ninethValue) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;

    }

    /**
     * Get an array of number from the user and then roll only those dices
     * 
     * @param dicesToTurn : Get the user input on which dice to roll
     */
    public void roll(int[] dicesToTurn) {
        Die oneDie = new Die();

        int i = 0;
        // get the dice and roll a new face value and set it in the same locations
        while (i < dicesToTurn.length) {
            theDice.get(dicesToTurn[i]);
            oneDie.roll();
            theDice.set(dicesToTurn[i], oneDie);
            i = i + 1;
        }
    }

    /**
     * Get the elapsed time since the user started the game until it ended
     * 
     * @return: the time elapsed in milliseconds
     */
    public long getTimeElaspsed() {
        // it just returns start time of the game
        return startTime - endTime;
    }

    /**
     * Get the turns of the dice
     * 
     * @return turn
     */
    public int getTurns() {
        // get the numbers of turns
        return turns;
    }

    /**
     * Gather all the information and returns it in a single string
     * 
     * @return: a string all of the 10 dices with their face values
     */
    public String toString() {

        // get all the dice in a string, each dice gets its own row
        return "0:" + theDice.get(0) + "\n" + "1:" + theDice.get(1) + "\n" + "2:" + theDice.get(2) + "\n" + "3:"
                + theDice.get(3) + "\n" + "4:" + theDice.get(4) + "\n" + "5:" + theDice.get(5) + "\n" + "6:"
                + theDice.get(6) + "\n" + "7:" + theDice.get(7) + "\n" + "8:" + theDice.get(8) + "\n" + "9:"
                + theDice.get(9);

    }

}
