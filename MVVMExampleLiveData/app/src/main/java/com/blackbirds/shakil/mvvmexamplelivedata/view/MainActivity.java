package com.blackbirds.shakil.mvvmexamplelivedata.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.blackbirds.shakil.mvvmexamplelivedata.R;
import com.blackbirds.shakil.mvvmexamplelivedata.viewModel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;
    AppCompatEditText edtNumberOne, edtNumberTwo;
    AppCompatButton btnAdd;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        edtNumberOne = findViewById(R.id.edtNumberOne);
        edtNumberTwo = findViewById(R.id.edtNumberTwo);
        btnAdd = findViewById(R.id.btnAdd);
        txtResult = findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(v -> {
            mainActivityViewModel.addFunction(edtNumberOne.getText().toString(),
                    edtNumberTwo.getText().toString()).observe(this, s -> {
                txtResult.setText(s);
            });

        });
    }
}