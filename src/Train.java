public class Train extends Vehicle{
    private int carts;
    public Train(String name, int wheels, int carts) {
        super(name, wheels);
        this.carts = carts;
    }

    public int getCarts() {
        return carts;
    }
    public void whistle() {
        System.out.println("CHUUUU CHUUUU");
    }
}
