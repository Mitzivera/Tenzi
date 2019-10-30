import java.util.Random;

/**
 * Creates the object of class Die and roll the dice to get a face value.
 * 
 * @author mitzibustamante
 *
 */
public class Die {
    // Instance variable - "state"
    private int faceValue;

    // Constructor - "builds the object" -> set state
    /**
     * The class Die is creating created. Each time its called it creates a die with
     * new face value
     */
    public Die() {
        faceValue = 0;
        roll();
    }

    // Method - "what you can do to the object"
    /**
     * Gets the face value of the dice
     * 
     * @return the value of the face value
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * "Rolls" the dice, determines the face value from a random number 1-6
     */
    public void roll() {
        Random generator = new Random();
        // generates new face value each time its being call/roll
        faceValue = generator.nextInt(6) + 1;
        
    }

    /**
     * Check what the face value is and returns it in the form of asterisks
     * 
     * @return: a string of the face value in (*)
     */
    public String toString() {
        // check if the face value is a certain number then turn it into -> * depending
        // on face value
        if (getFaceValue() == 1) {
            return "" + "*";
        }
        if (getFaceValue() == 2) {
            return "" + "* *";
        }
        if (getFaceValue() == 3) {
            return "" + "* * *";
        }
        if (getFaceValue() == 4) {
            return "" + "* * * *";
        }
        if (getFaceValue() == 5) {
            return "" + "* * * * *";
        }
        if (getFaceValue() == 6) {
            return "" + "* * * * * *";
        }
        return "" + getFaceValue();
    }
}
