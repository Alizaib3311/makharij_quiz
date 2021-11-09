package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class quiz extends AppCompatActivity {


    String[] quest={"what are you doinnn","imaaaa rockooo"};
    String[] ans={"ali","muj","asdas"};
    TextView t1;
    RadioButton r1,r2,r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        t1=findViewById(R.id.question);
        t1.setText(quest[0]);
        r1=findViewById(R.id.opt1);
        r1.setText(ans[0]);
        r2=findViewById(R.id.opt2);
        r2.setText(ans[1]);
        r3=findViewById(R.id.opt3);
        r3.setText(ans[2]);

    }
}