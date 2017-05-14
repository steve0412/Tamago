package com.example.tlstk.myapplication;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int qwerty = 10;
    TextView textView;
    public Button button;
    public Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);
        button2 = (Button)findViewById(R.id.button2);

        textView.setText("click " + qwerty + " times!!");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qwerty = 10;
                textView.setText("click "+qwerty+" times!!");
                button.setBackgroundResource(R.drawable.tamago);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {

                 if (qwerty > 6 ) {
                    qwerty -= 1;
                    textView.setText("click "+qwerty+" times!!");
                }

                else if (qwerty > 1 && qwerty<=6) {
                     button.setBackgroundResource(R.drawable.tamago3);
                    qwerty -= 1;
                    textView.setText("click "+qwerty+" times!!");
                }

                else if (qwerty <= 1 ) {
                     button.setBackgroundResource(R.drawable.tamago2);
                    textView.setText("bbang!!");
                }
            }
        });
    }

}
