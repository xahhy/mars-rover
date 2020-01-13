import java.util.Objects;

public class Location {
    protected int x;
    protected int y;
    protected Direction direction;

    public Location(String location){
        String[] array = location.split(",");
        this.x = Integer.valueOf(array[0]);
        this.y=Integer.valueOf(array[1]);
        this.direction = Direction.valueOf(array[2]);
    }

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return x == location.x &&
                y == location.y &&
                direction == location.direction;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}
