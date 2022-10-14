package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button ko;
    private Button papir;
    private Button ollo;
    private TextView ember;
    private TextView gep;
    private Random random;
    private ImageView gepkep;
    private ImageView emberkep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ko=findViewById(R.id.ko);
        papir=findViewById(R.id.papir);
        ollo=findViewById(R.id.ollo);
        ember=findViewById(R.id.ember);
        gep=findViewById(R.id.gep);
        gepkep=findViewById(R.id.gepkep);
        emberkep=findViewById(R.id.emberkep);

        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                egyKo();
            }
        });
        papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                egyPapir();
            }
        });
        ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                egyOllo();
            }
        });

    }
}