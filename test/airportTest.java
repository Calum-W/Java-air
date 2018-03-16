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
        assertEquals("Plane landed", tester.land(), "Landing planes should return a message");
    }

}