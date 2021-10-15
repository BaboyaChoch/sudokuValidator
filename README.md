# Soduku Validator
CLI Application that takes a .txt file containing the solution to a 9x9 sudoku table.

Utilizes Semaphores and Java Threads to validate each row, column, and sub-grid concurrently.

# How to Run

I provide two ways to run the program. I recommend Option#1 because it also deletes excess generated .class files. If you want to generated the .class files use Option#2.

Examples of usage will be provided below.

Use git clone to or download a zip of the project to get the files.


##### Options

Replace [fileName] with the name of the txt file that contains the solution

Option#1: sh run.sh [fileName]

Option#2: javac Reader.java && java Reader [fileName]

##### Example Usage
Example#1: ```sh run.sh wrongSolutionExample.txt```

Example#2: ```javac Reader.java && java Reader correctSolutionExample.txt```

# Sample Input

```
6 2 4 5 3 9 1 8 7
5 1 9 7 2 8 6 3 4
8 3 7 6 1 4 2 9 5
1 4 3 8 6 5 7 2 9
9 5 8 2 4 7 3 6 1
7 6 2 3 9 1 4 5 8
3 7 1 9 5 6 8 4 2
4 9 6 1 8 2 5 7 3
2 8 5 4 7 3 9 1 6
```

# Sample Outputs

##### Sample output for wrongSolutionExample.txt:

```
Thread 1, Row 1, Valid
Thread 2, Column 1, Valid
Thread 3, SubGrid R123-C123, Valid
Thread 2, Column 2, Valid
Thread 1, Row 2, Valid
Thread 2, Column 3, Valid
Thread 3, SubGrid R123-C456, Valid
Thread 2, Column 4, Valid
Thread 1, Row 3, Valid
Thread 2, Column 5, Invalid
Thread 3, SubGrid R123-C789, Valid
Thread 2, Column 6, Valid
Thread 1, Row 4, Valid
Thread 2, Column 7, ValidkThread 1, Row 1, Valid
Thread 2, Column 1, Valid
Thread 3, SubGrid R123-C123, Valid
Thread 2, Column 2, Valid
Thread 1, Row 2, Valid
Thread 2, Column 3, Valid
Thread 3, SubGrid R123-C456, Valid
Thread 2, Column 4, Valid
Thread 1, Row 3, Valid
Thread 2, Column 5, Invalid
Thread 3, SubGrid R123-C789, Valid
Thread 2, Column 6, Valid
Thread 1, Row 4, Valid
Thread 2, Column 7, Valid
Thread 3, SubGrid R456-C123, Valid
Thread 2, Column 8, Valid
Thread 1, Row 5, Valid
Thread 2, Column 9, Valid
Thread 1, Row 6, Valid
Thread 3, SubGrid R456-C456, Valid
Thread 1, Row 7, Valid
Thread 3, SubGrid R456-C789, Valid
Thread 1, Row 8, Valid
Thread 3, SubGrid R789-C123, Valid
Thread 1, Row 9, Invalid
Thread 3, SubGrid R789-C456, Invalid
Thread 3, SubGrid R789-C789, Valid
Thread 1, Row 1, Valid
Thread 2, Column 1, Valid
Thread 3, SubGrid R123-C123, Valid
Thread 2, Column 2, Valid
Thread 1, Row 2, Valid
Thread 2, Column 3, Valid
Thread 3, SubGrid R123-C456, Valid
Thread 2, Column 4, Valid
Thread 1, Row 3, Valid
Thread 2, Column 5, Invalid
Thread 3, SubGrid R123-C789, Valid
Thread 2, Column 6, Valid
Thread 1, Row 4, Valid
Thread 2, Column 7, Valid
Thread 3, SubGrid R456-C123, Valid
Thread 2, Column 8, Valid
Thread 1, Row 5, Valid
Thread 2, Column 9, Valid
Thread 1, Row 6, Valid
Thread 3, SubGrid R456-C456, Valid
Thread 1, Row 7, Valid
Thread 3, SubGrid R456-C789, Valid
Thread 1, Row 8, Valid
Thread 3, SubGrid R789-C123, Valid
Thread 1, Row 9, Invalid
Thread 3, SubGrid R789-C456, Invalid
Thread 3, SubGrid R789-C789, Valid
Thread 3, SubGrid R456-C123, Valid
Thread 2, Column 8, Valid
Thread 1, Row 5, Valid
Thread 2, Column 9, Valid
Thread 1, Row 6, Valid
Thread 3, SubGrid R456-C456, Valid
Thread 1, Row 7, Valid
Thread 3, SubGrid R456-C789, Valid
Thread 1, Row 8, Valid
Thread 3, SubGrid R789-C123, Valid
Thread 1, Row 9, Invalid
Thread 3, SubGrid R789-C456, Invalid
Thread 3, SubGrid R789-C789, Valid
```

##### Sample output for correctSolutionExample.txt:

```
Thread 1, Row 1, Valid
Thread 3, SubGrid R123-C123, Valid
Thread 2, Column 1, Valid
Thread 3, SubGrid R123-C456, Valid
Thread 1, Row 2, Valid
Thread 2, Column 2, Valid
Thread 1, Row 3, Valid
Thread 2, Column 3, Valid
Thread 3, SubGrid R123-C789, Valid
Thread 2, Column 4, Valid
Thread 3, SubGrid R456-C123, Valid
Thread 1, Row 4, Valid
Thread 3, SubGrid R456-C456, Valid
Thread 2, Column 5, Valid
Thread 3, SubGrid R456-C789, Valid
Thread 2, Column 6, Valid
Thread 1, Row 5, Valid
Thread 2, Column 7, Valid
Thread 3, SubGrid R789-C123, Valid
Thread 2, Column 8, Valid
Thread 1, Row 6, Valid
Thread 2, Column 9, Valid
Thread 3, SubGrid R789-C456, Valid
Thread 1, Row 7, Valid
Thread 3, SubGrid R789-C789, Valid
Thread 1, Row 8, Valid
Thread 1, Row 9, Valid
```
