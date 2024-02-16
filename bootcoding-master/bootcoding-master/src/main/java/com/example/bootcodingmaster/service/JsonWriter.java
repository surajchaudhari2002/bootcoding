package com.example.bootcodingmaster.service;

import com.example.bootcodingmaster.model.Assignment;
import com.example.bootcodingmaster.utils.IFileWriter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonWriter implements IFileWriter {
    @Override
    public void write(List<Assignment> list, String filename) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filename), list);
            System.out.println("JSON file created successfully.");
        } catch (IOException e) {
            System.out.println("Error writing JSON file: " + e.getMessage());
        }
    }
}

