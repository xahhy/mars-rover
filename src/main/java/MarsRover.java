public class MarsRover {

    private Location location;

    public MarsRover() {
    }

    public String accept(String commandString) {
        return new CommandFactory().parse(commandString)
                .apply(this);
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


}
