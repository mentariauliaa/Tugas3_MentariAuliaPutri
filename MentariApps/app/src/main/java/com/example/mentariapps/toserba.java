package com.example.mentariapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class toserba extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "SMS Center", "Driving Direction", "Info di Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAct));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null ;
            if (pilihan.equals("Call Center"))
                a = new Intent(this,toserba.class);
            String nomortel ="tel:0761-24338";
            a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));
            {

            } if (pilihan.equals("SMS Center"))
            {
                String smsText="Mentari Aulia Putri/P";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:085264413175"));
                a.putExtra("sms_body",smsText);

            } else if (pilihan.equals("Driving Direction"))
            {
                String lokasi = "google.navigation:q=0.5351566,101.4258976";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasi));

            } else if (pilihan.equals("Info di Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"711 Toserba Pekanbaru");
            }
            else
            {
                finish();
            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}



