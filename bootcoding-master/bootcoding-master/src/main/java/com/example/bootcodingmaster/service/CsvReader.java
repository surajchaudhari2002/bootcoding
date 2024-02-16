
// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.example.bootcodingmaster.service;

import com.example.bootcodingmaster.utils.IFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader implements IFileReader {
    public List<String> read(String csvFile) {
        List<String> recordData = new ArrayList<>();
        String line = "";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(csvFile));
            reader.readLine();
            while ((line = reader.readLine())  != null){
                recordData.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return recordData;
    }
}

