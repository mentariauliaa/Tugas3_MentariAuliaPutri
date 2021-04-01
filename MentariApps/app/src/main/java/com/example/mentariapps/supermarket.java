package com.example.mentariapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class supermarket extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listsupermarket = new String[] {"Swalayan 999","Planet Swalayan Marpoyan","711 Toserba"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listsupermarket));

    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try{
            Intent a = null;
            if (pilihan.equals("Swalayan 999")) {
                a = new Intent(this,swalayan999.class);

            }else if (pilihan.equals("Planet Swalayan Marpoyan"))
            {
                a = new Intent(this,planetswalayan.class);

            }else if (pilihan.equals("711 Toserba"))
            {
                a = new Intent(this,toserba.class);


            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

