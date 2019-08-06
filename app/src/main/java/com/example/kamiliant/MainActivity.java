package com.example.kamiliant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnContactUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContactUs = (Button) findViewById(R.id.btn_contact_us);

        btnContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                moveToActivityTwo();
            }

        });

    }
    private void moveToActivityTwo(){
        Intent intent = new Intent(MainActivity.this,ContactUsActivity.class);
        startActivity(intent);
        finish();
    }



}
