public class Main {
    public static void main(String[] args) {

        Lamp lamp1 = new Lamp("Kitchen Lamp", true);
        Lamp lamp2 = new Lamp("Living room lamp");

        System.out.println(lamp1.getName() + " is on " + lamp1.isOn());
        System.out.println(lamp2.getName() + " is on " + lamp2.isOn());

        lamp1.toggle();
        lamp2.toggle();

        System.out.println(" ");

        System.out.println(lamp1.getName() + " is on " + lamp1.isOn());
        System.out.println(lamp2.getName() + " is on " + lamp2.isOn());
    }
}