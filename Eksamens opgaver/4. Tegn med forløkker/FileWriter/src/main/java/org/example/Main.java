package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static void drawLeftTriangle(int i) {
        for (int a = 0; a < i+1; a++) {

            for (int b = 0; b < a; b++) {
                write("*");
            }

            write(" ");
        }
        System.out.println();
    }
    public static void write(String s){
        try {
            FileWriter fW = new FileWriter("C:\\Users\\Malte\\OneDrive\\Dokumenter\\GitHub\\cphBusiness\\Eksamens opgaver\\4. Tegn med forløkker\\Tegn med forloekker\\src\\main\\Files\\file");
            fW.write("cyka");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}