package lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        File file = new File("file/text.txt");
        File file2 = new File("file/text2.txt");
        File file3 = new File("file/text3.txt");
        File file4 = new File("file/text4.txt");
        printData(file);
        String string = "none";
        addString(string, file2);
        List<String> lines = printData(file);
        List<String> lines2 = printData(file2);
        List<String> concatlines = new ArrayList<>();
        concatlines.addAll(lines);
        concatlines.addAll(lines2);
        mergeFiles(concatlines, file3);
        replacer(file3, file4);
    }

    public static List<String> printData(File file) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                lines.add(input);
            }
            System.out.println(lines);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return lines;
    }

    public static void addString(String strings, File file) {
        FileWriter writer = null;
        BufferedWriter bufferWriter = null;
        try {
            writer = new FileWriter(file, true);
            bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(strings + "\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (bufferWriter != null) {
                    bufferWriter.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing writer: " + e.getMessage());
            }
        }
        printData(file);
    }


    public static void mergeFiles(List<String> lines, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                writer.write(line + "\n");
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void replacer(File file, File file2) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replaceAll("[^A-Za-zА-Яа-я0-9ё]", "\\$") + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}