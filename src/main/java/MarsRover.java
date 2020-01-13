public class MarsRover {
    private Location location;

    public Location run(String commandString) {
        Command command = Command.factory(commandString);
        location = command.apply(location);
        return location;
    }
}
