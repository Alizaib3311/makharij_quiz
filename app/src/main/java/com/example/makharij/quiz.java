package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class quiz extends AppCompatActivity {


    String[] quest={"أ ہ","ع ح","غ خ","ق"};
    String[] ans={"End of Throat","Middle of Throat","Start of the Throat","Base of Tongue which is near Uvula touching the mouth roof"};
    //String[] option={"End of Throat","Middle of Throat","Start of the Throat","Base of Tongue which is near Uvula touching the mouth roof"};
    TextView t1;
    Button next;
    RadioButton r1,r2,r3,r4;
    int score=0 , i=0;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        t1=findViewById(R.id.question);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);
        r4.setText("None of above");

        int ansL= ans.length;
        Random r = new Random();
        int i1 = r.nextInt(ansL-0)+0;

        t1.setText(quest[i]);
        r1.setText(ans[i1]);
        i1 = r.nextInt(ansL - 0) + 0;
        r2.setText(ans[i1]);
        i1 = r.nextInt(ansL - 0) + 0;
        r3.setText(ans[i1]);


        Boolean RadioButtonState2 = r2.isChecked();
        Boolean RadioButtonState3 = r3.isChecked();
        Boolean RadioButtonState4 = r4.isChecked();
        if(r1.isChecked() && r1.getText() == ans[i]){
            score++;
        }else if (r2.isChecked() && r2.getText() == ans[i])
        {
            score++;
        }else if (r3.isChecked() && r3.getText() == ans[i])
        {
            score++;
        }else{
            score++;
        }



        do{
        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        i++;

        }while (i<=quest.length);




    }




}