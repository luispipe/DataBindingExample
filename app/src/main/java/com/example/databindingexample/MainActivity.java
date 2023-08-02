package com.example.databindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflando o agregando el diseño y a su vez estamos enlazando los datos
        ActivityMainBinding binding=
                DataBindingUtil.setContentView(this,R.layout.activity_main);

        //Obtener la instancia del ViewModel
        MyViewModel viewModel= new ViewModelProvider(this).get(MyViewModel.class);

        // Enlazar el viewModel con los datos

        binding.setViewModel(viewModel);

        //Propietario del ciclo de vida de los datos
        binding.setLifecycleOwner(this);

    }
}