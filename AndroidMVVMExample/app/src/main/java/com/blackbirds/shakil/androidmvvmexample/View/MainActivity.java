package com.blackbirds.shakil.androidmvvmexample.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blackbirds.shakil.androidmvvmexample.R;
import com.blackbirds.shakil.androidmvvmexample.ViewModel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText edtNumberOne, edtNumberTwo;
    AppCompatButton btnAdd;
    TextView txtResult;
    MainActivityViewModel mainActivityViewModel;

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
            String resultText = mainActivityViewModel.addFunction(edtNumberOne.getText().toString(),
                    edtNumberTwo.getText().toString());
            txtResult.setText(resultText);
        });
    }
}