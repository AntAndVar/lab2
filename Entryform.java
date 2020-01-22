package com.example.mcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class Entryform extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }
    public void pressedButton(View v) {

        String p = ((EditText) findViewById(R.id.pbox)).getText().toString();
        String r = ((EditText) findViewById(R.id.iBox)).getText().toString();
        String n = ((EditText) findViewById(R.id.aBox)).getText().toString();
        MortgageModel model = new MortgageModel(p, n, r);
        String result = "$"+model.computePayment();
        ((TextView) findViewById(R.id.result)).setText(result);
    }
}
