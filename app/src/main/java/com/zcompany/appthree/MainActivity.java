package com.zcompany.appthree;

import android.icu.util.VersionInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText e1,e2;
    int n1,n2,sum,diff,div,mul,rem;
    public int checkedit(String e){
        try{
            return Integer.parseInt(e);
        }
        catch (NumberFormatException w){
            return 0;
        }
    }
    public void addButton(View view){
        TextView ans = (TextView) findViewById(R.id.answer);
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        n1 = checkedit(e1.getText().toString());
        n2 = checkedit(e2.getText().toString());
        sum=n1+n2;
        ans.setText(Integer.toString(sum));
    }
    public void subButton(View view){
        TextView ans = (TextView) findViewById(R.id.answer);
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        n1 = checkedit(e1.getText().toString());
        n2 = checkedit(e2.getText().toString());
        diff=n1-n2;
        ans.setText(Integer.toString(diff));
    }
    public void mulButton(View view){
        TextView ans = (TextView) findViewById(R.id.answer);
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        n1 = checkedit(e1.getText().toString());
        n2 = checkedit(e2.getText().toString());
        mul=n1*n2;
        ans.setText(Integer.toString(mul));
    }
    public void divButton(View view){
        TextView ans = (TextView) findViewById(R.id.answer);
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        n1 = checkedit(e1.getText().toString());
        n2 = checkedit(e2.getText().toString());
        if(n2==0){
            ans.setText("-.-");
        }
        else{
            div=n1/n2;
            ans.setText(Integer.toString(div));
        }
    }
    public void remButton(View view){
        TextView ans = (TextView) findViewById(R.id.answer);
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        n1 = checkedit(e1.getText().toString());
        n2 = checkedit(e2.getText().toString());
        if(n2==0){
            ans.setText("-.-");
        }
        else{
            rem=n1%n2;
            ans.setText(Integer.toString(rem));
        }
    }
    public void anstoe1(View view){
        TextView ans = (TextView) findViewById(R.id.answer);
        e1 = (EditText) findViewById(R.id.num1);
        if(ans.getText().toString()=="-.-"){
            e1.setText("0");
        }
        else{
            e1.setText(ans.getText());
        }
    }
    public void anstoe2(View view){
        TextView ans = (TextView) findViewById(R.id.answer);
        e2 = (EditText) findViewById(R.id.num2);
        if(ans.getText().toString()=="-.-"){
            e2.setText("0");
        }
        else{
            e2.setText(ans.getText());
        }
    }
}
