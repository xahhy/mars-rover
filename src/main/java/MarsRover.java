public class MarsRover {

    public Location run(String commandString) {
        Command command = new Command(commandString);
        return command.apply();
    }
}
