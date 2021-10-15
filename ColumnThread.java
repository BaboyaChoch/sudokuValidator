import java.util.concurrent.Semaphore;

public class ColumnThread extends Thread {
    private int[][] grid;
    private Validator validator;
    private Semaphore sem;
    final private String template = "Thread 2, Column %1$s, %2$s";

    public ColumnThread(int[][] grid, Semaphore sem) {
        this.sem = sem;
        this.grid = grid;
        validator = new Validator(grid);
    }

    @Override
    public void run() {
        try {
            sem.acquire();
            for (int i = 0; i < 9; i++) {
                System.out.println(String.format(template, i + 1, validator.isValidColumn(i)));
            }
        } catch (InterruptedException err) {
            System.out.println(err);
        } finally {
            sem.release();
        }
    }
}
