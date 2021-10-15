
import java.util.HashMap;
import java.util.concurrent.Semaphore;

/**
 * sub-grid 1: 0,0 sub-grid 2: 0,3 sub-grid 3: 0,6 sub-grid 4: 3,0 sub-grid 5:
 * 3,3 sub-grid 6: 3,6 sub-grid 7: 6,0 sub-grid 8: 6,3 sub-grid 9: 6,6
 */

public class SubGridThread extends Thread {
    private int[][] grid;
    private Validator validator;
    private Semaphore sem;
    private final HashMap<Integer, String> subGridIndex = new HashMap<Integer, String>() {
        {
            put(0, "123");
            put(3, "456");
            put(6, "789");
        }
    };
    final private String template = "Thread 3, SubGrid R%1$s-C%2$s, %3$s";

    public SubGridThread(int[][] grid, Semaphore sem) {
        this.sem = sem;
        this.grid = grid;
        validator = new Validator(grid);
    }

    @Override
    public void run() {
        try {
            sem.acquire();
            for (int i = 0; i < 9; i++) {
                String row = subGridIndex.get(validator.subGrids[i][0]);
                String col = subGridIndex.get(validator.subGrids[i][1]);
                System.out.println(String.format(template, row, col, validator.isValidSubGrid(i)));
            }
        } catch (InterruptedException err) {
            System.out.println(err);
        } finally {
            sem.release();
        }
    }
}
