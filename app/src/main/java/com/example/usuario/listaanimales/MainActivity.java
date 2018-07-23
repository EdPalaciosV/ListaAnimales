package com.example.usuario.listaanimales;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    AdapterItem adapterItem;
    List<Items> items;
    MediaPlayer mediaPlayer;
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

        adapterItem=new AdapterItem(MainActivity.this,R.layout.disenio_listview,items);

        listView.setAdapter(adapterItem);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_SHORT).show();
                String dato = items.get(position).getTextoIngles();

                switch (dato)
                {
                    case "Dog":
                        mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.dog);
                        break;
                    case "Cat":
                        mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.cat);
                        break;
                    case "Mouse":
                        mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.mouse);
                        break;
                    case "Tiger":
                        mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.tiger);
                        break;
                    case "Lion":
                        mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.lion);
                        break;
                    case "Pig":
                        mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.pig);
                        break;
                    case "Bear":
                        mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.bear);
                        break;
                    case "Cocodrile":
                        mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.cocodrile);
                        break;
                    case "Horse":
                        mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.horse);
                        break;
                    case "Monkey":
                        mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.monkey);
                        break;
                }
                mediaPlayer.start();
            }
        });

    }
}
