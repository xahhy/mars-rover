public class Location {
    public int x;
    public int y;
    public Direction direction;

    public Location(String x, String y, String direction) {
        this.x = Integer.valueOf(x);
        this.y = Integer.valueOf(y);
        this.direction = Direction.valueOf(direction);
    }

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return String.join(",", Integer.toString(x), Integer.toString(y), direction.toString());
    }
}
