package com.example.tugasmobile;
public class ListData {
    String name, surel, fakultas, programBelajar, status;
    int nim, semesterTerdaftar;
    int image;

    public ListData(String name, int nim, int image, String surel, String fakultas, String programBelajar,int semesterTerdaftar, String status) {
        this.name = name;
        this.nim = nim;
        this.surel = surel;
        this.fakultas = fakultas;
        this.programBelajar = programBelajar;
        this.status = status;
        this.semesterTerdaftar = semesterTerdaftar;
        this.image = image;
    }

}