package lab7;

public class Plane {
    class Wing{
        double wingWeight;
        public Wing(double weight) {
            this.wingWeight = weight;
        }
        public double getWingWeight() {
            return wingWeight;
        }

        public void setWingWeight(double wingWeight) {
            this.wingWeight = wingWeight;
        }
        public void printWingWeight() {
            System.out.println(wingWeight);
        }
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        Plane.Wing wing = plane.new Wing(525);
        wing.printWingWeight();
        Plane.Wing wing2 = plane.new Wing(165);
        wing2.printWingWeight();
    }
}
