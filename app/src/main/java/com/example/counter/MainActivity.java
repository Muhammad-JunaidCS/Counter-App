package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int count=0;
    Button inc,dec,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        inc=(Button)findViewById(R.id.button);
//        dec=(Button)findViewById(R.id.button2);
//        reset=(Button)findViewById(R.id.button3);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void increment(View view) {
        count++;
        textView.setText(Integer.toString(count));
    }

    public void decrement(View view) {
        if(count>0)
        {
            count--;
            textView.setText(Integer.toString(count));

        }
    }

    public void reset(View view) {
        count=0;
        textView.setText(Integer.toString(count));
    }
}