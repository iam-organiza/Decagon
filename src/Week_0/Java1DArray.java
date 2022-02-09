package Week_0;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Java1DArray {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n;

        try {
            n = Integer.parseInt(bufferedReader.readLine().trim());
        } catch (Exception e) {
            System.out.println("Invalid input!");
            return;
        }

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }

        bufferedReader.close();
    }

}
