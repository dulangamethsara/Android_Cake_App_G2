package com.example.thecakefairy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Available extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available);

        Intent intent =new Intent();
        listView = (ListView)findViewById(R.id.ListView);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add(" CHOCO SUPPREME "+"-----"+" Birthday "+"-----"+" 1 kg "+"-----"+" 2750.00 RS ");
        arrayList.add(" HEARTS CAKE "+"-----"+"Aniversary"+"-----"+" 1kg "+"-----"+" 2800.00 RS ");
        arrayList.add(" REDVELVET CAKE "+"-----"+"Aniversary"+"-----"+" 500g "+"-----"+" 1415.00 RS ");
        arrayList.add(" OREO SUPREME "+"-----"+"Birthday"+"-----"+" 1.5kg "+"-----"+" 3650.00 RS ");
        arrayList.add(" CHOCO SUPPREME "+"-----"+" Birthday "+"-----"+" 1 kg "+"-----"+" 2750.00 RS ");
        arrayList.add(" HEARTS CAKE "+"-----"+"Aniversary"+"-----"+" 1kg "+"-----"+" 2800.00 RS ");
        arrayList.add(" REDVELVET CAKE "+"-----"+"Aniversary"+"-----"+" 500g "+"-----"+" 1415.00 RS ");
        arrayList.add(" OREO SUPREME "+"-----"+"Birthday"+"-----"+" 1.5kg "+"-----"+" 3650.00 RS ");
        arrayList.add(" CHOCO SUPPREME "+"-----"+" Birthday "+"-----"+" 1 kg "+"-----"+" 2750.00 RS ");
        arrayList.add(" HEARTS CAKE "+"-----"+"Aniversary"+"-----"+" 1kg "+"-----"+" 2800.00 RS ");
        arrayList.add(" REDVELVET CAKE "+"-----"+"Aniversary"+"-----"+" 500g "+"-----"+" 1415.00 RS ");
        arrayList.add(" OREO SUPREME "+"-----"+"Birthday"+"-----"+" 1.5kg "+"-----"+" 3650.00 RS ");
        arrayList.add(" CHOCO SUPPREME "+"-----"+" Birthday "+"-----"+" 1 kg "+"-----"+" 2750.00 RS ");
        arrayList.add(" HEARTS CAKE "+"-----"+"Aniversary"+"-----"+" 1kg "+"-----"+" 2800.00 RS ");
        arrayList.add(" REDVELVET CAKE "+"-----"+"Aniversary"+"-----"+" 500g "+"-----"+" 1415.00 RS ");
        arrayList.add(" OREO SUPREME "+"-----"+"Birthday"+"-----"+" 1.5kg "+"-----"+" 3650.00 RS ");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_activated_1,arrayList);

        listView.setAdapter(arrayAdapter);

    }
}