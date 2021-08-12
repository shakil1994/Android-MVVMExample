package com.blackbirds.shakil.mvvmexample.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.blackbirds.shakil.mvvmexample.R;
import com.blackbirds.shakil.mvvmexample.viewModel.MainActivityViewModel;

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
            String result = mainActivityViewModel.addFunction(edtNumberOne.getText().toString(),
                    edtNumberTwo.getText().toString());
            txtResult.setText(result);
        });
    }
}