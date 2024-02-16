package com.example.bootcodingmaster.Dao;

import com.example.bootcodingmaster.model.Assignment;

import java.util.List;

public interface AssignmentDao {
    void  SaveAssignment(List<Assignment> assignment);

    List<Assignment> getData();

    List<Assignment> getByDifficultyLevel(String input);

    List <Assignment> getByPaidOnly(boolean input);
}
