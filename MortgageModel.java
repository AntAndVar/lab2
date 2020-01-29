package ca.yorku.eecs.mcalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

import ca.yorku.eecs.mcalc.R;

public class Entryform extends AppCompatActivity
{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }
    public void pressedButton(View v) {

        String p = ((EditText) findViewById(R.id.pbox)).getText().toString();
        String r = ((EditText) findViewById(R.id.iBox)).getText().toString();
        String n = ((EditText) findViewById(R.id.aBox)).getText().toString();
        MortgageModel model = new MortgageModel(p, n, r);
        String result = model.computePayment();
        ((TextView) findViewById(R.id.result)).setText(result);
    }
}
