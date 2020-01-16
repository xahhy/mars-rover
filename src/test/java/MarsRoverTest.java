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

    @Test
    public void should_handle_turn_left_command() {
        MarsRover marsRover = new MarsRover();
        marsRover.accept("1,2,N");
        String location = marsRover.accept("L");
        assertEquals("1,2,W", location);
    }

    @Test
    public void should_handle_turn_right_command() {
        MarsRover marsRover = new MarsRover();
        marsRover.accept("1,2,N");
        String location = marsRover.accept("R");
        assertEquals("1,2,E", location);
    }

    @Test
    public void should_handle_init_move_move_turnLeft_move_turnLeft_turnRight_commands() {
        MarsRover marsRover = new MarsRover();
        String location = marsRover.accept("1,2,N M M L M L R");
        assertEquals("0,4,W", location);
    }

    @Test
    public void should_move_back_when_b_command() {
        MarsRover marsRover = new MarsRover();
        String location = marsRover.accept("1,2,N M M B M M");
        assertEquals("1,2,N", location);
    }

    @Test
    public void should_turn_right_when_b_command_before_l() {
        MarsRover marsRover = new MarsRover();
        String location = marsRover.accept("1,2,N B L");
        assertEquals("1,2,E", location);
    }

    @Test
    public void should_turn_left_when_b_command_before_r() {
        MarsRover marsRover = new MarsRover();
        String location = marsRover.accept("1,2,N B R");
        assertEquals("1,2,W", location);
    }
}