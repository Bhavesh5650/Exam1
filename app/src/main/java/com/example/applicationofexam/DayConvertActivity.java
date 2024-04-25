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

public class DayConvertActivity extends AppCompatActivity {

    ImageView dayBackBtn;
    Button dayConvertBtn;
    TextInputLayout edtDayLayout;
    TextInputEditText edtDay;
    TextView txtAnswerOfMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_convert);

        initBinding();
        dayBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        dayConvertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String date = edtDay.getText().toString();

                if(date.isEmpty())
                {
                    edtDayLayout.setErrorEnabled(true);
                    edtDayLayout.setError("Days Is Required !");
                }
                else
                {
                    edtDayLayout.setErrorEnabled(false);

                    double day = Double.parseDouble(date);

                    double month = day / 30 ;

                    txtAnswerOfMonth.setText(""+month);


                }
            }
        });

    }
    void initBinding()
    {
        dayBackBtn=findViewById(R.id.timeBackBtn);
        dayConvertBtn=findViewById(R.id.timeConvertBtn);
        edtDayLayout=findViewById(R.id.edtTimeLayout);
        edtDay=findViewById(R.id.edtTime);
        txtAnswerOfMonth=findViewById(R.id.txtAnswerOfTime);

    }
}