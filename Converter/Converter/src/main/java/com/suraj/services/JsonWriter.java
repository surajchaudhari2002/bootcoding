package com.suraj.services;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.suraj.model.Asignments;
import com.suraj.utils.FileWriter;

import java.io.File;
import java.util.List;

public class JsonWriter implements FileWriter {
    @Override
    public void write(List<Asignments> list) {
        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.writeValue(new File("C:\\Users\\ASUS\\suraj\\Converter\\Converter\\src\\main\\java\\com\\suraj\\utils\\questions.json"), list);
            System.out.println("JSON File has been created succefully.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
