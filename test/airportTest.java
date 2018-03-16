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

}