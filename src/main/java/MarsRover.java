public class MarsRover {
    private Location location;

    public Location run(String commandString) {
        for (String s : commandString.split(" ")) {
            Command command = Command.factory(s);
            location = command.apply(location);
        }
        return location;
    }
}
