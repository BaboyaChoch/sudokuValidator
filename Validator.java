import java.util.Set;
import java.util.HashSet;

public class Validator {
    final public int[][] grid;
    public int[][] subGrids = { { 0, 0 }, { 0, 3 }, { 0, 6 }, { 3, 0 }, { 3, 3 }, { 3, 6 }, { 6, 0 }, { 6, 3 },
            { 6, 6 }, };
    private Set<Integer> numberSet = new HashSet<Integer>();

    public Validator(int[][] grid) {

        this.grid = grid;
    }

    /**
     * We store all numbers in a set. There can be no repetions in a set, so if all
     * numbers are in the row/column/subGrid the set should ideally have a size of
     * 9. Thus, if the set's length is not 9, the given row/column/subGrid is not
     * valid—a number is missing.
     */
    public String isValidColumn(int col) {
        numberSet.clear();
        for (int i = 0; i < 9; i++) {
            int num = grid[i][col];
            numberSet.add(num);
        }
        return numberSet.size() == 9 ? "Valid" : "Invalid";
    }

    public String isValidRow(int row) {
        numberSet.clear();
        for (int i = 0; i < 9; i++) {
            int num = grid[row][i];
            numberSet.add(num);
        }
        return numberSet.size() == 9 ? "Valid" : "Invalid";
    }

    public String isValidSubGrid(int gridId) {
        numberSet.clear();
        int[] gridLocation = subGrids[gridId];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int row = gridLocation[0] + i;
                int col = gridLocation[1] + j;

                int num = grid[row][col];
                numberSet.add(num);
            }

        }
        return numberSet.size() == 9 ? "Valid" : "Invalid";
    }
}
