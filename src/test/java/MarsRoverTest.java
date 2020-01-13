import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverTest {
    @Test
    public void should_handle_init_command() {
        MarsRover marsRover = new MarsRover();
        Location location = marsRover.run("0,0,N");
        assertEquals(new Location(0,0, Direction.N), location);
    }
}