package school.mjc.stage0.loops.task1;

import java.util.function.Supplier;

public class RepeatIsBad {

    private static int count = 0;

    public void repeatIsBad() {
        Supplier<Void> action = () -> {
            if (count < 20) {
                System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
                count++;
                repeatIsBad();
            }
            return null;
        };
        action.get();
    }

    public static void main(String[] args) {
        RepeatIsBad repeatIsBad = new RepeatIsBad();
        repeatIsBad.repeatIsBad();
        System.out.println(count); // Output the final count
    }
}
