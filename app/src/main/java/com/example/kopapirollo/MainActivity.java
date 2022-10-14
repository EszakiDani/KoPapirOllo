package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    private ImageView en;
    private ImageView aGep;
    private String gepValasztas;
    private String valasztas;
    private  String eredmeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ko=findViewById(R.id.ko);
        papir=findViewById(R.id.papir);
        ollo=findViewById(R.id.ollo);
        ember=findViewById(R.id.ember);
        gep=findViewById(R.id.gep);
        en=findViewById(R.id.en);
        aGep=findViewById(R.id.aGep);


        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas="kő";
                en.setImageResource(R.drawable.rock);
                eredmeny();
            }
        });
        papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas="papír";
                en.setImageResource(R.drawable.paper);
                eredmeny();
            }
        });
        ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas="olló";
                en.setImageResource(R.drawable.scissors);
                eredmeny();

            }
        });
    }
    private void eredmeny(){
        int a= random.nextInt(3);
        if(a==0){
            gepValasztas="kő";
            aGep.setImageResource(R.drawable.rock);
        }else if(a==1){
            gepValasztas="papír";
            aGep.setImageResource(R.drawable.paper);
        }else if(a==2) {
            gepValasztas = "olló";
            aGep.setImageResource(R.drawable.scissors);
        }

        if(valasztas.equals("kő")&&gepValasztas.equals("olló")){
            eredmeny="Nyertél";
        } else if(valasztas.equals("kő")&&gepValasztas.equals("papír")){
            eredmeny="Vesztettél";

        } else if(valasztas.equals("kő")&&gepValasztas.equals("kő")){
            eredmeny="Döntettlen";

        } else if(valasztas.equals("papír")&&gepValasztas.equals("kő")){
            eredmeny="Nyertél";

        } else if(valasztas.equals("papír")&&gepValasztas.equals("papír")){
            eredmeny="Döntettlen";

        } else if(valasztas.equals("papir")&&gepValasztas.equals("olló")){
            eredmeny="Vesztettél";

        } else  if(valasztas.equals("olló")&&gepValasztas.equals("olló")){
            eredmeny="Döntettlen";

        } else  if(valasztas.equals("olló")&&gepValasztas.equals("kő")){
            eredmeny="Nyertél";

        } else if(valasztas.equals("olló")&&gepValasztas.equals("papír")){
            eredmeny="Vesztettél";
        }
        Toast.makeText(MainActivity.this,eredmeny,Toast.LENGTH_SHORT).show();

    }
}