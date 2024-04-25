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

public class InchConvertActivity extends AppCompatActivity {

    ImageView inchBackBtn;
    Button inchConvertBtn;
    TextInputLayout edtInchLayout;
    TextInputEditText edtInch;
    TextView txtAnswerOfFeet,txtAnswerOfMeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inch_convert);

        initBinding();

        inchBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        inchConvertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inch = edtInch.getText().toString();

                if(inch.isEmpty())
                {
                    edtInchLayout.setErrorEnabled(true);
                    edtInchLayout.setError("Inch Is Required !");
                }
                else
                {
                    edtInchLayout.setErrorEnabled(false);

                    double Inch = Double.parseDouble(inch);

                    double feet = Inch / 12;
                    double meter = Inch * 0.0254;

                    txtAnswerOfFeet.setText(""+feet);
                    txtAnswerOfMeter.setText(""+meter);
                }
            }
        });

    }

    void initBinding()
    {
        inchBackBtn=findViewById(R.id.inchBackBtn);
        inchConvertBtn=findViewById(R.id.inchConvertBtn);
        edtInchLayout=findViewById(R.id.edtInchLayout);
        edtInch=findViewById(R.id.edtInch);
        txtAnswerOfFeet=findViewById(R.id.txtAnswerOfFeet);
        txtAnswerOfMeter=findViewById(R.id.txtAnswerOfMeter);
    }

}