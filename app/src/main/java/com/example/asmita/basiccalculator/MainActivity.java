package com.example.asmita.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEqual, buttonClear;
    EditText in;

    float val1, val2;
    char c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonDot = (Button)findViewById(R.id.dot);
        buttonAdd = (Button)findViewById(R.id.add);
        buttonSubtract = (Button)findViewById(R.id.subtract);
        buttonMultiply = (Button)findViewById(R.id.multiply);
        buttonDivide = (Button)findViewById(R.id.divide);
        buttonClear = (Button)findViewById(R.id.clear);
        buttonEqual = (Button)findViewById(R.id.equalto);
        in = (EditText)findViewById(R.id.input);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+"9");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText(in.getText()+".");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText("");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(in == null)
                    Toast.makeText(MainActivity.this,"no input",Toast.LENGTH_SHORT).show();
                else {
                    val1 = Float.parseFloat(in.getText()+"");
                    c = '+';
                    in.setText(null);
                }
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(in == null)
                    Toast.makeText(MainActivity.this,"no input",Toast.LENGTH_SHORT).show();
                else {
                    val1 = Float.parseFloat(in.getText()+"");
                    c = '-';
                    in.setText(null);
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(in == null)
                    Toast.makeText(MainActivity.this,"no input",Toast.LENGTH_SHORT).show();
                else {
                    val1 = Float.parseFloat(in.getText()+"");
                    c = '*';
                    in.setText(null);
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(in == null)
                    Toast.makeText(MainActivity.this,"no input",Toast.LENGTH_SHORT).show();
                else {
                    val1 = Float.parseFloat(in.getText()+"");
                    c = '/';
                    in.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val2 = Float.parseFloat(in.getText()+"");
                if(c=='+') {
                    in.setText(val1+val2+"");
                    c = '\0';
                }

                if(c=='-') {
                    in.setText(val1-val2+"");
                    c = '\0';
                }

                if(c=='*') {
                    in.setText(val1*val2+"");
                    c = '\0';
                }

                if(c=='/') {
                    in.setText(val1/val2+"");
                    c = '\0';
                }
            }
        });
    }
}
