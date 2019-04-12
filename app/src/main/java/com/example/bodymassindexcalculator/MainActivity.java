package com.example.bodymassindexcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    EditText et_height, et_weight;
    TextView tv_bmi;
    Button btn_bmi;
    String getEt_height,getEt_weight,getHeightInM,bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItems();
    }

    private void initItems(){
        et_height=findViewById(R.id.et_height);

        et_weight=findViewById(R.id.et_weight);

        tv_bmi=findViewById(R.id.tv_bmi);

        btn_bmi=findViewById(R.id.btn_bmi);

        btn_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BMIModel model=new BMIModel(getEt_height,getEt_weight);
                model.setEt_height(et_height.getText().toString());
                model.setEt_weight(et_weight.getText().toString());
                getEt_height=model.getEt_height();
                getEt_weight=model.getEt_weight();
                getHeightInM=Double.parseDouble(getEt_height)/100+"";

                bmi=Double.parseDouble(getEt_weight)/((Double.parseDouble(getHeightInM))*((Double.parseDouble(getHeightInM))))+"";
                    tv_bmi.setText(bmi);

                    if(Double.parseDouble(bmi)< 18.5)
                    {
                        Toast.makeText(MainActivity.this, "Underweight", Toast.LENGTH_LONG).show();

                    }
                    if(Double.parseDouble(bmi) > 18.5 && Double.parseDouble(bmi) <=24.9)
                    {
                        Toast.makeText(MainActivity.this, "Normal Weight", Toast.LENGTH_LONG).show();

                    }
                    if(Double.parseDouble(bmi) > 25 && Double.parseDouble(bmi)<=29.9)
                    {
                        Toast.makeText(MainActivity.this, "Overweight", Toast.LENGTH_LONG).show();

                    }
                    if(Double.parseDouble(bmi) >=30)
                    {
                        Toast.makeText(MainActivity.this, "Obesity", Toast.LENGTH_LONG).show();

                    }
                }


        });
    }}


