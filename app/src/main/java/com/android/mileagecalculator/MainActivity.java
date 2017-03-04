package com.android.mileagecalculator;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText edt_current_reading,edt_previous_reading,edt_fuel_quantity,edt_fuel_price;
    TextView txt_fuel_mileage,txt_total_fuelprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.btn_calculate);
        edt_current_reading = (EditText)findViewById(R.id.edt_current_reading);
        edt_previous_reading = (EditText)findViewById(R.id.edt_previous_reading);
        edt_fuel_quantity = (EditText)findViewById(R.id.edt_fuel_quantity);
        edt_fuel_price = (EditText)findViewById(R.id.edt_fuel_price);
        txt_fuel_mileage = (TextView)findViewById(R.id.txt_fuel_mileage);
        txt_total_fuelprice = (TextView)findViewById(R.id.txt_total_fuelprice);


        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                String currenr_reading = edt_current_reading.getText().toString();
                String previous_reading = edt_previous_reading.getText().toString();
                String fuel_quantity = edt_fuel_quantity.getText().toString();
                String fuel_price = edt_fuel_price.getText().toString();

                calcuation(currenr_reading,previous_reading,fuel_quantity,fuel_price);

            }
        });

    }


    public void calcuation(String curt, String prevoius, String quantity, String price){

        Float current_reading = Float.parseFloat(curt);
        Float previous_reading = Float.parseFloat(prevoius);
        Float fuel_quantity = Float.parseFloat(quantity);
        Float fuel_price = Float.parseFloat(price);
        Float mileage = (current_reading - previous_reading)/fuel_quantity;
        Float coast_km = (fuel_price)/(mileage);
        txt_fuel_mileage.setText(mileage.toString());
        txt_total_fuelprice.setText(coast_km.toString());


    }
}
