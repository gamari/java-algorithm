package gamari.problems.problem2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import gamari.problems.Result;

public class Problem2Test {
    @Test
    public void testSolve() throws IOException {
        try (Scanner sc = new Scanner(new File("problems/problem2/input.txt"))) {
            Result result = new Problem2(sc).solve();

            String expectedOutput = new String(Files.readAllBytes(Paths.get("problems/problem2/output.txt")),
                    StandardCharsets.UTF_8).trim();

            assertEquals(expectedOutput, result.getAnswer().trim());
        }
    }
}
