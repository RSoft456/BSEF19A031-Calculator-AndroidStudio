package com.example.calculator;


import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button plus,minus,mul,div,cut,eq;
    TextView result;
    TextView expression;
    String exp;
    String res;
    String value;
    Boolean zeroCheck;
    int op1;
    int op2;
    boolean operatorPlus;
    boolean operatorMinus;
    boolean operatorMul;
    boolean operatorDiv;
    boolean equal;
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
        eq=findViewById(R.id.equal);

        btn0.setOnClickListener(v->{
            exp=(String)expression.getText();
            res=(String)result.getText();
            if(!exp.equals("") && !exp.equals("0") && zeroCheck){
                exp=exp+"0";
                result.setText(res);
                expression.setText(exp);
                zeroCheck=false;
            }
                else if(!exp.equals("") && !exp.equals("0")){
                    exp=exp+"0";
                    res=res+"0";
                    result.setText(res);
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
                res=(String)result.getText();
                if(!exp.equals("")){
                    exp=exp+"1";
                    res=res+"1";
                    result.setText(res);
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
                res=(String)result.getText();
                if(!exp.equals("")){
                    exp=exp+"2";
                    res=res+"2";
                    result.setText(res);
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
                res=(String)result.getText();
                if(!exp.equals("")){
                    exp=exp+"3";
                    res=res+"3";
                    result.setText(res);
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
                res=(String)result.getText();
                if(!exp.equals("")){
                    exp=exp+"4";
                    res=res+"4";
                    result.setText(res);
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
                res=(String)result.getText();
                if(!exp.equals("")){
                    exp=exp+"5";
                    res=res+"5";
                    result.setText(res);
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
                res=(String)result.getText();
                if(!exp.equals("")){
                    exp=exp+"6";
                    res=res+"6";
                    result.setText(res);
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
                res=(String)result.getText();
                if(!exp.equals("")){
                    exp=exp+"7";
                    res=res+"7";
                    result.setText(res);
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
                res=(String)result.getText();
                if(!exp.equals("")){
                    exp=exp+"8";
                    res=res+"8";
                    result.setText(res);
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
                res=(String)result.getText();
                if(!exp.equals("")){
                    exp=exp+"9";
                    res=res+"9";
                    result.setText(res);
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
                res=(String)result.getText();
                op1=Integer.parseInt(res);
                int p =exp.indexOf("+",exp.length()-1);
                int mi =exp.indexOf("-",exp.length()-1);
                int mu =exp.indexOf("x",exp.length()-1);
                int d =exp.indexOf("/",exp.length()-1);
                if(!exp.equals("") && p==-1&& mi==-1&& mu==-1&& d==-1) {
                    exp = exp + "+";
                    result.setText("");
                    expression.setText(exp);
                }
                zeroCheck=true;
                operatorPlus=true;
                operatorDiv=false;
                operatorMinus=false;
                operatorMul=false;
            }
        );
        minus.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                res=(String)result.getText();
                op1=Integer.parseInt(res);
                int p =exp.indexOf("+",exp.length()-1);
                int mi =exp.indexOf("-",exp.length()-1);
                int mu =exp.indexOf("x",exp.length()-1);
                int d =exp.indexOf("/",exp.length()-1);
                if(!exp.equals("") && p==-1&& mi==-1&& mu==-1&& d==-1) {

                    exp=exp+"-";
                    result.setText("");
                    expression.setText(exp);
                }
                zeroCheck=true;
                operatorPlus=false;
                operatorDiv=false;
                operatorMinus=true;
                operatorMul=false;
            }
        );
        mul.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                res=(String)result.getText();
                op1=Integer.parseInt(res);
                int p =exp.indexOf("+",exp.length()-1);
                int mi =exp.indexOf("-",exp.length()-1);
                int mu =exp.indexOf("x",exp.length()-1);
                int d =exp.indexOf("/",exp.length()-1);
                if(!exp.equals("")&& p==-1&& mi==-1&& mu==-1&& d==-1) {

                    exp = exp + "x";
                    result.setText("");
                    expression.setText(exp);
                }
                zeroCheck=true;
                operatorPlus=false;
                operatorDiv=false;
                operatorMinus=false;
                operatorMul=true;
            }
        );
        div.setOnClickListener(v->
            {
                exp=(String)expression.getText();
                res=(String)result.getText();
                op1=Integer.parseInt(res);
                int p =exp.indexOf("+",exp.length()-1);
                int mi =exp.indexOf("-",exp.length()-1);
                int mu =exp.indexOf("x",exp.length()-1);
                int d =exp.indexOf("/",exp.length()-1);
                if(!exp.equals("")&& p==-1&& mi==-1&& mu==-1&& d==-1) {

                    exp=exp+"/";
                    result.setText("");
                    expression.setText(exp);
                }
                zeroCheck=true;
                operatorPlus=false;
                operatorDiv=true;
                operatorMinus=false;
                operatorMul=false;
            }
        );
        cut.setOnClickListener(v->
            {
                value =Integer.toString(0);
                result.setText(value);
                expression.setText("");
            }
     );
        eq.setOnClickListener(v->{
            res=(String)result.getText();
            op2=Integer.parseInt(res);
            int eval;
            String EVAL;
            if(operatorPlus){
                eval=op1+op2;
                EVAL=Integer.toString(eval);
                result.setText(EVAL);
            }
            else if(operatorMul){
                eval=op1*op2;
                EVAL=Integer.toString(eval);
                result.setText(EVAL);
            }
            else if(operatorDiv){
                eval=op1/op2;
                EVAL=Integer.toString(eval);
                result.setText(EVAL);
            }
            else if(operatorMinus){
                eval=op1-op2;
                EVAL=Integer.toString(eval);
                result.setText(EVAL);
            }
            equal = true;
        });
    }
}