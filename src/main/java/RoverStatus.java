public class RoverStatus {
    public int x;
    public int y;
    public Direction direction;

    public RoverStatus() {
    }

    public RoverStatus(String x, String y, String direction) {
        this.x = Integer.valueOf(x);
        this.y = Integer.valueOf(y);
        this.direction = Direction.valueOf(direction);
    }

    public RoverStatus(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return String.join(",", Integer.toString(x), Integer.toString(y), direction.toString());
    }

    public RoverStatus clone() {
        return new RoverStatus(x, y, direction);
    }

    public RoverStatus update(RoverStatus roverStatus){
        x = roverStatus.x;
        y = roverStatus.y;
        direction = roverStatus.direction;
        return this;
    }
}
