package com.example.mentariapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sman3 extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "SMS Center", "Driving Direction", "Website", "Info di Google", "Exit"};
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
                a = new Intent(this,sman3.class);
            String nomortel ="tel:0761-51007";
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
                String lokasisekolah = "google.navigation:q=0.5711639,101.4283496";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasisekolah));

            } else if (pilihan.equals("Website"))
            {
                String website ="https://www.instagram.com/smanegeri3pekanbaru/?hl=id";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));

            } else if (pilihan.equals("Info di Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"SMAN 3 Pekanbaru");
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

