import java.util.HashMap;
import java.util.function.Function;

public class CommandFactory {
    private HashMap<Command, Function<String[], Function<Controller, RoverStatus>>> commandMap;

    public CommandFactory() {
        this.commandMap = new HashMap<>();
        commandMap.put(Command.M, splitedCommand -> Controller::move);
        commandMap.put(Command.Init, splitedCommand -> controller -> controller.init(new RoverStatus(splitedCommand[0],splitedCommand[1],splitedCommand[2])));
        commandMap.put(Command.L, splitedCommand -> Controller::turnLeft);
        commandMap.put(Command.R, splitedCommand -> Controller::turnRight);
        commandMap.put(Command.B, splitedCommand -> controller -> controller.setBackwards(true));
    }


    public Function<Controller, RoverStatus> parse(String commandString) {
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
