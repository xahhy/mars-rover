public class Command {
    protected final String command;

    public Command(String commandString) {
        this.command = commandString;
    }

    public Location apply(Location currentLocation){
        return new Location(this.command);
    }

    public boolean isMatch(){
        return true;
    }

    public static Command factory(String commandString){
        if(new InitCommand(commandString).isMatch()){
            return new InitCommand(commandString);
        }
        if(new MoveCommand(commandString).isMatch()){
            return new MoveCommand(commandString);
        }
        if(new TurnLeftCommand(commandString).isMatch()){
            return new TurnLeftCommand(commandString);
        }
        if(new TurnRightCommand(commandString).isMatch()){
            return new TurnRightCommand(commandString);
        }
        return new Command(commandString);
    }
}
