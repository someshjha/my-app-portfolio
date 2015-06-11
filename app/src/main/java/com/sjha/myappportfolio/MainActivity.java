package com.sjha.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {


    private Button mspotifyStreamer;
    private Button mscoresApp;
    private Button mlibraryApp;
    private Button mbuildItBigger;
    private Button mbaconReader;
    private Button mcapstoneMyApp;
    private Activity mActivity = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUi();
        onClickButton();
    }



    private void initializeUi(){
        mspotifyStreamer = (Button) findViewById(R.id.button);
        mscoresApp = (Button) findViewById(R.id.button2);
        mlibraryApp = (Button) findViewById(R.id.button3);
        mbuildItBigger = (Button) findViewById(R.id.button4);
        mbaconReader = (Button) findViewById(R.id.button5);
        mcapstoneMyApp = (Button) findViewById(R.id.button6);

    }


    private void onClickButton(){

        mspotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "This button will launch spotify streamer app.",Toast.LENGTH_SHORT).show();
            }
        });

        mscoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "This button will launch Scores app.",Toast.LENGTH_SHORT).show();
            }
        });

        mlibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "This button will launch Library app.", Toast.LENGTH_SHORT).show();
            }
        });

        mbuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "This button will launch build it bigger app.",Toast.LENGTH_SHORT).show();
            }
        });

        mbaconReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "This button will launch bacon reader app.",Toast.LENGTH_SHORT).show();
            }
        });

        mcapstoneMyApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "This button will launch my capstone app.",Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
