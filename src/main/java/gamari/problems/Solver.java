package gamari.problems;

import java.util.Scanner;

public abstract class Solver {
    protected Scanner sc;

    public Solver(Scanner sc) {
        this.sc = sc;
    }

    public int readInt() {
        return sc.nextInt();
    }

    public char readChar() {
        return sc.next().charAt(0);
    }

    public String readLine() {
        return sc.nextLine();
    }

    public String[] readLineToStringArray() {
        return this.readLineToStringArray("");
    }

    public String[] readLineToStringArray(String splitter) {
        String[] line = this.readLine().split(splitter);
        return line;
    }

    public int[] readLineToIntArray() {
        return this.readLineToIntArray("");
    }

    public int[] readLineToIntArray(String splitter) {
        String[] line = readLine().split(splitter);
        int[] array = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            array[i] = Integer.parseInt(line[i]);
        }
        return array;
    }

    public int[][] readGrid(int rows, int cols, String splitter) {
        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = readLineToStringArray(splitter);
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Integer.parseInt(line[j]);
            }
        }

        return grid;
    }

    public abstract Result solve();
}
