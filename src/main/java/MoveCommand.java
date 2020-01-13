public class MoveCommand extends Command {
    public MoveCommand(String commandString) {
        super(commandString);
    }

    @Override
    public boolean isMatch() {
        return "M".equals(this.command);
    }

    @Override
    public Location apply(Location currentLocation) {
        int x = currentLocation.x;
        int y = currentLocation.y;
        switch (currentLocation.direction) {
            case E:
                x += 1;
                break;
            case W:
                x -= 1;
                break;
            case N:
                y += 1;
                break;
            case S:
                y -= 1;
                break;
            default:
                break;
        }
        return new Location(x, y, currentLocation.direction);
    }
}
