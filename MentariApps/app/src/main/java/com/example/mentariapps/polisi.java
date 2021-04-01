package com.example.mentariapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class polisi extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"Polsek Tampan","Polsek Bukit Raya","Polsek Tenayan Raya"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listRS));

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
            if (pilihan.equals("Polsek Tampan")) {
                a = new Intent(this,polsektampan.class);

            }else if (pilihan.equals("Polsek Bukit Raya"))
            {
                a = new Intent(this,polsekburay.class);

            }else if (pilihan.equals("Polsek Tenayan Raya"))
            {
                a = new Intent(this,polsektenayan.class);


            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
