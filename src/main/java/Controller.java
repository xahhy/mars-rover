import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;

public class Controller {
    private RoverStatus roverStatus;
    private boolean isBackwards = false;
    static HashMap<Direction, Function<RoverStatus, RoverStatus>> moveMap = new HashMap<>();
    static HashMap<Direction, Function<RoverStatus, RoverStatus>> backWardsMoveMap = new HashMap<>();

    static {
        moveMap.put(Direction.W, newRoverStatus -> {
            newRoverStatus.x--;
            return newRoverStatus;
        });
        moveMap.put(Direction.E, newRoverStatus -> {
            newRoverStatus.x++;
            return newRoverStatus;
        });
        moveMap.put(Direction.N, newRoverStatus -> {
            newRoverStatus.y++;
            return newRoverStatus;
        });
        moveMap.put(Direction.S, newRoverStatus -> {
            newRoverStatus.y--;
            return newRoverStatus;
        });

        backWardsMoveMap.put(Direction.W, newRoverStatus -> {
            newRoverStatus.x++;
            return newRoverStatus;
        });
        backWardsMoveMap.put(Direction.E, newRoverStatus -> {
            newRoverStatus.x--;
            return newRoverStatus;
        });
        backWardsMoveMap.put(Direction.N, newRoverStatus -> {
            newRoverStatus.y--;
            return newRoverStatus;
        });
        backWardsMoveMap.put(Direction.S, newRoverStatus -> {
            newRoverStatus.y++;
            return newRoverStatus;
        });
    }

    public Controller(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    private Direction leftDirection(Direction direction) {
        return Direction.values()[(direction.ordinal() + 1) % Direction.values().length];
    }

    private Direction rightDirection(Direction direction) {
        return Direction.values()[(direction.ordinal() + 3) % Direction.values().length];
    }

    public RoverStatus init(RoverStatus roverStatus) {
        return roverStatus;
    }

    public RoverStatus move() {
        RoverStatus newRoverStatus = roverStatus.clone();
        HashMap<Direction, Function<RoverStatus, RoverStatus>> finalMoveMap = isBackwards ? backWardsMoveMap : moveMap;
        finalMoveMap.get(roverStatus.direction).apply(newRoverStatus);
        return newRoverStatus;
    }

    public RoverStatus turnLeft() {
        RoverStatus newRoverStatus = roverStatus.clone();
        newRoverStatus.direction = isBackwards ? rightDirection(roverStatus.direction) : leftDirection(roverStatus.direction);
        return newRoverStatus;
    }

    public RoverStatus turnRight() {
        RoverStatus newRoverStatus = roverStatus.clone();
        newRoverStatus.direction = isBackwards ? leftDirection(roverStatus.direction) : rightDirection(roverStatus.direction);
        return newRoverStatus;
    }

    public RoverStatus setBackwards(boolean isBackwards) {
        this.isBackwards = isBackwards;
        return roverStatus;
    }
}
