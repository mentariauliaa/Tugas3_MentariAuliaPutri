package com.example.mentariapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sekolah extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listsekolah = new String[] {"SMA N 1 Pekanbaru","SMA N 2 Pekanbaru","SMA N 3 Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listsekolah));

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
            if (pilihan.equals("SMA N 1 Pekanbaru")) {
                a = new Intent(this,sman1.class);

            }else if (pilihan.equals("SMA N 2 Pekanbaru"))
            {
                a = new Intent(this,sman2.class);

            }else if (pilihan.equals("SMA N 3 Pekanbaru"))
            {
                a = new Intent(this,sman3.class);


            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
