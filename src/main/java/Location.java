public class Location {
    public int x;
    public int y;
    public Direction direction;

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Location(String location){
        String[] array = location.split(",");
        this.x = Integer.valueOf(array[0]);
        this.y=Integer.valueOf(array[1]);
        this.direction = Direction.valueOf(array[2]);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Location)) return false;
        Location otherLocation = (Location) obj;
        return this.x == otherLocation.x && this.y == otherLocation.y && this.direction == otherLocation.direction;
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
