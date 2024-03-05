public class HomeRunner {
    public static void main(String[] args) {
        Home home = new Home("11-22");
        home.getAddress();
        home.knock();

        Apartment apartment = new Apartment("11-22", 4);
        System.out.println(apartment.getNumber());
        apartment.getAddress();
        apartment.knock();

        House house = new House("11-22", true);
        System.out.println(house.isBackyard());
        house.getAddress();
        house.knock();
    }
}
