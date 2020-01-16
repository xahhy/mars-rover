public class MarsRover {

    private Location location;

    public MarsRover() {
    }

    public String accept(String commandString) {
        for (String command : commandString.split(" ")) {
            new CommandFactory().parse(command)
                    .apply(this);
        }
        return location.toString();
    }

    public Location getLocation() {
        return location;
    }

    public MarsRover init(int x, int y, Direction direction) {
        location = new Location(x, y, direction);
        return this;
    }

    public MarsRover move() {
        switch (location.direction) {
            case W:
                location.x -= 1;
                break;
            case E:
                location.x += 1;
                break;
            case N:
                location.y += 1;
                break;
            case S:
                location.y -= 1;
                break;
        }
        return this;
    }


    public MarsRover turnLeft() {
        switch (location.direction) {
            case W:
                location.direction = Direction.S;
                break;
            case E:
                location.direction = Direction.N;
                break;
            case N:
                location.direction = Direction.W;
                break;
            case S:
                location.direction = Direction.E;
                break;
        }
        return this;
    }

    public MarsRover turnRight() {
        switch (location.direction) {
            case W:
                location.direction = Direction.N;
                break;
            case E:
                location.direction = Direction.S;
                break;
            case N:
                location.direction = Direction.E;
                break;
            case S:
                location.direction = Direction.W;
                break;
        }
        return this;
    }
}
