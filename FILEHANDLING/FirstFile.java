import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FirstFile {

    public static void main(String[] args) throws IOException {
//
//        //code to create a new file
//        File file = new File("first.txt");
//        file.createNewFile();
//    }

        //code to write a new file

        try {
            FileWriter myfile = new FileWriter("first.txt");
            myfile.write("First File\n");
            myfile.write("you are too good");
            myfile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //To read a file
        File file = new File("first.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();

        //To delete a file
        File  file1 = new File("first.txt");
        if(file.delete()) {
            System.out.println("file has been deleted" + file1);
        }
        else {
            System.out.println("file could not be deleted" + file1);
        }

    }
}