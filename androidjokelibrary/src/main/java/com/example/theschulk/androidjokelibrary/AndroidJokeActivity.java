package com.example.theschulk.androidjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity_main);

        Intent intent = getIntent();
        String jokeString = intent.getStringExtra(getString(R.string.intent_joke_extra));

        TextView jokeTextView = findViewById(R.id.text_view_display_joke);
        jokeTextView.setText(jokeString);
    }
}
