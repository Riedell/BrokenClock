package common;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new NormalClock();
//        clock.checkState();
//        clock.loopReport();

        System.out.println(BrokenClock.class.getName());
        BrokenClock brokenClock = new BrokenClock();
        brokenClock.loopReport();
    }
}
