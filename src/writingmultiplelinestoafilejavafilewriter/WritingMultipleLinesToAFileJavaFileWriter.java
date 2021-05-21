/*
 * How To Write Multiple Lines To A Text File In Java Using FileWriter Class
 * https://mauricemuteti.info/how-to-write-multiple-lines-to-a-text-file-in-java-using-filewriter-class/
 */
package writingmultiplelinestoafilejavafilewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Authentic
 */
public class WritingMultipleLinesToAFileJavaFileWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        writeMultipleLinesToATextFile();

    }

    public static void writeMultipleLinesToATextFile() {

        //Declaring FileWriter Object.
        FileWriter fileWriter = null;
        //Stroying file name in a string.
        String pathname = "data.txt";
        //Declaring String Array to hold multiple data
        String[] lines = new String[4];
        lines[0] = "Line 1";
        lines[1] = "Line 2";
        lines[2] = "Line 3";
        lines[3] = "Line 4";
        try {
            //Creating File Object.
            File file = new File(pathname);
            //Initializing filewriter object.
            fileWriter = new FileWriter(file);

            int linecounter = 0;

            System.out.println("Writing content to a file.");
            for (int i = 0; i < lines.length; i++) {
                //Writing content to a file.
                fileWriter.write(lines[i] + "\n");
                //Incrementing line counter.
                linecounter++;
            }

            System.out.println("Finished Writing " + linecounter + " Lines to a file.");
        } catch (IOException iOException) {
            //Catching Exceptions.
            System.out.println("Error : " + iOException.getMessage());
        } finally {

            if (fileWriter != null) {
                try {
                    System.out.println("Closing file writer object");
                    //Closing file writer object.
                    fileWriter.close();
                } catch (IOException iOException) {
                    System.out.println("Error : " + iOException.getMessage());
                }
            }

        }

    }

}
