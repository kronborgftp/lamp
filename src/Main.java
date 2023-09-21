public class Main {
    public static void main(String[] args) {

        Lamp lamp1 = new Lamp("Kitchen Lamp", true);
        Lamp lamp2 = new Lamp("Living room lamp");

        System.out.println(lamp1);
        System.out.println(lamp2);

        lamp1.toggle();
        lamp2.toggle();

        System.out.println(" ");

        System.out.println(lamp1);
        System.out.println(lamp2);
    }
}