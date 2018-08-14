package cn.ws.test.thread_pool;

/*
 * @Author: cool
 * @Date: 2018/8/1 15:13
 */
public class TestPool {
    public static void main(String[] args) throws InterruptedException {
        ThreadExcutor excutor = new ThreadExcutor(3);
        for (int i = 0; i < 10; i++) {
            excutor.exec(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程 " + Thread.currentThread().getName() + " 在帮我干活");
                }
            });
        }
        excutor.shutdown();
    }
}
