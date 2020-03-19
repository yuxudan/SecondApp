package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView Output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.Output);

        EditText inp = (EditText)findViewById(R.id.Input);
        String str=inp.getText().toString();

        Button btn = (Button)findViewById(R.id.Button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Log.i("click","onclick ...");

        TextView tv = (TextView) findViewById(R.id.Output);

        EditText inp = (EditText)findViewById(R.id.Input);
        String str=inp.getText().toString();
        double newstr1 = Integer.parseInt(str);
        double newstr2=1.8*newstr1+32;
        tv.setText("结果为：  "+newstr2+"℉");
    }
}
