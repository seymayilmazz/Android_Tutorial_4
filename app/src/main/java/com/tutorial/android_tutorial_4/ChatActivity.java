package com.tutorial.android_tutorial_4;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        getSupportActionBar().setTitle("Chat");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_chat, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int ItemId=item.getItemId();
        if(ItemId==R.id.action_yeni_grup){
            Toast.makeText(ChatActivity.this , "yeni grup tıklanıldı",
                    Toast.LENGTH_LONG) .show();
        }
        else if(ItemId==R.id.action_yeni_sohbet){
            Toast.makeText(ChatActivity.this, "yeni sohbet tıklanıldı",
                    Toast.LENGTH_LONG).show();
        }
        else if(ItemId==R.id.action_sohbet_sil){
            Toast.makeText(ChatActivity.this, "sohbet silindi",
                    Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
