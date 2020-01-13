import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverTest {
    @Test
    public void should_handle_init_command() {
        MarsRover marsRover = new MarsRover();
        Location location = marsRover.run("0,0,N");
        assertEquals(new Location(0, 0, Direction.N), location);
    }

    @Test
    public void should_move_N() {
        MarsRover marsRover = new MarsRover();
        marsRover.run("0,0,N");

        Location location = marsRover.run("M,1");
        assertEquals(new Location(0, 1, Direction.N), location);
    }

    @Test
    public void should_move_S() {
        MarsRover marsRover = new MarsRover();
        marsRover.run("0,0,S");

        Location location = marsRover.run("M,1");
        assertEquals(new Location(0, -1, Direction.S), location);
    }

    @Test
    public void should_move_E() {
        MarsRover marsRover = new MarsRover();
        marsRover.run("0,0,E");

        Location location = marsRover.run("M,1");
        assertEquals(new Location(1, 0, Direction.E), location);
    }

    @Test
    public void should_move_W() {
        MarsRover marsRover = new MarsRover();
        marsRover.run("0,0,W");

        Location location = marsRover.run("M,1");
        assertEquals(new Location(-1, 0, Direction.W), location);
    }

    @Test
    public void should_turn_left_N() {
        MarsRover marsRover = new MarsRover();
        marsRover.run("0,0,N");

        Location location = marsRover.run("L");
        assertEquals(new Location(0, 0, Direction.W), location);
    }

    @Test
    public void should_turn_left_W() {
        MarsRover marsRover = new MarsRover();
        marsRover.run("0,0,W");

        Location location = marsRover.run("L");
        assertEquals(new Location(0, 0, Direction.S), location);
    }

    @Test
    public void should_turn_left_S() {
        MarsRover marsRover = new MarsRover();
        marsRover.run("0,0,S");

        Location location = marsRover.run("L");
        assertEquals(new Location(0, 0, Direction.E), location);
    }

    @Test
    public void should_turn_left_E() {
        MarsRover marsRover = new MarsRover();
        marsRover.run("0,0,E");

        Location location = marsRover.run("L");
        assertEquals(new Location(0, 0, Direction.N), location);
    }
}