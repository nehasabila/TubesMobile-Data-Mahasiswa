package com.example.tugasmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tugasmobile.databinding.ActivityDetailedBinding;

public class DetailedActivity extends AppCompatActivity {

    ActivityDetailedBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();
        if (intent != null){
            String name = intent.getStringExtra("name");
//            String time = intent.getStringExtra("time");
            int nim = intent.getIntExtra("nim", R.string.nehaNim);
            String surel = intent.getStringExtra("surel");
            String fakultas = intent.getStringExtra("fakultas");
            String programbelajar = intent.getStringExtra("programbelajar");
            int semesterterdaftar = intent.getIntExtra("semesterterdaftar", R.string.nehaSemesterterdaftar);
            String status = intent.getStringExtra("status");
            int image = intent.getIntExtra("image", R.drawable.maggi);

            binding.detailName.setText(name);
//            binding.detailTime.setText(time);
            binding.detailNim.setText(nim);
            binding.detailSurel.setText(surel);
            binding.detailFakultas.setText(fakultas);
            binding.detailProgrambelajar.setText(programbelajar);
            binding.detailSemesterterdaftar.setText(semesterterdaftar);
            binding.detailStatus.setText(status);
            binding.detailImage.setImageResource(image);
        }
    }
}