package com.example.calculator;


import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button plus,minus,mul,div,cut,eq,decimal1,decimal2;
    TextView result;
    TextView expression;
    String exp;
    String res;
    String value;
    Boolean zeroCheck;
    double op1;
    double op2;
    String answer;
    int count=0;
    boolean operatorPlus;
    boolean operatorMinus;
    boolean operatorMul;
    boolean operatorDiv;
    boolean equal;
    double evaluate(double x,double y )
    {
        double ans=0;
        if(operatorPlus){
            ans= x+y;
        }
        else if(operatorMul){
            ans= x*y;
        }
        else if(operatorDiv){
            ans= x/y;
        }
        else if(operatorMinus){
            ans= x-y;
        }
        return ans;
    }
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
        decimal1=findViewById(R.id.dot1);
        decimal2=findViewById(R.id.dot2);


        decimal1.setOnClickListener(v->{
                    exp=(String)expression.getText();
                    res=(String)result.getText();
            int p =exp.indexOf("+",exp.length()-1);
            int mi =exp.indexOf("-",exp.length()-1);
            int mu =exp.indexOf("x",exp.length()-1);
            int d =exp.indexOf("/",exp.length()-1);
            int zero =exp.indexOf("0",exp.length()-1);
                    if(res.equals("math error")){
                        expression.setText("");
                        result.setText("0");
                        exp=(String)expression.getText();
                        res=(String)result.getText();
                        if(equal)
                            equal=false;
                    }
                    if(equal){
                        expression.setText("");
                        result.setText("0");
                        exp=(String)expression.getText();
                        res=(String)result.getText();
                        equal=false;
                    }
                    if(!exp.equals("") && p!=-1 && mi!=-1 && mu!=-1 && d!=-1)
                    {
                        exp=exp+"0.";
                        expression.setText(exp);
                        if(count==-1) {
                            res = "0.";
                            count = 1;
                        }
                        else
                            res = res + ".";
                        result.setText(res);
                    }
                    else if(exp.equals((""))){
                        exp=exp+"0.";
                        expression.setText(exp);
                        res=res+".";
                        result.setText(res);
                    }
                    else if(zero!=-1){
                        exp=exp+".";
                        expression.setText(exp);
                        res=res+".";
                        result.setText(res);
                    }
                    else{
                        value = "0.";
                        result.setText(value);
                        expression.setText(value);
                    }
                }
        );
        decimal2.setOnClickListener(v->{
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    int p =exp.indexOf("+",exp.length()-1);
                    int mi =exp.indexOf("-",exp.length()-1);
                    int mu =exp.indexOf("x",exp.length()-1);
                    int d =exp.indexOf("/",exp.length()-1);
                    int zero =exp.indexOf("0",exp.length()-1);
                    if(res.equals("math error")){
                        expression.setText("");
                        result.setText("0");
                        exp=(String)expression.getText();
                        res=(String)result.getText();
                        if(equal)
                            equal=false;
                    }
                    if(equal){
                        expression.setText("");
                        result.setText("0");
                        exp=(String)expression.getText();
                        res=(String)result.getText();
                        equal=false;
                    }
                    if(!exp.equals("") && p!=-1 && mi!=-1 && mu!=-1 && d!=-1)
                    {
                        exp=exp+"0.";
                        expression.setText(exp);
                        if(count==-1) {
                            res = "0.";
                            count = 1;
                        }
                        else
                            res = res + ".";
                        result.setText(res);
                    }
                    else if(exp.equals((""))){
                        exp=exp+"0.";
                        expression.setText(exp);
                        res=res+".";
                        result.setText(res);
                    }
                    else if(zero!=-1){
                        exp=exp+".";
                        expression.setText(exp);
                        res=res+".";
                        result.setText(res);
                    }
                    else{
                        value = "0.";
                        result.setText(value);
                        expression.setText(value);
                    }
                }
        );
        btn0.setOnClickListener(v->{
            exp=(String)expression.getText();
            res=(String)result.getText();
            if(res.equals("math error")){
                expression.setText("");
                result.setText("0");
                exp=(String)expression.getText();
                res=(String)result.getText();
                if(equal)
                    equal=false;
            }
            if(equal){
                expression.setText("");
                result.setText("0");
                exp=(String)expression.getText();
                res=(String)result.getText();
                equal=false;
            }
            if(!exp.equals("")){
                exp=exp+"0";
                expression.setText(exp);
                if(count==-1) {
                    res = "0";
                    count = 1;
                }
                else
                    res = res + "0";
                result.setText(res);
            }
            else{
                value = Integer.toString(0);
                result.setText(value);
                expression.setText(value);
            }
            }
        );
        btn1.setOnClickListener( v ->
            {
                exp=(String)expression.getText();
                res=(String)result.getText();
                if(res.equals("math error")){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    if(equal)
                        equal=false;
                }
                if(equal){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    equal=false;
                }
                if(!exp.equals("")){
                    exp=exp+"1";
                    expression.setText(exp);
                    if(count==-1) {
                        res = "1";
                        count = 1;
                    }
                    else
                        res = res + "1";
                    result.setText(res);
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
                if(res.equals("math error")){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    if(equal)
                        equal=false;
                }
                if(equal){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    equal=false;
                }
                if(!exp.equals("")){
                    exp=exp+"2";
                    expression.setText(exp);
                    if(count==-1) {
                        res = "2";
                        count = 1;
                    }
                    else
                        res = res + "2";
                    result.setText(res);
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
                if(res.equals("math error")){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    if(equal)
                        equal=false;
                }
                if(equal){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    equal=false;
                }
                if(!exp.equals("")){
                    exp=exp+"3";
                    expression.setText(exp);
                    if(count==-1) {
                        res = "3";
                        count = 1;
                    }
                    else
                        res = res + "3";
                    result.setText(res);
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
                if(res.equals("math error")){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    if(equal)
                        equal=false;
                }
                if(equal){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    equal=false;
                }
                if(!exp.equals("")){
                    exp=exp+"4";
                    expression.setText(exp);
                    if(count==-1) {
                        res = "4";
                        count = 1;
                    }
                    else
                        res = res + "4";
                    result.setText(res);
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
                if(res.equals("math error")){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    if(equal)
                        equal=false;
                }
                if(equal){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    equal=false;
                }
                if(!exp.equals("")){
                    exp=exp+"5";
                    expression.setText(exp);
                    if(count==-1) {
                        res = "5";
                        count = 1;
                    }
                    else
                        res = res + "5";
                    result.setText(res);
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
                if(res.equals("math error")){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    if(equal)
                        equal=false;
                }
                if(equal){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    equal=false;
                }
                if(!exp.equals("")){
                    exp=exp+"6";
                    expression.setText(exp);
                    if(count==-1) {
                        res = "6";
                        count = 1;
                    }
                    else
                        res = res + "6";
                    result.setText(res);
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
                if(res.equals("math error")){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    if(equal)
                        equal=false;
                }
                if(equal){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    equal=false;
                }
                if(!exp.equals("")){
                    exp=exp+"7";
                    expression.setText(exp);
                    if(count==-1) {
                        res = "7";
                        count = 1;
                    }
                    else
                        res = res + "7";
                    result.setText(res);
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
                if(res.equals("math error")){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    if(equal)
                        equal=false;
                }
                if(equal){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    equal=false;
                }
                if(!exp.equals("")){
                    exp=exp+"8";
                    expression.setText(exp);
                    if(count==-1) {
                        res = "8";
                        count = 1;
                    }
                    else
                        res = res + "8";
                    result.setText(res);
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
                if(res.equals("math error")){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    if(equal)
                        equal=false;
                }
                if(equal){
                    expression.setText("");
                    result.setText("0");
                    exp=(String)expression.getText();
                    res=(String)result.getText();
                    equal=false;
                }
                if(!exp.equals("")){
                    exp=exp+"9";
                    expression.setText(exp);
                    if(count==-1) {
                        res = "9";
                        count = 1;
                    }
                    else
                        res = res + "9";
                    result.setText(res);
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
                String eval;

                exp=(String)expression.getText();
                res=(String)result.getText();
                int p =exp.indexOf("+",exp.length()-1);
                int mi =exp.indexOf("-",exp.length()-1);
                int mu =exp.indexOf("x",exp.length()-1);
                int d =exp.indexOf("/",exp.length()-1);
                if(!exp.equals("") && p==-1 && mi==-1 && mu==-1 && d==-1) {
                    exp = exp + "+";
                    result.setText("");
                    expression.setText(exp);

                    if (count==0 && equal){
                        op1=Double.parseDouble(res);
                        exp = res + "+";
                        result.setText("");
                        expression.setText(exp);
                        count+=1;
                        equal=false;
                    }
                    else if(count==0)
                    {
                        op1=Double.parseDouble(res);
                        count+=1;
                    }
                    else{
                        op2 = Double.parseDouble(res);
                        if(op2==0 || op2==0.0){
                            eval="math error";
                        }
                        else{
                            eval = Double.toString(evaluate(op1, op2));
                            op1 = Double.parseDouble(eval);

                            answer = eval;
                            count = -1;
                        }
                        result.setText(eval);
                    }
                    zeroCheck=true;
                    operatorPlus=true;
                    operatorDiv=false;
                    operatorMinus=false;
                    operatorMul=false;
                }
            }
        );
        minus.setOnClickListener(v->
            {
                String eval;

                exp=(String)expression.getText();
                res=(String)result.getText();
                int p =exp.indexOf("+",exp.length()-1);
                int mi =exp.indexOf("-",exp.length()-1);
                int mu =exp.indexOf("x",exp.length()-1);
                int d =exp.indexOf("/",exp.length()-1);
                if(!exp.equals("") && p==-1 && mi==-1 && mu==-1 && d==-1) {
                    exp = exp + "-";
                    result.setText("");
                    expression.setText(exp);
                    if (count==0 && equal){
                        op1=Double.parseDouble(res);
                        exp = res + "-";
                        result.setText("");
                        expression.setText(exp);
                        count+=1;
                        equal=false;
                    }
                    else if(count==0)
                    {
                        op1=Double.parseDouble(res);
                        count+=1;
                    }
                    else{
                        op2 = Double.parseDouble(res);
                        if(op2==0 || op2==0.0){
                            eval="math error";
                        }
                        else{
                            eval = Double.toString(evaluate(op1, op2));
                            op1 = Double.parseDouble(eval);

                            answer = eval;
                            count = -1;
                        }
                        result.setText(eval);
                    }
                    zeroCheck=true;
                    operatorPlus=false;
                    operatorDiv=false;
                    operatorMinus=true;
                    operatorMul=false;
                }
            }
        );
        mul.setOnClickListener(v->
            {
                String eval;

                exp=(String)expression.getText();
                res=(String)result.getText();
                int p =exp.indexOf("+",exp.length()-1);
                int mi =exp.indexOf("-",exp.length()-1);
                int mu =exp.indexOf("x",exp.length()-1);
                int d =exp.indexOf("/",exp.length()-1);
                if(!exp.equals("") && p==-1 && mi==-1 && mu==-1 && d==-1) {
                    exp = exp + "x";
                    result.setText("");
                    expression.setText(exp);
                    if (count==0 && equal){
                        op1=Double.parseDouble(res);
                        exp = res + "x";
                        result.setText("");
                        expression.setText(exp);
                        count+=1;
                        equal=false;
                    }
                    else if(count==0)
                    {
                        op1=Double.parseDouble(res);
                        count+=1;
                    }
                    else{
                        op2 = Double.parseDouble(res);
                        if(op2==0 || op2==0.0){
                            eval="math error";
                        }
                        else{
                            eval = Double.toString(evaluate(op1, op2));
                            op1 = Double.parseDouble(eval);

                            answer = eval;
                            count = -1;
                        }
                        result.setText(eval);
                    }
                    zeroCheck=true;
                    operatorPlus=false;
                    operatorDiv=false;
                    operatorMinus=false;
                    operatorMul=true;
                }
            }
        );
        div.setOnClickListener(v->
            {
                String eval;
                zeroCheck=true;

                exp=(String)expression.getText();
                res=(String)result.getText();
                int p =exp.indexOf("+",exp.length()-1);
                int mi =exp.indexOf("-",exp.length()-1);
                int mu =exp.indexOf("x",exp.length()-1);
                int d =exp.indexOf("/",exp.length()-1);
                if(!exp.equals("") && p==-1 && mi==-1 && mu==-1 && d==-1) {
                    exp = exp + "/";
                    result.setText("");
                    expression.setText(exp);
                    if (count == 0 && equal) {
                        op1 = Double.parseDouble(res);
                        exp = res + "/";
                        result.setText("");
                        expression.setText(exp);
                        count += 1;
                        equal = false;
                    } else if (count == 0) {
                        op1 = Double.parseDouble(res);
                        count += 1;
                    } else {
                        op2 = Double.parseDouble(res);
                        if(op2==0 || op2==0.0){
                            eval="math error";
                        }
                        else{
                        eval = Double.toString(evaluate(op1, op2));
                        op1 = Double.parseDouble(eval);

                        answer = eval;
                        count = -1;
                        }
                        result.setText(eval);
                    }
                    zeroCheck = true;
                    operatorPlus = false;
                    operatorDiv = true;
                    operatorMinus = false;
                    operatorMul = false;
                }
            }
        );
        cut.setOnClickListener(v->
            {
                value =Integer.toString(0);
                result.setText(value);
                expression.setText("");
                count = 0;
            }
     );
        eq.setOnClickListener(v->{
            int p =exp.indexOf("+",exp.length()-1);
            int mi =exp.indexOf("-",exp.length()-1);
            int mu =exp.indexOf("x",exp.length()-1);
            int d =exp.indexOf("/",exp.length()-1);
            if(!exp.equals("") && p==-1 && mi==-1 && mu==-1 && d==-1) {
            res=(String)result.getText();
            op2=Double.parseDouble(res);
            double eval;
            String EVAL;
            if(operatorPlus){
                eval=op1+op2;
                EVAL=Double.toString(eval);
                result.setText(EVAL);
            }
            else if(operatorMul){
                eval=op1*op2;
                EVAL=Double.toString(eval);
                result.setText(EVAL);
            }
            else if(operatorDiv){
                if(op2==0 || op2==0.0){
                    EVAL="math error";
                }
                else{
                eval=op1/op2;
                EVAL=Double.toString(eval);
            }
                result.setText(EVAL);
            }
            else if(operatorMinus){
                eval=op1-op2;
                EVAL=Double.toString(eval);
                result.setText(EVAL);
            }
            equal = true;
            count=0;
            }
        });
    }
}