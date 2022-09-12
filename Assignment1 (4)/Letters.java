import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class VowelNotAllowedException extends Exception {
    VowelNotAllowedException() {
        System.out.println("Vowel is encountered!");
    }
}

class Letters {
    public static void main(String[] args) throws FileNotFoundException,IOException {

        File ipFile = new File("Alphabets.txt");
        File opFile = new File("Consonants.txt");
        FileReader ipReader = new FileReader(ipFile);
        FileWriter opWriter = new FileWriter(opFile);

        BufferedReader buffReader = new BufferedReader(ipReader);
        int temp;
        while ((temp = buffReader.read()) != -1) {
            char c = (char) temp;

            if (Letters.isVowel(c) == false) {
                System.out.println(c);
                opWriter.append(c);
            } else {
                try {
                    throw new VowelNotAllowedException();
                } catch (VowelNotAllowedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'A')
            return true;
        else if (c == 'e' || c == 'E')
            return true;
        else if (c == 'i' || c == 'I')
            return true;
        else if (c == 'o' || c == 'O')
            return true;
        else if (c == 'u' || c == 'U')
            return true;
        else
            return false;
    }
}
