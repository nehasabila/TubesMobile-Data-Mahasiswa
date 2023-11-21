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

        int[] imageList = {R.drawable.neha, R.drawable.jauza, R.drawable.hakim, R.drawable.erastus, R.drawable.yusuf, R.drawable.david, R.drawable.anhar, R.drawable.caesto, R.drawable.fairuz, R.drawable.ikram};
        int[] nimList = {R.string.nehaNim, R.string.jauzaNim, R.string.hakimNim, R.string.erastusNim, R.string.yusufNim, R.string.davidNim, R.string.anharNim, R.string.caestoNim, R.string.fairuzNim, R.string.ikramNim};
        String[] surelList = {"nehasabila62@gmail.com", "jauzaanbari12@gmail.com", "abdulhakim78@gmail.com","erastus42@gmail.com","yusuf60@gmail.com","david141@gmail.com","anhar42@gmail.com","caesto84@gmail.com","fairuz48@gmail.com","ikram108@gmail.com"};
        String[] fakultasList = {"Fasilkom-TI", "Fasilkom-TI","Fasilkom-TI", "Fasilkom-TI","Fasilkom-TI", "Fasilkom-TI","Fasilkom-TI", "Fasilkom-TI","Fasilkom-TI", "Fasilkom-TI"};
        String[] programbelajarList = {"Teknologi Informasi", "Teknologi Informasi","Teknologi Informasi", "Teknologi Informasi","Teknologi Informasi", "Teknologi Informasi","Teknologi Informasi", "Teknologi Informasi","Teknologi Informasi", "Teknologi Informasi"};
        int[] semesterterdaftarList = {R.string.nehaSemesterterdaftar, R.string.jauzaSemesterterdaftar,R.string.nehaSemesterterdaftar, R.string.jauzaSemesterterdaftar,R.string.nehaSemesterterdaftar, R.string.jauzaSemesterterdaftar,R.string.nehaSemesterterdaftar, R.string.jauzaSemesterterdaftar,R.string.nehaSemesterterdaftar, R.string.jauzaSemesterterdaftar};
        String[] statusList = {"Aktif", "Aktif","Aktif", "Aktif","Aktif", "Aktif","Aktif", "Aktif","Aktif", "Aktif"};
        String[] nameList = {"Neha Sabila Nazmira Sitorus", "Jauza Hayah Anbari", "Abdul Hakim Rahmad Nasution", "Erastus Keytaro Bangun", "Yusuf Valentino Pandiangan", "David Stephan Bangun", "Al Anhar Sufi", "Caesto Marco Tampubolon", "Fairuz Arifin Basmara Helmie Marpaung", "Muhammad Ikram Al-Asyari Lubis"};

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