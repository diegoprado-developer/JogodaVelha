package com.example.jogodavelha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtTwoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTwoPlayer = findViewById(R.id.txtTwoPlayer);

        Intent intent = new Intent(MainActivity.this, TwoPlayerActivity.class);
        startActivity(intent);
    }
}
