package com.example.bootcodingmaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Assignment {
        int qid;
        String title;
        String difficultyLevel;
        Double acceptanceRate;
        boolean paidOnly;


    }

