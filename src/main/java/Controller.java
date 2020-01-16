public class Controller {
    private RoverStatus roverStatus;

    public Controller(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public RoverStatus init(RoverStatus roverStatus) {
        return roverStatus;
    }

    public RoverStatus move() {
        RoverStatus newRoverStatus = roverStatus.clone();
        switch (roverStatus.direction) {
            case W:
                newRoverStatus.x -= 1;
                break;
            case E:
                newRoverStatus.x += 1;
                break;
            case N:
                newRoverStatus.y += 1;
                break;
            case S:
                newRoverStatus.y -= 1;
                break;
        }
        return newRoverStatus;
    }

    public RoverStatus turnLeft() {
        RoverStatus newRoverStatus = roverStatus.clone();
        switch (newRoverStatus.direction) {
            case W:
                newRoverStatus.direction = Direction.S;
                break;
            case E:
                newRoverStatus.direction = Direction.N;
                break;
            case N:
                newRoverStatus.direction = Direction.W;
                break;
            case S:
                newRoverStatus.direction = Direction.E;
                break;
        }
        return newRoverStatus;
    }

    public RoverStatus turnRight() {
        RoverStatus newRoverStatus = roverStatus.clone();
        switch (newRoverStatus.direction) {
            case W:
                newRoverStatus.direction = Direction.N;
                break;
            case E:
                newRoverStatus.direction = Direction.S;
                break;
            case N:
                newRoverStatus.direction = Direction.E;
                break;
            case S:
                newRoverStatus.direction = Direction.W;
                break;
        }
        return newRoverStatus;
    }
}
