import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Reader {

    public static void main(String[] args) throws IOException {
        int[][] grid = new int[9][9];
        /**
         * sub-grid 1: 0,0 sub-grid 2: 0,3 sub-grid 3: 0,6
         * 
         * sub-grid 4: 3,0 sub-grid 5: 3,3 sub-grid 6: 3,6
         * 
         * sub-grid 7: 6,0 sub-grid 8: 6,3 sub-grid 9: 6,6
         */

        // first check to see if the program was run with the command line argument
        if (args.length < 1) {
            System.out.println("Error, usage: java ClassName inputfile");
            System.exit(1);
        }

        Scanner reader = new Scanner(new FileInputStream(args[0]));
        int currentRow = 0;
        // reading file
        while (reader.hasNextLine()) {
            // get the current line
            String line = reader.nextLine();
            String[] matches = Pattern.compile("\\d").matcher(line).results().map(MatchResult::group)
                    .toArray(String[]::new);

            for (int i = 0; i < 9; i++) {
                grid[currentRow][i] = Integer.parseInt(matches[i]);
            }
            currentRow++;
        }
        final int NUMBER_OF_PERMITS = 3;
        Semaphore semaphore = new Semaphore(NUMBER_OF_PERMITS);
        RowThread checkRow = new RowThread(grid, semaphore);
        ColumnThread checkColumn = new ColumnThread(grid, semaphore);
        SubGridThread checkSubGrid = new SubGridThread(grid, semaphore);

        checkRow.start();
        checkColumn.start();
        checkSubGrid.start();
    }
}
