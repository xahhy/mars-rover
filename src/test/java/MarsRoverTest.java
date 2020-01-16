import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverTest {
    @Test
    public void should_handle_init_command() {
        MarsRover marsRover = new MarsRover();
        String location = marsRover.accept("1,2,N");
        assertEquals("1,2,N", location);
    }
}