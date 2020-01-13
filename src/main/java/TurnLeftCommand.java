public class TurnLeftCommand extends Command {
    public TurnLeftCommand(String commandString) {
        super(commandString);
    }

    @Override
    public Location apply(Location currentLocation) {
        Direction newDirection;
        switch (currentLocation.direction) {
            case N:
                newDirection = Direction.W;
                break;
            case S:
                newDirection = Direction.E;
                break;
            case E:
                newDirection = Direction.N;
                break;
            case W:
                newDirection = Direction.S;
                break;
            default:
                newDirection = currentLocation.direction;
                break;
        }
        return new Location(currentLocation.x, currentLocation.y, newDirection);
    }

    @Override
    public boolean isMatch() {
        try {
            String[] array = this.command.split(",");
            if ("L".equals(array[0])) return true;
        } catch (Exception ignore) {

        }
        return false;
    }
}
