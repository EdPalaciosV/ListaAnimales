package com.example.usuario.listaanimales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    AdapterItem adapterItem;
    List<Items> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.miLista);
        items= new ArrayList<>();
        items.add(new Items(R.drawable.dog,"Perro","Dog"));
        items.add(new Items(R.drawable.cat,"Gato","Cat"));
        items.add(new Items(R.drawable.mouse,"Ratonsito","Mouse"));
        items.add(new Items(R.drawable.tiger,"Tigre","Tiger"));
        items.add(new Items(R.drawable.lion,"Leon","Lion"));
        items.add(new Items(R.drawable.pig,"Cochinito","Pig"));
        items.add(new Items(R.drawable.bear,"Oso","Bear"));
        items.add(new Items(R.drawable.cocodrile,"Cocodrilo","Cocodrile"));
        items.add(new Items(R.drawable.horse,"Caballo","Horse"));
        items.add(new Items(R.drawable.monkey,"Changuito","Monkey"));

        //adapterItem=new AdapterItem(this,R.layout.disenio_listview,items);

        //listView.setAdapter(adapterItem);
    }
}
