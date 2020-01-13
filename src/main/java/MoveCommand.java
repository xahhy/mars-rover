public class MoveCommand extends Command {
    public MoveCommand(String commandString) {
        super(commandString);
    }

    @Override
    public boolean isMatch() {
        try {
            String[] array = this.command.split(",");
            if (array.length == 2 && "M".equals(array[0])) {
                return true;
            }
        } catch (Exception ignored) {

        }
        return false;
    }

    @Override
    public Location apply(Location currentLocation) {
        String[] array = this.command.split(",");
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
