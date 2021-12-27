package io.readfile;

import java.io.*;

public class Main {
    public static void main(String[] args){
        String pathToFile = "src/io/readfile/file/file";
        File file = new File(pathToFile);

        String line = "null";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
