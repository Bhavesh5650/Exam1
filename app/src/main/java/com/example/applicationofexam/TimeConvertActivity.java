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

public class TimeConvertActivity extends AppCompatActivity {

    ImageView timeBackBtn;
    Button timeConvertBtn;
    TextInputLayout edtTimeLayout;
    TextInputEditText edtTime;
    TextView txtAnswerOfTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_convert);

        initBinding();

        timeBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        timeConvertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sec = edtTime.getText().toString();

                if(sec.isEmpty())
                {
                    edtTimeLayout.setErrorEnabled(true);
                    edtTimeLayout.setError("Seconds Is Required !");
                }
                else
                {
                    edtTimeLayout.setErrorEnabled(false);

                    int second = Integer.parseInt(sec);

                    int s = second % 60;
                    int h = second / 60;
                    int m = h % 60;
                    h = h / 60;

                    txtAnswerOfTime.setText(h+":"+m+":"+s);

                }
            }
        });
    }
    void initBinding()
    {
        timeBackBtn=findViewById(R.id.timeBackBtn);
        timeConvertBtn=findViewById(R.id.timeConvertBtn);
        edtTimeLayout=findViewById(R.id.edtTimeLayout);
        edtTime=findViewById(R.id.edtTime);
        txtAnswerOfTime=findViewById(R.id.txtAnswerOfTime);

    }
}