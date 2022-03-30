package com.dhuli.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight,height;
    Button submit;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        submit = findViewById(R.id.submit);
        ans = findViewById(R.id.ans);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    float h = Float.parseFloat(height.getText().toString());
                float w = Float.parseFloat(weight.getText().toString());


                ans.setText("sum = "+(w/((h/100)*(h/100))));
           }
        });


    }
}