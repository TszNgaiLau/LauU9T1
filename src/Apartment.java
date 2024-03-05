public class Apartment extends Home{
    private int number;
    public Apartment(String address, int num) {
        super(address);
        number = num;
    }
    public int getNumber() {
        return number;
    }
}
