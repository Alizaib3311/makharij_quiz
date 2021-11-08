package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.rep);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url="https://github.com/Alizaib3311/makharij_quiz";
                Uri repository = Uri.parse(url);
                Intent intent = new
                        Intent(Intent.ACTION_VIEW, repository);
                startActivity(intent);
            }
        });
    }

}