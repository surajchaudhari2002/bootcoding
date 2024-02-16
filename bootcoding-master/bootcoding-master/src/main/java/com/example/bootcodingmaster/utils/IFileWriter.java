package com.example.bootcodingmaster.utils;

import com.example.bootcodingmaster.model.Assignment;

import java.util.List;

public interface IFileWriter {
    void write(List<Assignment> list, String filename);
}
