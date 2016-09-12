 
/**
 * provide a simple elevator
 */
public class elevator
{
    private int current_floor = 0;
    private int occupants = 0;
    private int top_floor = 6;
    private int bottom_floor = 0;
    private int capacity = 9;
    private boolean goingUp = true;
    
    /**
     * make a new elevator
     */
    public elevator()
    {
    }

    public elevator(int floor, boolean up)
    {
        current_floor = floor;
        goingUp = up;
    }

    /**
     * lift goes up one floor at a time as far as the top floor only
     */
    public void ascend()
    {
        /* tell the lift to go up add 1 on to the current_floor if current floor less than top_floor*/
        if (current_floor < top_floor) {
            current_floor = current_floor + 1;
        }
        else {
            /* else display error message*/
            // System.out.println("Sorry you are at the top!");
            goingUp = false;
            descend();
        }
    }

    /**
     * lift goes down one floor at a time as far as the bottom floor only
     */
    public void descend()
    {
        /* tell the lift to go down subtract 1 from the current_floor if current floor above th bottom_floor*/
        if (current_floor > bottom_floor) {
            current_floor = current_floor - 1;
        }
        else {
            /* else display error message*/
            // System.out.println("Sorry you are at the bottom!");
            goingUp = true;
            ascend();
        }
    }

    /**
     * lift is boarded by one more person up to the max
     */
    public void board(int[] newPassengers)
    {
        /* */
<<<<<<< HEAD
        if (occupants + newPassengers > capacity) {
            occupants = capacity;
=======
        //System.out.print(" +" + newPassengers + " ");
        if (newPassengers[current_floor] <= capacity - occupants) {
            occupants = occupants + newPassengers[current_floor];
            System.out.println("+" + newPassengers[current_floor]);
            newPassengers[current_floor] = 0;
>>>>>>> compstki/master
        }
        else {
            System.out.println("+" + (capacity - occupants));
            newPassengers[current_floor] = newPassengers[current_floor] + occupants - capacity;
            occupants = capacity;
            /* else display error message*/
<<<<<<< HEAD
            occupants = occupants + newPassengers;
=======
            // System.out.println("Sorry lift is full!");
>>>>>>> compstki/master
        }
    }

    /**
     * people leave until lift is empty
     */
    public void exit(int leavingPassengers)
    {
        /* */
<<<<<<< HEAD
        if (occupants >= 0) {
=======
        System.out.print("-" + leavingPassengers);
        if (occupants > 0) {
>>>>>>> compstki/master
            occupants = occupants - leavingPassengers;
        }
        else {
            /* else display error message*/
            // System.out.println("Sorry lift is empty!");
        }
    }

    /**
     * display the current lift status: location and load
     */
    public void displayLift()
    {
        System.out.print("\t");
        //System.out.println("Floor : " + current_floor + " People : " + occupants);
        for (int i = 0; i<current_floor; i++) {
            System.out.print("\t");
        }
        System.out.print("["+ occupants + "]");
    }

    /**
     * get the current floor
     */
    public int getFloor()
    {
        return current_floor;
    }

    /**
     * get the current number of occupants
     */
    public int getOccupants()
    {
        return occupants;
    }

    public void moveLift() {
        if (goingUp == true) {
            ascend();
        }
        else
        {
            descend();
        }
    }
}
