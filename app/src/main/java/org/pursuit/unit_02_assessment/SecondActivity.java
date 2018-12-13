package org.pursuit.unit_02_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
   private TextView secondTextView;
   private String secondText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        bundle.getString("result");


        secondTextView = findViewById(R.id.second_textView);
        secondText = secondTextView.toString();
       secondTextView.setText(secondText);

        if (savedInstanceState != null){
            secondText = savedInstanceState.getString(secondText);
            secondTextView.setText(String.valueOf(secondText));
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        String counterValue = secondTextView.getText().toString();
        outState.putString(secondText, secondTextView.getText().toString());
    }
}
