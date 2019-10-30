import java.util.ArrayList;

public class LeaderBoard {
    // Instance variable
    private ArrayList<Long> bestTimes;

    // Constructor
    /**
     * Creates the object leader board, each time the player play it's score is
     * going to be save here
     */
    public LeaderBoard() {
        bestTimes = new ArrayList<Long>();
    }
    
    // Method
    /**
     * Each time that the user plays their time is recorded and add into the leader
     * board. Only 3 of the fastest time is recorded, in a increasing order.
     * Smallest time is shown first.
     * 
     * @param otherTime : Get the time in second of how long the user played
     */
    public void update(long otherTime) {

        long current = otherTime;
        long placeHolder;
        int i = 0;

        // adds the time in the zero position with the current time
        // check which number is less and puts it in its place (index)
        bestTimes.add(i, current);
        for (int j = bestTimes.size() - 1; j > i; j--) {
            if (bestTimes.get(i) > bestTimes.get(j)) {

                placeHolder = bestTimes.get(i);

                bestTimes.set(i, bestTimes.get(j));
                bestTimes.set(j, placeHolder);
            }

        }
        // if the size is bigger 4 equals it removes the last one
        if (bestTimes.size() == 4) {
            bestTimes.remove(bestTimes.size() - 1);
        }

    }

    /**
     * Shows the leader board with the times all in a string
     * 
     * @return: a time in second creating a new line for each time
     */
    public String toString() {

        // checks the size of the ArrayList of the time and prints them out depending of
        // the size
        // if size its bigger then 1 its adds the other times as well, showing only 3
        if (bestTimes.size() == 1) {
            return ""+"-- Current LeaderBoard (in seconds) -- "+"\n" + bestTimes.get(0) / ((double) 1000);
        }
        if (bestTimes.size() == 2) {
            return "" + bestTimes.get(0) / ((double) 1000) + "\n" + bestTimes.get(1) / ((double) 1000);
        }
        if (bestTimes.size() == 3) {
            return "" + bestTimes.get(0) / ((double) 1000) + "\n" + bestTimes.get(1) / ((double) 1000) + "\n"
                    + bestTimes.get(2) / ((double) 1000);
        }

        return "-- Current LeaderBoard (in seconds) -- " + bestTimes;
    }

}
