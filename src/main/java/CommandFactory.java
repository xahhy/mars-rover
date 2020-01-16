import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class CommandFactory {
    private HashMap<Command, Function<String[], Function<MarsRover, String>>> commandMap;

    public CommandFactory() {
        this.commandMap = new HashMap<>();
        commandMap.put(Command.M, splitedCommand -> marsRover -> {
            marsRover.move();
            return marsRover.getLocation().toString();
        });
        commandMap.put(Command.Init, splitedCommand -> marsRover -> {
            marsRover.init(Integer.valueOf(splitedCommand[0]), Integer.valueOf(splitedCommand[1]), Direction.valueOf(splitedCommand[2]));
            return marsRover.getLocation().toString();
        });
    }


    public Function<MarsRover, String> parse(String commandString) {
        String[] splitedCommand = commandString.split(",");
        Command command;
        if (splitedCommand.length == 3) {
            command = Command.Init;
        } else {
            command = Command.valueOf(splitedCommand[0]);
        }
        return commandMap.get(command).apply(splitedCommand);
    }
}
