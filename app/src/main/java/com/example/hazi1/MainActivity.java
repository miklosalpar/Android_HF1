    package com.example.hazi1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        EditText szam1=findViewById(R.id.szam1);
        EditText szam2=findViewById(R.id.szam2);
        Button osszead=findViewById(R.id.osszead);
        Button kivon=findViewById(R.id.kivon);
        Button oszt=findViewById(R.id.oszt);
        Button szoroz=findViewById(R.id.szoroz);
        TextView eredmeny=findViewById(R.id.eredmeny);


        osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double ered=Double.parseDouble(szam1.getText().toString())+
                            Double.parseDouble(szam2.getText().toString());
                    eredmeny.setText(Double.toString(ered));
                    Toast.makeText(MainActivity.this, szam2.getText().toString(), Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_SHORT).show();
                }

            }
        });

        kivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double ered=Double.parseDouble(szam1.getText().toString())-
                            Double.parseDouble(szam2.getText().toString());
                    eredmeny.setText(Double.toString(ered));
                    Toast.makeText(MainActivity.this, szam2.getText().toString(), Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_SHORT).show();
                }

            }
        });

        oszt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double ered=Double.parseDouble(szam1.getText().toString())/
                            Double.parseDouble(szam2.getText().toString());
                    eredmeny.setText(Double.toString(ered));
                    Toast.makeText(MainActivity.this, szam2.getText().toString(), Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_SHORT).show();
                }

            }
        });

        szoroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double ered=Double.parseDouble(szam1.getText().toString())*
                            Double.parseDouble(szam2.getText().toString());
                    eredmeny.setText(Double.toString(ered));
                    Toast.makeText(MainActivity.this, szam2.getText().toString(), Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}