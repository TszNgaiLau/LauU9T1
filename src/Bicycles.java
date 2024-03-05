public class Bicycles extends Vehicle {
    private int gear;
    public Bicycles(String name, int wheels, int gear) {
        super(name, wheels);
        this.gear = gear;
    }


    public void ringBell() {
        System.out.println("Bell has been ring");
    }
    public int gearCount() {
        return gear;
    }
}
