package QAP;
public class TestTime {
    public static void main(String[] args) {
        // Create two time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Advance t1 by one second
        t1.nextSecond();
        // Retreat t2 by one second
        t2.previousSecond();

        // Display final times
        System.out.println("Time t1: " + t1.toString());
        System.out.println("Time t2: " + t2.toString());
}
}