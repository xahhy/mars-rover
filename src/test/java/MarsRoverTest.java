import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverTest {
    @Test
    public void should_handle_init_command_1_2_N() {
        MarsRover marsRover = new MarsRover();
        String location = marsRover.accept("1,2,N");
        assertEquals("1,2,N", location);
    }

    @Test
    public void should_handle_move_command() {
        MarsRover marsRover = new MarsRover();
        marsRover.accept("1,2,N");
        String location = marsRover.accept("M");
        assertEquals("1,3,N", location);
    }
}