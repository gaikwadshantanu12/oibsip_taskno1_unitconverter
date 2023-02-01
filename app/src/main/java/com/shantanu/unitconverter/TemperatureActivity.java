package com.shantanu.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import com.shantanu.unitconverter.utility.TemperatureConverterUtility;
import java.util.Objects;

public class TemperatureActivity extends AppCompatActivity {

    private Spinner temp_spinner1, temp_spinner2;
    private TextInputEditText temp_input1, temp_input2;
    private AppCompatButton temp_convert_btn;
    private int temp_spinner_index1, temp_spinner_index2;
    private TemperatureConverterUtility temp_utility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        // creating instance of LengthConverterUtility for DAO
        temp_utility = new TemperatureConverterUtility();

        // add back button to toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // change activity title
        getSupportActionBar().setTitle("Temperature Converter");

        // obtain all ids
        obtainAllIds();

        // spinner listener
        spinnerListener(temp_spinner1, temp_spinner2);
        
        temp_convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Objects.requireNonNull(temp_input1.getText()).toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter some value !", Toast.LENGTH_SHORT).show();
                }
                else {
                    double value = Double.parseDouble(Objects.requireNonNull(temp_input1.getText()).toString());
                    temp_input2.setText(""+ConvertTemperature(value));
                }
            }
        });
    }

    private void obtainAllIds(){
        temp_spinner1 = findViewById(R.id.temp_spinner1);
        temp_spinner2 = findViewById(R.id.temp_spinner2);
        temp_input1 = findViewById(R.id.input_text1);
        temp_input2 = findViewById(R.id.input_text2);
        temp_convert_btn = findViewById(R.id.temp_convert_btn);
    }

    private void spinnerListener(Spinner s1, Spinner s2) {
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                temp_spinner_index1 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                temp_spinner_index2 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private double ConvertTemperature(double temp_data){
        if(temp_spinner_index1 == 0) {
            if(temp_spinner_index2 == 0){
                return temp_utility.FromCelsiusToCelsius(temp_data);
            } else if(temp_spinner_index2 == 1){
                return temp_utility.FromCelsiusToFahrenheit(temp_data);
            } else {
                return temp_utility.FromCelsiusToKelvin(temp_data);
            }
        } else if (temp_spinner_index1 == 1) {
            if(temp_spinner_index2 == 0){
                return temp_utility.FromFahrenheitToCelsius(temp_data);
            } else if(temp_spinner_index2 == 1){
                return temp_utility.FromFahrenheitToFahrenheit(temp_data);
            } else {
                return temp_utility.FromFahrenheitToKelvin(temp_data);
            }
        } else {
            if(temp_spinner_index2 == 0){
                return temp_utility.FromKelvinToCelsius(temp_data);
            } else if(temp_spinner_index2 == 1){
                return temp_utility.FromKelvinToFahrenheit(temp_data);
            } else {
                return temp_utility.FromKelvinToKelvin(temp_data);
            }
        }
    }
    
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}