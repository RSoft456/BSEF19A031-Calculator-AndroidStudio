package com.example.calculator;


import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button plus,minus,mul,div,cut;
    TextView result;
    TextView expression;
    String exp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.zero);
        btn1=findViewById(R.id.one);
        btn2=findViewById(R.id.B2);
        btn3=findViewById(R.id.three);
        btn4=findViewById(R.id.four);
        btn5=findViewById(R.id.five);
        btn6=findViewById(R.id.six);
        btn7=findViewById(R.id.seven);
        btn8=findViewById(R.id.eight);
        btn9=findViewById(R.id.nine);
        plus=findViewById(R.id.add);
        minus=findViewById(R.id.minus);
        mul=findViewById(R.id.multiply);
        div=findViewById(R.id.divide);
        cut=findViewById(R.id.clear);
        result=findViewById(R.id.result);
        expression=findViewById(R.id.expression);

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"0";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    result.setText(Integer.toString(0));
                    expression.setText(Integer.toString(0));
                }
            }
        });
        btn1.setOnClickListener( v ->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"1";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    result.setText(Integer.toString(1));
                    expression.setText(Integer.toString(1));
                }
            }
        );
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"2";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    result.setText(Integer.toString(2));
                    expression.setText(Integer.toString(2));
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"3";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    result.setText(Integer.toString(3));
                    expression.setText(Integer.toString(3));
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"4";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    result.setText(Integer.toString(4));
                    expression.setText(Integer.toString(4));
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"5";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    result.setText(Integer.toString(5));
                    expression.setText(Integer.toString(5));
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"6";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    result.setText(Integer.toString(6));
                    expression.setText(Integer.toString(6));
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"7";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    result.setText(Integer.toString(7));
                    expression.setText(Integer.toString(7));
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"8";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    result.setText(Integer.toString(8));
                    expression.setText(Integer.toString(8));
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"9";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    result.setText(Integer.toString(9));
                    expression.setText(Integer.toString(9));
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")) {
                    exp = exp + "+";
                    result.setText(Integer.toString(0));
                    expression.setText(exp);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"-";
                    result.setText(Integer.toString(0));
                    expression.setText(exp);
                }

            }
        });
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(exp.equals("")) {
                    exp = exp + "x";
                    result.setText(Integer.toString(0));
                    expression.setText(exp);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"/";
                    result.setText(Integer.toString(0));
                    expression.setText(exp);
                }
            }
        });
        cut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                    result.setText(Integer.toString(0));
                    expression.setText(Integer.toString(0));
            }
        });
    }
}