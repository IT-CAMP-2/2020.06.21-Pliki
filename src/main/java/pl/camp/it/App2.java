package pl.camp.it;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) {
        try {
            String plik = "/home/mateusz/ITCamp-Kraków#2/plik.txt";

            FileReader fileReader = new FileReader(plik);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linijka;
            while ((linijka = bufferedReader.readLine()) != null) {
                System.out.println(linijka);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
