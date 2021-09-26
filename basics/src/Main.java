import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        String ans = flipNHeads(1);
        System.out.println(ans);
        clock();
    }

    public static String pluralize(String obj, int count) {
        return count > 1 ? obj + "s" : obj;
    }

    public static String flipNHeads(int n) {
        Random rand = new Random();
        float float_random = rand.nextFloat();
        System.out.println(float_random);
        String value = "";
        int count = 0;
        int in_Row = 0;

        while(n != in_Row) {
            float_random = rand.nextFloat();
            if ((double)float_random > 0.5D) {
                value = "tails";
                System.out.println(value);
                ++count;
                in_Row = 0;
            } else {
                value = "heads";
                System.out.println(value);
                ++count;
                ++in_Row;
            }
        }

        if (count == 1) {
            return "It took 1 flip to flip 1 head in a row.";
        } else {
            return "It took " + count + " flips to flip " + in_Row + " heads in a row.";
        }
    }

    public static void clock() {
        try {
            while(true) {
                LocalDateTime now = LocalDateTime.now();
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException var5) {
            var5.printStackTrace();
        }
    }
}
