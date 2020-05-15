package com.example.quizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int sum = 0;
    RadioButton q1;
    RadioButton q2;
    RadioButton q3;
    RadioButton q4;
    CheckBox a;
    CheckBox b;
    CheckBox c;
    CheckBox d;
    EditText q6;
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submit(View view) {

        q1 = findViewById(R.id.ans_1);
        q2 = findViewById(R.id.ans_2);
        q3 = findViewById(R.id.ans_3);
        q4 = findViewById(R.id.ans_4);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        q6 = findViewById(R.id.ans_6);

        if (q1.isChecked()) {
            sum = sum + 10;
        }
        if (q2.isChecked()) {
            sum = sum + 10;
        }
        if (q3.isChecked()) {
            sum = sum + 10;
        }
        if (q4.isChecked()) {
            sum = sum + 10;
        }
        if (!a.isChecked() && b.isChecked() && c.isChecked() && !d.isChecked()) {
            sum = sum + 10;
        }
        String ans = q6.getText().toString().trim();
        if (ans.equalsIgnoreCase("ISRO")) {
            sum = sum + 10;
        }
        score = findViewById(R.id.score);
        score.setText("YOUR SCORE : " + sum);
        Context context = getApplicationContext();
        CharSequence text = "YOUR SCORED  " + sum + " POINTS ";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        score = findViewById(R.id.score);
        sum = 0;

        setContentView(R.layout.activity_main);

    }


}
