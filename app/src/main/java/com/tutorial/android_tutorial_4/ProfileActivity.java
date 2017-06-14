package com.tutorial.android_tutorial_4;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setTitle("Profil");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_activity_profile , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId=item.getItemId();
        if(itemId==R.id.action_kisi_goruntule){
            Toast.makeText(ProfileActivity.this, "profile tıklanıldı" ,
                    Toast.LENGTH_LONG).show();
        }
        else if(itemId==R.id.action_medya){
            Toast.makeText(ProfileActivity.this, "medya tıklanıldı",
                    Toast.LENGTH_LONG).show();
        }
        else if(itemId==R.id.action_engelle){
            Toast.makeText(ProfileActivity.this,"engellendi",
                    Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
