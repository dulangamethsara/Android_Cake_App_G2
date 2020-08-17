package com.example.thecakefairy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private Button btnUR;
    private Button btnAvailable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnUR = findViewById(R.id.btnUR);
        btnAvailable = findViewById(R.id.btnAvailable);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openadd();
            }
        });

        btnUR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUR();
            }
        });

        btnAvailable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openavailable();
            }
        });
    }

    public void openadd(){
        Intent intent =new Intent(this, Add.class);
        startActivity(intent);
    }

    public void openUR(){
        Intent intent = new Intent(this,UR.class);
        startActivity(intent);
    }

    public void openavailable(){
        Intent intent= new Intent(this,Available.class);
        startActivity(intent);
    }
}
