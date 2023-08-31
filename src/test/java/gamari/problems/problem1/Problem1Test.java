package gamari.problems.problem1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import gamari.problems.Result;

public class Problem1Test {
    @Test
    public void testSolve() throws IOException {
        try (Scanner sc = new Scanner(new File("problems/problem1/input.txt"))) {
            Result result = new Problem1(sc).solve();

            String expectedOutput = new String(Files.readAllBytes(Paths.get("problems/problem1/output.txt")),
                    StandardCharsets.UTF_8).trim();

            assertEquals(expectedOutput, result.getAnswer().trim());
        }
    }
}
