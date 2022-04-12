package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button add,sub,multi,division,Clear,result;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    private EditText editxt;

    String history;
    String num1="";
    String num2="";

    int type;

    int ADD=0;
    int SUB=1;
    int MUL=2;
    int DIV=3;
    double d1;
    double d2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        multi = (Button) findViewById(R.id.multi);
        division = (Button) findViewById(R.id.division);
        Clear = (Button) findViewById(R.id.Clear);
        result=(Button)findViewById(R.id.result);
        result.setText("");

        b0=(Button)findViewById(R.id.zero);
        b1=(Button)findViewById(R.id.one);
        b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);
        b4=(Button)findViewById(R.id.four);
        b5=(Button)findViewById(R.id.five);
        b6=(Button)findViewById(R.id.six);
        b7=(Button)findViewById(R.id.seven);
        b8=(Button)findViewById(R.id.eight);
        b9=(Button)findViewById(R.id.nine);

        editxt = (EditText)findViewById(R.id.editxt);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        multi.setOnClickListener(this);
        Clear.setOnClickListener(this);
        division.setOnClickListener(this);
        result.setOnClickListener(this);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add:
                num1=editxt.getText().toString();
                history=editxt.getText().toString()+"+";
                editxt.setText("");
                type=ADD;
                //editxt.append("+");
                break;
            case R.id.sub:
                num1=editxt.getText().toString();
                history=editxt.getText().toString()+"-";
                editxt.setText("");
                type=SUB;
                //editxt.append("-");
                break;
            case R.id.multi:
                num1=editxt.getText().toString();
                history=editxt.getText().toString()+"*";
                editxt.setText("");
                type=MUL;
                //editxt.append("*");
                break;
            case R.id.division:
                num1=editxt.getText().toString();
                history=editxt.getText().toString()+"/";
                editxt.setText("");
                type=DIV;
                //editxt.append("/");
                break;
            case R.id.result:
                double numresult=0;
                num2=editxt.getText().toString();
                history=history+editxt.getText().toString();
                d1=Double.parseDouble(num1);
                d2=Double.parseDouble(num2);

                if(type==ADD)
                {
                    numresult=d1+d2;
                    editxt.setText(""+numresult);
                }
                else if(type==SUB)
                {
                    numresult=d1-d2;
                    editxt.setText(""+numresult);
                }
                else if(type==MUL)
                {
                    numresult=d1*d2;
                    editxt.setText(""+numresult);
                }
                else if(type==DIV)
                {
                    numresult=d1/d2;
                    editxt.setText(""+numresult);
                }
                num1 = editxt.getText().toString();
                break;

            case R.id.Clear:
                editxt.getText().clear();
                break;
            case R.id.zero:
                editxt.setText(editxt.getText().toString()+0);
                break;
            case R.id.one:
                editxt.setText(editxt.getText().toString()+1);
                break;
            case R.id.two:
                editxt.setText(editxt.getText().toString()+2);
                break;
            case R.id.three:
                editxt.setText(editxt.getText().toString()+3);
                break;
            case R.id.four:
                editxt.setText(editxt.getText().toString()+4);
                break;
            case R.id.five:
                editxt.setText(editxt.getText().toString()+5);
                break;
            case R.id.six:
                editxt.setText(editxt.getText().toString()+6);
                break;
            case R.id.seven:
                editxt.setText(editxt.getText().toString()+7);
                break;
            case R.id.eight:
                editxt.setText(editxt.getText().toString()+8);
                break;
            case R.id.nine:
                editxt.setText(editxt.getText().toString()+9);
                break;
        }
    }
}