public class House extends Home{
    private boolean backyard;
    public House(String address, boolean present) {
        super(address);
        backyard = present;
    }

    public boolean isBackyard() {
        return backyard;
    }
}
