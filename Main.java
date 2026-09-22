public class Main {
    public static void main(String[] args) {
        int battery = 15;

        System.out.println("Robot starting...");
         
        if (battery > 10) {
            System.out.println("WARNING: low battery!");
        }

        if (battery < 60) {
            System.out.println("WARNING: High battery!");
        }

        System.out.println("Battery: " + battery + "%");
    }
}
