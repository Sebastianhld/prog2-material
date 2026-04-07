package algods.mecoding;

public class Main {
    public static void main(String[] args) {
        int[] wagons1 = {1,2,3,4};
        int[] wagons2 = {1,2,3};
        Train t1 = new Train("ICE",400,329,wagons1,true,"weiß");
        Train t2 = new Train("RE",600,140,wagons2,false,"rot");

        System.out.println(t1.hasMoreSeatsThan(t2));
        System.out.println(t1.isSameType(t2));
        t2.setToFasterTrain(t1);
        System.out.println(t2.speed);
        System.out.println(t2.isBetweenSpeed(100, 200));
        t2.copyTrainData(t1);
        System.out.println(t2.type);
        System.out.println(t1.speed);
        System.out.println(t1.hasSameSpeed(t2));
    }
}
