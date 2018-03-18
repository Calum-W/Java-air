import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class airportTest {

    public airport tester;

    @BeforeEach
    public void initialize(){
        tester = new airport();
    }

    @Test
    public void landReturnsAMessage() {
        assertEquals("Plane landed", tester.land("I'm a plaaaaaaane!!"), "Landing planes should return a message");
    }

    @Test
    public void landAddsSomethingToHangar() {
        tester.land("I'm a plaaaaaaane!!");
        assertEquals(1, tester.getPlaneCount(), "Landing planes should add them to the hangar");
    }

    @Test
    public void takeOffReturnsAMessage() {
        assertEquals("Plane has taken off", tester.takeOff("I'm a plaaaaaaane!!"), "Taking off planes should return a message");
    }

    @Test
    public void takeOffRemovesPlaneFromHangar() {
        tester.land("I'm a plaaaaaaane!!");
        tester.takeOff("I'm a plaaaaaaane!!");
        assertEquals(0, tester.getPlaneCount(), "Take off should remove planes from the hangar");
    }

}