package com.example.applicationofexam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
    TextView txtAnswerOfFahrenheit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_convert);

        initBinding();

        celsiusBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        celsiusConvertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Celsius = edtCelsius.getText().toString();

                if(Celsius.isEmpty())
                {
                    edtCelsiusLayout.setErrorEnabled(true);
                    edtCelsiusLayout.setError("Celsius Is Required !");
                }
                else
                {
                    edtCelsiusLayout.setErrorEnabled(false);

                    double celsius = Double.parseDouble(Celsius);

                    double fahrenheit = celsius * 9/5 + 32;

                    txtAnswerOfFahrenheit.setText(""+fahrenheit);
                }
            }
        });


    }
    void initBinding()
    {
        celsiusBackBtn=findViewById(R.id.celsiusBackBtn);
        celsiusConvertBtn=findViewById(R.id.celsiusConvertBtn);
        edtCelsiusLayout=findViewById(R.id.edtCelsiusLayout);
        edtCelsius=findViewById(R.id.edtCelsius);
        txtAnswerOfFahrenheit=findViewById(R.id.txtAnswerOfFahrenheit);

    }

}