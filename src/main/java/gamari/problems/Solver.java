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

    public String readLine() {
        return sc.nextLine();
    }

    public char readChar() {
        return sc.next().charAt(0);
    }

    public abstract Result solve();
}
