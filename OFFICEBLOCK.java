import java.util.*;

public class OFFICEBLOCK
{
    elevator liftA = new elevator();
    elevator liftB = new elevator(6,false)
    elevator[] lifts = {liftA, liftB};
    Random randomPeople = new Random();
    
    int[] floorQs = {0,0,0,0,0,0,0}

    public OFFICEBLOCK()
    {

    }

    // make a test story
    // predict the outcome and compare to result
    // OUTCOME: lift A would be on floor 1 with 1 person

    public void testLoop()
    {
        // loop 10 times
        for (int i = 0 ; i <= 15; i++) {
            floorQ(();
            for (int
            // exit random queue
             liftA.exit(randomPeople.nextInt(liftA.getOccupants()+1));
            // board random queue
            liftA.board(randomPeople.nextInt(10));
            // move lift
            liftA.moveLift();
            // end
            liftA.displayLift();
        }
    }
}
