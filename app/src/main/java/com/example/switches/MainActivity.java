package com.example.switches;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button Switch_1,Switch_2,Switch_3,Switch_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch_1 = findViewById(R.id.switch1_button_id);
        Switch_2 = findViewById(R.id.switch2_button_id);
        Switch_3 = findViewById(R.id.switch3_button_id);
        Switch_4 = findViewById(R.id.switch4_button_id);

        GradientDrawable BGshape = (GradientDrawable) Switch_1.getBackground();
        BGshape.setColor(Color.RED);

        Switch_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Switch 1 Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Switch_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Switch 2 Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Switch_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Switch 3 Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Switch_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Switch 4 Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}