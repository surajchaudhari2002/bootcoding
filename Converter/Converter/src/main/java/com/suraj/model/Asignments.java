package com.suraj.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Asignments {
    int qid;
    String title;
    String difficulty;
    Double acceptanceRate;
    Boolean paidOnly;

}
