package io.writefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String[] strings = {"string-1", "string-2", "string-3"};

        String pathToFile = "src/io/writefile/file/file";
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToFile))){
            for(String s : strings){
                bufferedWriter.write(s);
                bufferedWriter.write(System.lineSeparator());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
