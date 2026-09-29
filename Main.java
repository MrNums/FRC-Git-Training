public class Main {
    public static void main(String[] args) {
        int battery = 15;

        System.out.println("Robot starting to function...");

        if (battery > 20) {
            System.out.println("WARNING: battery at 20!");
        }

        System.out.println("Battery: " + battery + "%");
    }
}
