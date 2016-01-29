package com.mahasagar.nanodegree.projectzero;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_spotifyStreamer,btn_scoresApp,btn_libraryApp,btn_buildItBigger,btn_XYZReader,btn_capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_spotifyStreamer = (Button)findViewById(R.id.btnSpotifyStreamer);
        btn_scoresApp = (Button)findViewById(R.id.btnScoresApp);
        btn_libraryApp = (Button)findViewById(R.id.btnLibraryApp);
        btn_buildItBigger = (Button)findViewById(R.id.btnBuildItBigger);
        btn_XYZReader = (Button)findViewById(R.id.btnXYZReader);
        btn_capstone = (Button)findViewById(R.id.btnCapstone);

        btn_spotifyStreamer.setOnClickListener(this);
        btn_scoresApp.setOnClickListener(this);
        btn_libraryApp.setOnClickListener(this);
        btn_buildItBigger.setOnClickListener(this);
        btn_XYZReader.setOnClickListener(this);
        btn_capstone.setOnClickListener(this);
    }

    public void runAppToast(String name){
        Toast.makeText(MainActivity.this," App :"+name,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View v) {
        String toastStartStr = "This Button will Launch ";
        switch (v.getId()) {
            case R.id.btnSpotifyStreamer:
                Toast.makeText(MainActivity.this, toastStartStr + getResources().getString(R.string.strSpotifyStreamer), Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent();
                ComponentName componentName = new ComponentName(PackageName);
                intent.setComponent(componentName);
                startActivity(intent);*/
                break;
            case R.id.btnScoresApp:
                Toast.makeText(MainActivity.this,toastStartStr + getResources().getString(R.string.strScoresApp) , Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnLibraryApp:
                Toast.makeText(MainActivity.this, toastStartStr + getResources().getString(R.string.strLibraryApp), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBuildItBigger:
                Toast.makeText(MainActivity.this, toastStartStr + getResources().getString(R.string.strBuildItBigger), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnXYZReader:
                Toast.makeText(MainActivity.this, toastStartStr + getResources().getString(R.string.strXYZReader), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCapstone:
                Toast.makeText(MainActivity.this, toastStartStr + getResources().getString(R.string.strCapstone), Toast.LENGTH_SHORT).show();
                break;
        }
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
