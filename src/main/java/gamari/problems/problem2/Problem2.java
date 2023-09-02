package gamari.problems.problem2;

import java.util.Scanner;

import gamari.problems.Result;
import gamari.problems.Solver;
import gamari.problems.problem1.Problem1;

public class Problem2 extends Solver {
    public Problem2(Scanner sc) {
        super(sc);
    }

    public static void main(String[] args) {
        // template
        Result result = new Problem2(new Scanner(System.in)).solve();
        result.printStack();
    }

    public Result solve() {
        // init
        int[] line1 = this.readLineToIntArray(" ");
        int N = line1[0];
        int H = line1[1];
        int W = line1[2];

        int[] line2 = this.readLineToIntArray(" ");
        int sy = line2[0];
        int sx = line2[1];

        String[] operations = this.readLineToStringArray();

        // (y, x) - (h, w)
        // int[][] seki = new int[H][W];
        int[][] grid = this.readGrid(H, W, " ");

        int currentY = sy - 1;
        int currentX = sx - 1;
        StringBuilder builder = new StringBuilder();

        for (String operation : operations) {
            if ("F".equals(operation)) {
                currentY -= 1;
            } else if ("B".equals(operation)) {
                currentY += 1;
            } else if ("L".equals(operation)) {
                currentX -= 1;
            } else if ("R".equals(operation)) {
                currentX += 1;
            }

            builder.append(String.valueOf(grid[currentY][currentX]) + "\r\n");
        }

        // answer
        Result result = new Result();
        result.setAnswer(builder.toString());
        return result;
    }

}
