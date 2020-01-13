public class TurnRightCommand extends Command {
    public TurnRightCommand(String commandString) {
        super(commandString);
    }

    @Override
    public Location apply(Location currentLocation) {
        Direction newDirection;
        switch (currentLocation.direction) {
            case N:
                newDirection = Direction.E;
                break;
            case S:
                newDirection = Direction.W;
                break;
            case E:
                newDirection = Direction.S;
                break;
            case W:
                newDirection = Direction.N;
                break;
            default:
                newDirection = currentLocation.direction;
                break;
        }
        return new Location(currentLocation.x, currentLocation.y, newDirection);
    }

    @Override
    public boolean isMatch() {
        return "R".equals(this.command);
    }
}
