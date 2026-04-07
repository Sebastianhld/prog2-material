package algods.mecoding;

public class Train {
    String type;
    int seats;
    int speed;
    int[] wagons;
    boolean highspeed;
    String color;
    
    public void drive() {
        System.out.println("Der Zug fährt");
    }

    public Train(String type, int seats, int speed, int[] wagons, boolean highspeed, String color){
        this.type = type;
        this.seats = seats;
        this.speed = speed;
        this.wagons = wagons;
        this.highspeed = highspeed;
        this.color = color;
    }

    public void showType(){
        System.out.println("Typ: "+ type);
    }

    public boolean hasMoreSeatsThan(Train other){
        return this.seats > other.seats;
    }

    public boolean isSameType(Train other){
        return this.type.equals(other.type);
    }

    public void setToFasterTrain(Train other){
        if (this.speed < other.speed){
            this.speed = other.speed;
        }
    }

    public void copyTrainData(Train other){
        this.type = other.type;
        this.seats = other.seats;
        this.speed = other.speed;
        this.wagons = other.wagons;
        this.highspeed = other.highspeed;
        this.color = other.color;
    }

    public boolean isBetweenSpeed(int minSpeed, int maxSpeed){
        return (speed >= minSpeed && speed <= maxSpeed);
    }

    public boolean hasSameSpeed(Train other){
        return this.speed==other.speed;
    }

    public boolean hasMoreWagonsThan(Train other){
        return this.wagons.length > other.wagons.length;
    }

    public boolean isLongTrain(){
        return this.wagons.length > 4;
    }

    public boolean hasColor(String testColor){
        return this.color.equals(testColor);
    }

    public boolean isfasterAndTheSameType(Train other){
        return ((this.speed > other.speed) && this.type.equals(other.type));
    }

    public void setToLongerTrain(Train other){
        if (this.wagons.length < other.wagons.length){
            this.wagons = other.wagons;
        }
    }
}
