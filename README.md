---
- Name: Baboya Choik Choch \*
- LSUID: 890311743 \*
- Email: bchoch1@lsu.edu \* \*
---

I will provide two ways to run the program. I recommend OPTION#1 because it is a bash
script I wrote that both runs the program and deletes the excess generated .class files.
If you want to see the .class files use OPTION#2.

Examples of usage will be provided below.

Replace [fileName] with the name of the txt file that contains the solution

---

OPTION#1: sh run.sh [fileName]

OPTION#2: javac Reader.java && java Reader [fileName]

---

Example#1: sh run.sh wrongSolutionExample.txt

Example#2: javac Reader.java && java Reader sudoku.txt

---

An example of the expected output for wrongSolutionExample.txt:

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

---

An example of the expected output for the provided sudoku.txt on moodle:

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
