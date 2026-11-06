public class CommitCafe {

    private static String barista = "Nile"; // STUDENT_TODO_1A: Change name
    private static String title = "Master Brewer";
    // STUDENT_TODO_1B: Add a nickname or title for the barista

    private static int cups = 0;

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        cups++;
        System.out.println("Brewing a delicious " + drink + " for our customers.");
        // STUDENT_TODO_2B: Add a second brew-related improvement
        System.out.println("Fresh aroma filling the cafe!");
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
