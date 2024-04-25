package com.example.applicationofexam;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class CelsiusConvertActivity extends AppCompatActivity {

    ImageView celsiusBackBtn;
    Button celsiusConvertBtn;
    TextInputLayout edtCelsiusLayout;
    TextInputEditText edtCelsius;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_convert);


    }
}