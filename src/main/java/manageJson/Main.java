package manageJson;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ArrayList<Country> countries = new ArrayList<Country>();
//        countries.add(new Country("India"));
//        countries.add(new Country("Singapore"));
//        countries.add(new Country("Malaysia"));
//
//        FileOutputStream fileOut = new FileOutputStream("test.ser");
//        ObjectOutputStream out = new ObjectOutputStream(fileOut);
//        out.writeObject(countries);
//        out.close();
//        fileOut.close();

        ArrayList<Country> countries = null;
        FileInputStream fileIn = new FileInputStream("test.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        countries = (ArrayList<Country>)(in.readObject());
        in.close();
        fileIn.close();
    }
}