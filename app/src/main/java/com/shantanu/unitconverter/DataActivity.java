package com.shantanu.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.shantanu.unitconverter.utility.DataConverterUtility;
import com.shantanu.unitconverter.utility.LengthConverterUtility;

import java.util.Objects;

public class DataActivity extends AppCompatActivity {

    private Spinner data_spinner1, data_spinner2;
    private TextInputEditText data_input1, data_input2;
    private AppCompatButton data_convert_btn;
    private int data_spinner_index1, data_spinner_index2;
    private DataConverterUtility data_utility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        // creating instance of LengthConverterUtility for DAO
        data_utility = new DataConverterUtility();

        // add back button to toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // change activity title
        getSupportActionBar().setTitle("Data Converter");

        // obtain all ids
        obtainAllIds();

        // spinner listener
        spinnerListener(data_spinner1, data_spinner2);

        data_convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Objects.requireNonNull(data_input1.getText()).toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter some value !", Toast.LENGTH_SHORT).show();
                }
                else {
                    double value = Double.parseDouble(Objects.requireNonNull(data_input1.getText()).toString());
                    data_input2.setText(""+ConvertLength(value));
                }
            }
        });
    }

    private void obtainAllIds(){
        data_spinner1 = findViewById(R.id.data_spinner1);
        data_spinner2 = findViewById(R.id.data_spinner2);
        data_input1 = findViewById(R.id.input_text1);
        data_input2 = findViewById(R.id.input_text2);
        data_convert_btn = findViewById(R.id.data_convert_btn);
    }

    private void spinnerListener(Spinner s1, Spinner s2) {
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                data_spinner_index1 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                data_spinner_index2 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private double ConvertLength(double data_data){
        if(data_spinner_index1 == 0) {
            if(data_spinner_index2 == 0){
                return data_utility.FromBitsToBits(data_data);
            } else if(data_spinner_index2 == 1){
                return data_utility.FromBitsToBytes(data_data);
            } else if (data_spinner_index2 == 2) {
                return data_utility.FromBitsToKB(data_data);
            } else if (data_spinner_index2 == 3) {
                return data_utility.FromBitsToMB(data_data);
            } else if (data_spinner_index2 == 4) {
                return data_utility.FromBitsToGB(data_data);
            } else {
                return data_utility.FromBitsToTB(data_data);
            }
        } else if (data_spinner_index1 == 1) {
            if(data_spinner_index2 == 0){
                return data_utility.FromBytesToBits(data_data);
            } else if(data_spinner_index2 == 1){
                return data_utility.FromBytesToBytes(data_data);
            } else if (data_spinner_index2 == 2) {
                return data_utility.FromBytesToKB(data_data);
            } else if (data_spinner_index2 == 3) {
                return data_utility.FromBytesToMB(data_data);
            } else if (data_spinner_index2 == 4) {
                return data_utility.FromBytesToGB(data_data);
            } else {
                return data_utility.FromBytesToTB(data_data);
            }
        } else if (data_spinner_index1 == 2) {
            if(data_spinner_index2 == 0){
                return data_utility.FromKBToBits(data_data);
            } else if(data_spinner_index2 == 1){
                return data_utility.FromKBToBytes(data_data);
            } else if (data_spinner_index2 == 2) {
                return data_utility.FromKBToKB(data_data);
            } else if (data_spinner_index2 == 3) {
                return data_utility.FromKBToMB(data_data);
            } else if (data_spinner_index2 == 4) {
                return data_utility.FromKBToGB(data_data);
            } else {
                return data_utility.FromKBToTB(data_data);
            }
        } else if (data_spinner_index1 == 3) {
            if(data_spinner_index2 == 0){
                return data_utility.FromMBToBits(data_data);
            } else if(data_spinner_index2 == 1){
                return data_utility.FromMBToBytes(data_data);
            } else if (data_spinner_index2 == 2) {
                return data_utility.FromMBToKB(data_data);
            } else if (data_spinner_index2 == 3) {
                return data_utility.FromMBToMB(data_data);
            } else if (data_spinner_index2 == 4) {
                return data_utility.FromMBToGB(data_data);
            } else {
                return data_utility.FromMBToTB(data_data);
            }
        } else if (data_spinner_index1 == 4) {
            if(data_spinner_index2 == 0){
                return data_utility.FromGBToBits(data_data);
            } else if(data_spinner_index2 == 1){
                return data_utility.FromGBToBytes(data_data);
            } else if (data_spinner_index2 == 2) {
                return data_utility.FromGBToKB(data_data);
            } else if (data_spinner_index2 == 3) {
                return data_utility.FromGBToMB(data_data);
            } else if (data_spinner_index2 == 4) {
                return data_utility.FromGBToGB(data_data);
            } else {
                return data_utility.FromGBToTB(data_data);
            }
        } else {
            if(data_spinner_index2 == 0){
                return data_utility.FromTBToBits(data_data);
            } else if(data_spinner_index2 == 1){
                return data_utility.FromTBToBytes(data_data);
            } else if (data_spinner_index2 == 2) {
                return data_utility.FromTBToKB(data_data);
            } else if (data_spinner_index2 == 3) {
                return data_utility.FromTBToMB(data_data);
            } else if (data_spinner_index2 == 4) {
                return data_utility.FromTBToGB(data_data);
            } else {
                return data_utility.FromTBToTB(data_data);
            }
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}