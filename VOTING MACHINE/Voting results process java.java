package com.example.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int colaVotes = 0;
    int pepsiVotes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void votePepsi(View view) {
        pepsiVotes = pepsiVotes + 1;

        return;
    }

    public void votecola(View view) {
        colaVotes = colaVotes + 1;

        return;
    }

    public void display1(int p) {
        TextView t1 = (TextView) findViewById(R.id.display_text_view1);
        t1.setText("" + p);
    }

    public void display2(int c) {
        TextView t2 = (TextView) findViewById(R.id.display_text_view2);
        t2.setText("" + c);
    }

    public void display(String a) {
        TextView t2 = (TextView) findViewById(R.id.display_text_view3);
        t2.setText("" + a);
    }

    public void showMeVotes(View view) {
        display1(colaVotes);
        display2(pepsiVotes);
        if (colaVotes > pepsiVotes) {
            display("COLA WON");
        } else {
            display("PEPSI WON");
        }
    }
}