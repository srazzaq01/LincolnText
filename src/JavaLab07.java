import java.io.*;
import java.util.*;
public class JavaLab07 {
    public static void main(String[] args) throws FileNotFoundException{
        //asking user to input the file name
        System.out.println("Enter a file name: ");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.next();
        //creating a file of the entered name, make sure file is in the project folder
        File file = new File(fileName);

        //if the file does not exist then terminate the program, else we continue
        if(!file.exists()){
            System.out.println("source file " + fileName + " does not exist");
            System.exit(1);
        }

        //creating another Scanner to read the file and two counter variables
        Scanner input = new Scanner(file);
        int wordCount = 0;
        int lineCount = 0;

        //iterate while input.hasNext
        while(input.hasNext()){
            //reading one line
            String line = input.nextLine();
            lineCount++;
            //splitting at space
            String[] arr = line.split(" ");
            //for loop that checks if the length is greater than 0 in case of empty line
            for (int i = 0; i < arr.length; i++){
                if (arr[i].length() > 0){
                    wordCount++;
                }
            }
        }
        //printing the file information
        System.out.println("file "+ fileName + " has");
        System.out.println("number of words: " + wordCount);
        System.out.println("number of lines: " + lineCount);

    }
}
