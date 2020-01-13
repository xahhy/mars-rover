public class Command {
    private final String command;

    public Command(String commandString) {
        this.command = commandString;
    }

    public Location apply(){
        return new Location(this.command);
    }
}
