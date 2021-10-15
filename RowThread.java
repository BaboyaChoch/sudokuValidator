import java.util.concurrent.Semaphore;

public class RowThread extends Thread {
    private int[][] grid;
    private Validator validator;
    private Semaphore sem;
    final private String template = "Thread 1, Row %1$s, %2$s";

    public RowThread(int[][] grid, Semaphore sem) {
        this.sem = sem;
        this.grid = grid;
        validator = new Validator(grid);
    }

    @Override
    public void run() {
        try {
            sem.acquire();
            for (int i = 0; i < 9; i++) {
                System.out.println(String.format(template, i + 1, validator.isValidRow(i)));

            }
        } catch (InterruptedException err) {
            System.out.println(err);
        } finally {
            sem.release();
        }
    }
}
