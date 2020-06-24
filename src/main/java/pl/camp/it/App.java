package pl.camp.it;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            String fileName = "/home/mateusz/ITCamp-Kraków#2/plik.txt";
            String str = "World";

            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(str);

            writer.newLine();
            writer.append("W nowej linii");
            writer.append("Cos jeszcze");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
