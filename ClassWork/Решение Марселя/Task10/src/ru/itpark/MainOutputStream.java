package ru.itpark;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainOutputStream {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("Figures.txt");

        String FiguresMessage = "square, circle";

        byte FigureMessage[] = FiguresMessage.getBytes();
        try {
            outputStream.write(FigureMessage);
        } catch (IOException e) {
            System.out.println("Нет такого файла");
        }
    }
}
