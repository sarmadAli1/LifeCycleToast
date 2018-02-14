package com.example.sarmad.lifecycletoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this,"Start",Toast.LENGTH_SHORT).show();
    }

    protected void  onResume()
    {
        super.onResume();
        Toast.makeText(this,"Resume",Toast.LENGTH_SHORT).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"Pause",Toast.LENGTH_SHORT).show();
    }

    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"Restart",Toast.LENGTH_SHORT).show();
    }


    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"Destroy",Toast.LENGTH_SHORT).show();
    }


}

