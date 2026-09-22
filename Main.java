public class Main {
    public static void main(String[] args) {
        int battery = 15;

        System.out.println("Robot starting...");

        if (battery > 20) {
            System.out.println("WARNING: Low battery!");
        if (battery < 60) {
            System.out.println("Battery has medium life...");            
        if (battery > 90) {
            System.out.println("Battery is near full...");

        if (battery = 100) {
            System.out.println("Battery is full...");

        }

        System.out.println("Battery: " + battery + "%");
    }
}
