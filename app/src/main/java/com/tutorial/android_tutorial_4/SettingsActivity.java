package com.tutorial.android_tutorial_4;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getSupportActionBar().setTitle("Ayarlar");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_settings , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId=item.getItemId();

        if(itemId==R.id.action_duzenle){
            ProgressDialog progressDialog = new ProgressDialog(SettingsActivity.this);
            progressDialog.setTitle("Güncelleme");
            progressDialog.setMessage("WhatsApp güncelleniyor, lütfen bekleyin");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }
        else if(itemId==R.id.action_sifirla){
            ProgressDialog progressDialog = new ProgressDialog(SettingsActivity.this);
            progressDialog.setTitle("Güncelleme");
            progressDialog.setMessage("Chrome güncelleniyor, lütfen bekleyin");
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

            progressDialog.setIndeterminate(false);
            progressDialog.setMax(100);
            progressDialog.show();

            progressDialog.setProgress(100);
            progressDialog.dismiss();

        }
        return super.onOptionsItemSelected(item);
    }
}
