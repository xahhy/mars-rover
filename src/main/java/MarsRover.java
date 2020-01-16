public class MarsRover {

    RoverStatus roverStatus;

    protected Controller controller;

    public MarsRover() {
        roverStatus = new RoverStatus();
        this.controller = new Controller(roverStatus);
    }

    public String accept(String commandString) {
        for (String command : commandString.split(" ")) {
            roverStatus.update(new CommandFactory().parse(command)
                    .apply(controller));
        }
        return roverStatus.toString();
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }


}
