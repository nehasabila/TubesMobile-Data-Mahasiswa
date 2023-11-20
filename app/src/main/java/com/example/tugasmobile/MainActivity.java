package com.example.tugasmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.tugasmobile.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageList = {R.drawable.neha, R.drawable.jauza};
        int[] nimList = {R.string.nehaNim, R.string.jauzaNim};
        String[] surelList = {"nehasabila62@gmail.com", "jauzaanbari12@gmail.com"};
        String[] fakultasList = {"Fasilkom-TI", "Fasilkom-TI"};
        String[] programbelajarList = {"Teknologi Informasi", "Teknologi Informasi"};
        int[] semesterterdaftarList = {R.string.nehaSemesterterdaftar, R.string.jauzaSemesterterdaftar};
        String[] statusList = {"Aktif", "Aktif"};
        String[] nameList = {"Neha Sabila Nazmira Sitorus", "Jauza Hayah Anbari"};

        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(nameList[i], nimList[i], imageList[i], surelList[i], fakultasList[i], programbelajarList[i], semesterterdaftarList[i], statusList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new ListAdapter(MainActivity.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);
                intent.putExtra("name", nameList[i]);
                intent.putExtra("nim", nimList[i]);
                intent.putExtra("surel", surelList[i]);
                intent.putExtra("fakultas", fakultasList[i]);
                intent.putExtra("programbelajar", programbelajarList[i]);
                intent.putExtra("semesterterdaftar", semesterterdaftarList[i]);
                intent.putExtra("status", statusList[i]);
                intent.putExtra("image", imageList[i]);
                startActivity(intent);
            }
        });
    }
}