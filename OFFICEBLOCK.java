import java.util.*;

public class OFFICEBLOCK
{
    elevator liftA = new elevator();
    Random randomPeople = new Random();

    public OFFICEBLOCK()
    {

    }

    // make a test story
    // predict the outcome and compare to result
    // OUTCOME: lift A would be on floor 1 with 1 person

    public void testLoop()
    {
        // loop 10 times
        for (int i = 0 ; i <= 10; i++) {
            // exit random queue
             liftA.exit(randomPeople.nextInt(10));
            // board random queue
            liftA.board(randomPeople.nextInt(10));
            // move lift
            liftA.moveLift();
            // end
            liftA.displayLift();
        }
    }
}
