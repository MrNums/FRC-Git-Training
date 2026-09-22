public class Main {
    public static void main(String[] args) {
        int battery = 15;

        System.out.println("Robot starting...");

        if (battery > 20) {
            System.out.println("WARNING: Low battery!");
        }

        System.out.println("Battery: " + battery + "%");
    }
}
