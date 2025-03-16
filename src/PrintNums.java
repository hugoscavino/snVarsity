import java.util.Scanner;

public class PrintNums {
    static class SomeFile {
        String readLine() {
            return "48 78 57 63";

        }
    }

    static class SomeOutFile {
        void print(String s) {
            System.out.println(s);
        }
    }

    static SomeFile inFile = new SomeFile();
    static SomeOutFile outFile = new SomeOutFile();

    public static void printNums() {
        int n;
        String line;
        line = inFile.readLine();
        if (line != null) {
            n = Integer.valueOf(line).intValue();
            outFile.print(n + " ");
            printNums();
            outFile.print(n + " ");
        }
    }

    public static void main(String[] args) {
        printNums();
    }
}

