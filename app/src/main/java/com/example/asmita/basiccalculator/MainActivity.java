package com.example.asmita.basiccalculator;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEqual, buttonClear;
    Button buttonDel, openBrace, closeBrace;
    TextView in;

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
        buttonDel = (Button)findViewById(R.id.del);
        openBrace = (Button)findViewById(R.id.openBrace);
        closeBrace = (Button)findViewById(R.id.closeBrac);
        in = (TextView)findViewById(R.id.tv);

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
                String s = in.getText().toString();
                if(s.contains(".")){
                    int ind = s.lastIndexOf(".");
                    if(s.substring(ind,s.length()).contains("+")||s.substring(ind,s.length()).contains("-")||s.substring(ind,s.length()).contains("*")||s.substring(ind,s.length()).contains("/"))
                        in.setText(in.getText()+".");
                    else
                        Toast.makeText(MainActivity.this,"invalid input",Toast.LENGTH_SHORT).show();
                }
                else
                    in.setText(in.getText()+".");
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = in.getText().toString();
                if(s.isEmpty())
                    Toast.makeText(MainActivity.this,"invalid input",Toast.LENGTH_SHORT).show();
                else {
                    s = s.substring(0, s.length()-1);
                    in.setText(s+"");
                }
            }
        });

        openBrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = in.getText().toString();
                char[] c = s.toCharArray();
                if(!s.isEmpty())
                {
                    int l = c.length;
                    if(c[l-1]=='+'||c[l-1]=='-'||c[l-1]=='*'||c[l-1]=='/'||c[l-1]==')'||c[l-1]=='(')
                        in.setText(in.getText()+"(");
                    else
                        return;;
                }
                else
                    in.setText(in.getText()+"(");
            }
        });

        closeBrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = in.getText().toString();
                char[] c = s.toCharArray();
                if(!s.isEmpty())
                {
                    int l = c.length;
                    if(c[l-1]>='0'&& c[l-1]<='9')
                        in.setText(in.getText()+")");
                    else
                        return;;
                }
                else
                    Toast.makeText(MainActivity.this,"invalid input",Toast.LENGTH_SHORT).show();
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
                if(in.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this,"no input",Toast.LENGTH_SHORT).show();
                else {

                    in.setText(in.getText().toString()+"+");
                }
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(in.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this,"no input",Toast.LENGTH_SHORT).show();
                else {

                    in.setText(in.getText().toString()+"-");
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(in.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this,"no input",Toast.LENGTH_SHORT).show();
                else {

                    in.setText(in.getText().toString()+"*");
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(in.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this,"no input",Toast.LENGTH_SHORT).show();
                else {

                    in.setText(in.getText().toString()+"/");
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String expression = in.getText().toString();
                char[] tokens = expression.toCharArray();
                int c1=0,c2=0;
                for(int j=0; j<tokens.length; j++)
                {
                    if(tokens[j]=='(')
                        c1++;
                    else if(tokens[j]==')')
                        c2++;
                }
                if(c1!=c2) {
                    in.setText("Syntax Error!");
                    return;
                }

                Stack<Float> values = new Stack<Float>();
                Stack<Character> ops = new Stack<Character>();

                for(int i=0; i<tokens.length; i++){
                    if((tokens[i] >= '0' && tokens[i] <= '9')||tokens[i]=='.') {
                        StringBuffer sbuf = new StringBuffer();
                        while (i < tokens.length && ((tokens[i] >= '0' && tokens[i] <= '9')||tokens[i]=='.'))
                            sbuf.append(tokens[i++]);
                        values.push(Float.parseFloat(sbuf.toString()));
                        i--;
                    }

                    else if (tokens[i] == '(')
                        ops.push(tokens[i]);

                    else if (tokens[i] == ')')
                    {
                        while (ops.peek() != '(') {
                            char op = ops.pop();
                            float res;
                            if(values.size()==1 && op=='+')
                                 res = values.pop();
                            else if(values.size()==1 && op=='-')
                                res = -values.pop();
                            else if(values.size()==1 && (op=='*'||op=='/'))
                                return;
                            else {
                                float b = values.pop();
                                float a = values.pop();
                                res = 0;
                                switch (op) {
                                    case '+':
                                        res = a + b;
                                        break;

                                    case '-':
                                        res = a - b;
                                        break;
                                    case '*':
                                        res = a * b;
                                        break;
                                    case '/':
                                        if (b == 0) {
                                            in.setText("Error!");
                                            return;
                                        } else
                                            res = a / b;
                                }
                            }
                            values.push(res);
                        }
                        ops.pop();
                    }

                    else if(tokens[i]=='+'||tokens[i]=='-'||tokens[i]=='*'||tokens[i]=='/') {
                        while(!ops.isEmpty() && hasPrecedence(tokens[i],ops.peek())) {
                            char op = ops.pop();
                            float res=0;
                            if(values.size()==1 && op=='+')
                                res = values.pop();
                            else if(values.size()==1 && op=='-')
                                res = -values.pop();
                            else if(values.size()==1 && (op=='*'||op=='/'))
                                return;
                            else {
                                float b = values.pop();
                                float a = values.pop();

                                switch (op) {
                                    case '+':
                                        res = a + b;
                                        break;
                                    case '-':
                                        res = a - b;
                                        break;
                                    case '*':
                                        res = a * b;
                                        break;
                                    case '/':
                                        if (b == 0) {
                                            in.setText("Error!");
                                            return;
                                        } else
                                            res = a / b;
                                }
                            }
                            values.push(res);
                        }
                        ops.push(tokens[i]);
                    }
                }
                while (!ops.empty()) {
                    char op = ops.pop();
                    float res=0;
                    if(values.size()==1 && op=='+')
                        res = values.pop();
                    else if(values.size()==1 && op=='-')
                        res = -values.pop();
                    else if(values.size()==1 && (op=='*'||op=='/'))
                        return;
                    else {
                        float b = values.pop();
                        float a = values.pop();

                        switch (op) {
                            case '+':
                                res = a + b;
                                break;
                            case '-':
                                res = a - b;
                                break;
                            case '*':
                                res = a * b;
                                break;
                            case '/':
                                if (b == 0) {
                                    in.setText("Error!");
                                    return;
                                } else
                                    res = a / b;
                        }
                    }
                    values.push(res);
                }

                in.setText(values.pop().toString()+"");
            }

            public boolean hasPrecedence(char op1, char op2) {
                if (op2 == '(' || op2 == ')')
                    return false;
                if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
                    return false;
                else
                    return true;
            }


        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch(id)
        {
            case R.id.dev :
                Intent intent = new Intent(MainActivity.this,devActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

}
