package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC");
        while (seconds <= 157) {
            System.out.println("Watching \uD83D\uDC08 at second: " + seconds);
            seconds++;
            Thread.sleep(1000);

        }
        System.out.println("Finished watching \uD83D\uDC08 video, lets start another one");
    }
}
