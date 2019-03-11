import java.util.Random;

public class Main {
    private static final int BORDERS[] = {-100, 100};

    public static void main(String[] args) {
        int point[] = point();
        System.out.print("Random point coordinates:\nX: " + point[0] + "\nY: " + point[1]);
    }

    private static int[] point() {
        Random rand = new Random(System.currentTimeMillis());
        int x = BORDERS[0] + rand.nextInt(1 + BORDERS[1] - BORDERS[0]);
        int y = BORDERS[0] + rand.nextInt(1 + BORDERS[1] - BORDERS[0]);
        return new int[] {x, y};
    }
}

