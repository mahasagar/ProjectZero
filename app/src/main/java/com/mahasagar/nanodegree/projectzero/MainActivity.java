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

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.btnSpotifyStreamer) Button btn_spotifyStreamer;
    @Bind(R.id.btnScoresApp) Button btn_scoresApp;
    @Bind(R.id.btnLibraryApp) Button btn_libraryApp;
    @Bind(R.id.btnBuildItBigger) Button btn_buildItBigger;
    @Bind(R.id.btnXYZReader) Button btn_XYZReader;
    @Bind(R.id.btnCapstone) Button btn_capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ButterKnife.bind(this);
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
