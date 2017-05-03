package com.swampass.tandem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Log in button
        Button btn1 = (Button) findViewById(R.id.Log);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("My app", "This is a message for max");
                Toast.makeText(getApplicationContext(), "Max you are a gay", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        //Wired up button to do stuff
        //.. get button
        Button btn = (Button) findViewById(R.id.btnSignup);
        //.. what happens when user clicks
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp", "This is a log message!");
                Toast.makeText(getApplicationContext(), "It's a big ol dick", Toast.LENGTH_SHORT)
                        .show();

            }
        public void gotoSecondActivity(View View){
            Intent intent = new Intent(this, Second_Activity.class);
            startActivity(intent);
        }
        });
    }
}