package gamari.problems.problem1;

import java.util.Scanner;

import gamari.problems.Result;
import gamari.problems.Solver;

public class Problem1 extends Solver {

    public Problem1(Scanner sc) {
        super(sc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result result = new Problem1(sc).solve();
        result.printStack();
    }

    public Result solve() {
        String line = this.readLine();
        int p = Integer.parseInt(line);

        int answer = p * 12;

        Result result = new Result();
        result.setAnswer(String.valueOf(answer));
        return result;
    }
}
