package com.example.yajunbai.bmi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_layout);
    }


    public void buttonClicked(View v) {
        EditText weightView = findViewById(R.id.weightBox);
        String weight = weightView.getText().toString();

        EditText heightView = findViewById(R.id.heightBox);
        String height = heightView.getText().toString();

        BMIModel myModel = new BMIModel(weight, height);
        String text = String.format("Your weight is %slb,\n your height is %s,\n and your BMI is %s.",
                                    myModel.toPound(), myModel.toFeetInch(), myModel.getBMI());
        ((TextView) findViewById(R.id.answer)).setText(text);


    }

}
