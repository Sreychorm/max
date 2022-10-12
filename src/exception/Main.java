package exception;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try{
            BufferedWriter writer= new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Good Morning");
            writer.write("\nSay Good Bye");
            writer.close();
        } catch (IOException ex) {
           System.out.println("Error"+ex.getMessage());
        }
        try{
            BufferedReader reader= new BufferedReader(new FileReader("output.txt"));
            System.out.println("Here is the file content");
//            System.out.println(reader.readLine());
            String line ;
            while( (line =reader.readLine()) !=null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException ex){
            ex.printStackTrace();

        }
    }
}
