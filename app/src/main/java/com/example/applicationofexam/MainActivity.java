package com.example.applicationofexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView gramToKiloCardView,inchCardView,celsiusCardView,timeCardView,dayCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBinding();

        gramToKiloCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(MainActivity.this,GramToKiloActivity.class);
                startActivity(intent1);
            }
        });
        inchCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(MainActivity.this,InchConvertActivity.class);
                startActivity(intent2);
            }
        });
        celsiusCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

    void initBinding()
    {
        gramToKiloCardView=findViewById(R.id.gramToKiloCardView);
        inchCardView=findViewById(R.id.inchCardView);
        celsiusCardView=findViewById(R.id.celsiusCardView);
        timeCardView=findViewById(R.id.timeCardView);
        dayCardView=findViewById(R.id.dayCardView);
    }


}