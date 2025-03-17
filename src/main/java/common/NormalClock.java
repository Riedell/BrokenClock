package common;

/**
 * 一个正常的钟实现
 */
class NormalClock extends Clock {

    @Override
    void checkState() {
    }

    @Override
    void delay() throws InterruptedException {
        Thread.sleep(1000L);
    }

}
