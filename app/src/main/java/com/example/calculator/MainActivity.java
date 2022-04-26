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
    String value;
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

        btn0.setOnClickListener(v->{
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"0";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    value=Integer.toString(0);
                    result.setText(value);
                    expression.setText(value);
                }
            }
        );
        btn1.setOnClickListener( v ->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"1";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    value = Integer.toString(1);
                    result.setText(value);
                    expression.setText(value);
                }
            }
        );
        btn2.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"2";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    value = Integer.toString(2);
                    result.setText(value);
                    expression.setText(value);
                }
            }
        );
        btn3.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"3";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    value = Integer.toString(3);
                    result.setText(value);
                    expression.setText(value);
                }
            }
        );
        btn4.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"4";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    value=Integer.toString(4);
                    result.setText(value);
                    expression.setText(value);
                }
            }
        );
        btn5.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"5";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    value=Integer.toString(5);
                    result.setText(value);
                    expression.setText(value);
                }
            }
        );
        btn6.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"6";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    value=Integer.toString(6);
                    result.setText(value);
                    expression.setText(value);
                }
            }
        );
        btn7.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"7";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    value = Integer.toString(7);
                    result.setText(value);
                    expression.setText(value);
                }
            }
        );
        btn8.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"8";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    value = Integer.toString(8);
                    result.setText(value);
                    expression.setText(value);
                }
            }
        );
        btn9.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"9";
                    result.setText(exp);
                    expression.setText(exp);
                }
                else{
                    value= Integer.toString(9);
                    result.setText(value);
                    expression.setText(value);
                }
            }
        );

        plus.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")) {
                    exp = exp + "+";
                    value =Integer.toString(0);
                    result.setText(value);
                    expression.setText(exp);
                }
            }
        );
        minus.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"-";
                    value =Integer.toString(0);
                    result.setText(value);
                    expression.setText(exp);
                }

            }
        );
        mul.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")) {
                    exp = exp + "x";
                    value =Integer.toString(0);
                    result.setText(value);
                    expression.setText(exp);
                }
            }
        );
        div.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                if(!exp.equals("")){
                    exp=exp+"/";
                    value =Integer.toString(0);
                    result.setText(value);
                    expression.setText(exp);
                }
            }
        );
        cut.setOnClickListener(v->
            {
                value =Integer.toString(0);
                result.setText(value);
                expression.setText(value);
            }
     );
    }
}