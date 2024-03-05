public class Home {
    private String address;
    public Home(String address) {
        this.address = address;
    }
    public void getAddress() {
        System.out.println(address);
    }
    public void knock() {
        System.out.println("Knock knock");
    }
}
