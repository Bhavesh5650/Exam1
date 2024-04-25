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

public class GramToKiloActivity extends AppCompatActivity {

    Button gramConvertBtn;
    TextInputLayout edtGramLayout;
    TextInputEditText edtGram;
    TextView txtAnswerOfGram;
    ImageView gramBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram_to_kilo);

        initBinding();

        gramBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        gramConvertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gram = edtGram.getText().toString();

                if(gram.isEmpty())
                {
                    edtGramLayout.setErrorEnabled(true);
                    edtGramLayout.setError("Gram Is Required !");
                }
                else
                {
                    edtGramLayout.setErrorEnabled(false);

                    double Gram = Double.parseDouble(gram);

                    double kilo = Gram / 1000;

                    txtAnswerOfGram.setText(""+kilo);

                }

            }
        });
    }

    void initBinding()
    {
        gramConvertBtn=findViewById(R.id.gramConvertBtn);
        gramBackBtn=findViewById(R.id.gramBackBtn);
        edtGramLayout=findViewById(R.id.edtGramLayout);
        edtGram=findViewById(R.id.edtGram);
        txtAnswerOfGram=findViewById(R.id.txtAnswerOfGram);
    }

}