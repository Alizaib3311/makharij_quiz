package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView score_view;
        Button score_view;
        score_view=findViewById(R.id.score_view);
        //score_view.setVisibility(View.GONE);


        score_view.setText("Score will appear here");
        Intent intent = getIntent();
        score_view.setText(intent.getStringExtra("score"));
        score_view.setBackgroundColor(Color.RED);
        //score_view.setVisibility(View.VISIBLE);
        score_view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "My score in Makharij quiz is: " + intent.getStringExtra("score"));
                sendIntent.setType("text/plain");
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);

            }
        });
        Button button = findViewById(R.id.rep);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url="https://github.com/Alizaib3311/makharij_quiz";
                Uri repository = Uri.parse(url);
                Intent intent = new
                        Intent(Intent.ACTION_VIEW, repository);
                startActivity(intent);
            }
        });
        Button lrn =findViewById(R.id.learn);
        lrn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, learn.class);
                startActivity(intent);

            }
        });
        Button quiz =findViewById(R.id.quiz);
        quiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, quiz.class);
                startActivity(intent);

            }
        });

    }

}