package com.tutorial.android_tutorial_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button tikla1Button;
    private Button tikla2Button;
    private Button tikla3Button;
    private Button tikla4Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Anasayfa");

        tikla1Button= (Button) findViewById(R.id.tikla1Button);
        tikla2Button= (Button) findViewById(R.id.tikla2Button);
        tikla3Button= (Button) findViewById(R.id.tikla3Button);
        tikla4Button= (Button) findViewById(R.id.tikla4Button);

        tikla1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , ChatActivity.class);
                startActivity(intent);
            }
        });
        tikla2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
        tikla3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this ,NotificationsActivity.class );
                startActivity(intent);

            }
        });
        tikla4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this , ProfileActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_activity_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId=item.getItemId();

        if(itemId==R.id.action_profile){
            Toast.makeText(MainActivity.this , "profile tıklanıldı",
                    Toast.LENGTH_LONG).show();
        }
        else if(itemId==R.id.action_settings){
            Toast.makeText(MainActivity.this , "ayarlara tıklanıldı" ,
                    Toast.LENGTH_LONG).show();
        }
        else if (itemId==R.id.action_logout){
            Toast.makeText(MainActivity.this , "çıkış tıklanıldı",
                    Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
