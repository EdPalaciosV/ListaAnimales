package com.example.usuario.listaanimales;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterItem extends ArrayAdapter<Items> {

    Context context;
    int layout;
    List<Items> items;
    public AdapterItem(Context context, int resource,List<Items> items) {
        super(context, resource, items);
        this.context=context;
        layout=resource;
        this.items=items;

    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        //View view;
        //LayoutInflater permite  colocar los atributos de diseño( R.layout.disenio_listview) ala variable de tipo view
       // LayoutInflater inflater=LayoutInflater.from(context);
        /*el primer parametro :corresponde al diseño que creamos.
        segundo parametro: corresponde al contenedor (LinearLayout,RelativeLyout,etc) en donde  se adjuntaria la estructura
        tercer parametro permite adjuntar la vista inflada(true) o no(false)*/

        //view=inflater.inflate(R.layout.disenio_listview,null,false);

        //enlazamos las vistas ya que la variable view tiene los atributos de estas.
        //ImageView imagen=view.findViewById(R.id.imagen);
        //TextView tvEspañol=view.findViewById(R.id.textoEspañol);
        //TextView tvIngles=view.findViewById(R.id.textoIngles);

        //Items items1=items.get(position);
        //colocamos los datos alas vistas ( 1 Imageview y 2 Textviews)
        //imagen.setImageResource(items1.getImagen());
        //tvEspañol.setText(items1.getTextoEspañol());
        //tvIngles.setText(items1.getTextoIngles());
        /*devuelve la vista ya cargada con los datos ya colocados en la  Imageview y los Textviews ya listos
        para ser visualizados en el listview*/

        //*****************Forma optima para solo utilizar el metodo findViewById una vez en la ejecución del programa********************************
        HolderItem holderItem;

        if(convertView==null)
        {
            LayoutInflater inflater=LayoutInflater.from(context);
            convertView=inflater.inflate(R.layout.disenio_listview,null,false);

            holderItem=new HolderItem();
            holderItem.imagen=convertView.findViewById(R.id.imagen);
            holderItem.tvEspañol=convertView.findViewById(R.id.textoEspañol);
            holderItem.tvIngles=convertView.findViewById(R.id.textoIngles);

            convertView.setTag(holderItem);

        }
        else
        {
            holderItem=(HolderItem) convertView.getTag();

        }

        holderItem.imagen.setImageResource(items.get(position).getImagen());
        holderItem.tvEspañol.setText(items.get(position).getTextoEspañol());
        holderItem.tvIngles.setText(items.get(position).getTextoIngles());

        return convertView;
    }
}

