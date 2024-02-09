package com.suraj.services;

import com.suraj.model.Asignments;

import java.util.ArrayList;
import java.util.List;

public class AssignmentService {
    public List<Asignments> readFile(String filePath){
        List<Asignments> assignmentList = new ArrayList<>();
        CsvReader csvFileReader = new CsvReader();
        List<String> data = csvFileReader.read(filePath);

        for(String row: data){
//            Assignment sendToConvert = convert(row);
            Asignments assignment = convertObject(row);
            assignmentList.add(assignment);
//            System.out.println(row);

        }

        return assignmentList;
    }

    public Asignments convertObject(String row){
        // logic to split row string
        String[] values = row.split(",");
        // build Assignment object
        try{
            return new Asignments(Integer.parseInt(values[0]),values[1],values[3],Double.parseDouble(values[4]),Boolean.parseBoolean(values[5]));
        }catch (Exception e){
            return new Asignments(Integer.parseInt(values[0]),values[1],values[3],0.0d,Boolean.parseBoolean(values[5]));
        }
    }

    public void JsonConvert(List<Asignments> object){
        JsonWriter jsonFileWriter = new JsonWriter();
        jsonFileWriter.write(object);
    }
}
