package com.shantanu.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import com.shantanu.unitconverter.utility.LengthConverterUtility;
import java.util.Objects;

public class LengthActivity extends AppCompatActivity {

    private Spinner length_spinner1, length_spinner2;
    private TextInputEditText length_input1, length_input2;
    private AppCompatButton length_convert_btn;
    private int length_spinner_index1, length_spinner_index2;
    private LengthConverterUtility length_utility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        // creating instance of LengthConverterUtility for DAO
        length_utility = new LengthConverterUtility();

        // add back button to toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // change activity title
        getSupportActionBar().setTitle("Length Converter");

        // obtain all ids
        obtainAllIds();

        // spinner listener
        spinnerListener(length_spinner1, length_spinner2);

        length_convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Objects.requireNonNull(length_input1.getText()).toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter some value !", Toast.LENGTH_SHORT).show();
                }
                else {
                    double value = Double.parseDouble(Objects.requireNonNull(length_input1.getText()).toString());
                    length_input2.setText(""+ConvertLength(value));
                }
            }
        });
    }

    private void obtainAllIds(){
        length_spinner1 = findViewById(R.id.length_spinner1);
        length_spinner2 = findViewById(R.id.length_spinner2);
        length_input1 = findViewById(R.id.input_text1);
        length_input2 = findViewById(R.id.input_text2);
        length_convert_btn = findViewById(R.id.length_convert_btn);
    }

    private void spinnerListener(Spinner s1, Spinner s2) {
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                length_spinner_index1 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                length_spinner_index2 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private double ConvertLength(double length_data){
        if(length_spinner_index1 == 0) {
            if(length_spinner_index2 == 0){
                return length_utility.FromMMToMM(length_data);
            } else if(length_spinner_index2 == 1){
                return length_utility.FromMMToCM(length_data);
            } else if (length_spinner_index2 == 2) {
                return length_utility.FromMMToMetres(length_data);
            } else if (length_spinner_index2 == 3) {
                return length_utility.FromMMToKM(length_data);
            } else if (length_spinner_index2 == 4) {
                return length_utility.FromMMToInches(length_data);
            } else if (length_spinner_index2 == 5) {
                return length_utility.FromMMToFeet(length_data);
            } else if(length_spinner_index2 == 6) {
                return length_utility.FromMMToYards(length_data);
            } else if (length_spinner_index2 == 7) {
                return length_utility.FromMMToMiles(length_data);
            } else if (length_spinner_index2 == 8) {
                return length_utility.FromMMToNauticalMiles(length_data);
            } else {
                return length_utility.FromMMToMils(length_data);
            }
        } else if (length_spinner_index1 == 1) {
            if(length_spinner_index2 == 0){
                return length_utility.FromCMToMM(length_data);
            } else if(length_spinner_index2 == 1){
                return length_utility.FromCMToCM(length_data);
            } else if (length_spinner_index2 == 2) {
                return length_utility.FromCMToMetres(length_data);
            } else if (length_spinner_index2 == 3) {
                return length_utility.FromCMToKM(length_data);
            } else if (length_spinner_index2 == 4) {
                return length_utility.FromCMToInches(length_data);
            } else if (length_spinner_index2 == 5) {
                return length_utility.FromCMToFeet(length_data);
            } else if(length_spinner_index2 == 6) {
                return length_utility.FromCMToYards(length_data);
            } else if (length_spinner_index2 == 7) {
                return length_utility.FromCMToMiles(length_data);
            } else if (length_spinner_index2 == 8) {
                return length_utility.FromCMToNauticalMiles(length_data);
            } else {
                return length_utility.FromCMToMils(length_data);
            }
        } else if (length_spinner_index1 == 2) {
            if(length_spinner_index2 == 0){
                return length_utility.FromMetresToMM(length_data);
            } else if(length_spinner_index2 == 1){
                return length_utility.FromMetresToCM(length_data);
            } else if (length_spinner_index2 == 2) {
                return length_utility.FromMetresToMetres(length_data);
            } else if (length_spinner_index2 == 3) {
                return length_utility.FromMetresToKM(length_data);
            } else if (length_spinner_index2 == 4) {
                return length_utility.FromMetresToInches(length_data);
            } else if (length_spinner_index2 == 5) {
                return length_utility.FromMetresToFeet(length_data);
            } else if(length_spinner_index2 == 6) {
                return length_utility.FromMetresToYards(length_data);
            } else if (length_spinner_index2 == 7) {
                return length_utility.FromMetresToMiles(length_data);
            } else if (length_spinner_index2 == 8) {
                return length_utility.FromMetresToNauticalMiles(length_data);
            } else {
                return length_utility.FromMetresToMils(length_data);
            }
        } else if (length_spinner_index1 == 3) {
            if(length_spinner_index2 == 0){
                return length_utility.FromKMToMM(length_data);
            } else if(length_spinner_index2 == 1){
                return length_utility.FromKMToCM(length_data);
            } else if (length_spinner_index2 == 2) {
                return length_utility.FromKMToMetres(length_data);
            } else if (length_spinner_index2 == 3) {
                return length_utility.FromKMToKM(length_data);
            } else if (length_spinner_index2 == 4) {
                return length_utility.FromKMToInches(length_data);
            } else if (length_spinner_index2 == 5) {
                return length_utility.FromKMToFeet(length_data);
            } else if(length_spinner_index2 == 6) {
                return length_utility.FromKMToYards(length_data);
            } else if (length_spinner_index2 == 7) {
                return length_utility.FromKMToMiles(length_data);
            } else if (length_spinner_index2 == 8) {
                return length_utility.FromKMToNauticalMiles(length_data);
            } else {
                return length_utility.FromKMToMils(length_data);
            }
        } else if (length_spinner_index1 == 4) {
            if(length_spinner_index2 == 0){
                return length_utility.FromInchesToMM(length_data);
            } else if(length_spinner_index2 == 1){
                return length_utility.FromInchesToCM(length_data);
            } else if (length_spinner_index2 == 2) {
                return length_utility.FromInchesToMetres(length_data);
            } else if (length_spinner_index2 == 3) {
                return length_utility.FromInchesToKM(length_data);
            } else if (length_spinner_index2 == 4) {
                return length_utility.FromInchesToInches(length_data);
            } else if (length_spinner_index2 == 5) {
                return length_utility.FromInchesToFeet(length_data);
            } else if(length_spinner_index2 == 6) {
                return length_utility.FromInchesToYards(length_data);
            } else if (length_spinner_index2 == 7) {
                return length_utility.FromInchesToMiles(length_data);
            } else if (length_spinner_index2 == 8) {
                return length_utility.FromInchesToNauticalMiles(length_data);
            } else {
                return length_utility.FromInchesToMils(length_data);
            }
        } else if (length_spinner_index1 == 5) {
            if(length_spinner_index2 == 0){
                return length_utility.FromFeetToMM(length_data);
            } else if(length_spinner_index2 == 1){
                return length_utility.FromFeetToCM(length_data);
            } else if (length_spinner_index2 == 2) {
                return length_utility.FromFeetToMetres(length_data);
            } else if (length_spinner_index2 == 3) {
                return length_utility.FromFeetToKM(length_data);
            } else if (length_spinner_index2 == 4) {
                return length_utility.FromFeetToInches(length_data);
            } else if (length_spinner_index2 == 5) {
                return length_utility.FromFeetToFeet(length_data);
            } else if(length_spinner_index2 == 6) {
                return length_utility.FromFeetToYards(length_data);
            } else if (length_spinner_index2 == 7) {
                return length_utility.FromFeetToMiles(length_data);
            } else if (length_spinner_index2 == 8) {
                return length_utility.FromFeetToNauticalMiles(length_data);
            } else {
                return length_utility.FromFeetToMils(length_data);
            }
        } else if(length_spinner_index1 == 6) {
            if(length_spinner_index2 == 0){
                return length_utility.FromYardsToMM(length_data);
            } else if(length_spinner_index2 == 1){
                return length_utility.FromYardsToCM(length_data);
            } else if (length_spinner_index2 == 2) {
                return length_utility.FromYardsToMetres(length_data);
            } else if (length_spinner_index2 == 3) {
                return length_utility.FromYardsToKM(length_data);
            } else if (length_spinner_index2 == 4) {
                return length_utility.FromYardsToInches(length_data);
            } else if (length_spinner_index2 == 5) {
                return length_utility.FromYardsToFeet(length_data);
            } else if(length_spinner_index2 == 6) {
                return length_utility.FromYardsToYards(length_data);
            } else if (length_spinner_index2 == 7) {
                return length_utility.FromYardsToMiles(length_data);
            } else if (length_spinner_index2 == 8) {
                return length_utility.FromYardsToNauticalMiles(length_data);
            } else {
                return length_utility.FromYardsToMils(length_data);
            }
        } else if(length_spinner_index1 == 7) {
            if(length_spinner_index2 == 0){
                return length_utility.FromMilesToMM(length_data);
            } else if(length_spinner_index2 == 1){
                return length_utility.FromMilesToCM(length_data);
            } else if (length_spinner_index2 == 2) {
                return length_utility.FromMilesToMetres(length_data);
            } else if (length_spinner_index2 == 3) {
                return length_utility.FromMilesToKM(length_data);
            } else if (length_spinner_index2 == 4) {
                return length_utility.FromMilesToInches(length_data);
            } else if (length_spinner_index2 == 5) {
                return length_utility.FromMilesToFeet(length_data);
            } else if(length_spinner_index2 == 6) {
                return length_utility.FromMilesToYards(length_data);
            } else if (length_spinner_index2 == 7) {
                return length_utility.FromMilesToMiles(length_data);
            } else if (length_spinner_index2 == 8) {
                return length_utility.FromMilesToNauticalMiles(length_data);
            } else {
                return length_utility.FromMilesToMils(length_data);
            }
        } else if(length_spinner_index1 == 8) {
            if(length_spinner_index2 == 0){
                return length_utility.FromNMToMM(length_data);
            } else if(length_spinner_index2 == 1){
                return length_utility.FromNMToCM(length_data);
            } else if (length_spinner_index2 == 2) {
                return length_utility.FromNMToMetres(length_data);
            } else if (length_spinner_index2 == 3) {
                return length_utility.FromNMToKM(length_data);
            } else if (length_spinner_index2 == 4) {
                return length_utility.FromNMToInches(length_data);
            } else if (length_spinner_index2 == 5) {
                return length_utility.FromNMToFeet(length_data);
            } else if(length_spinner_index2 == 6) {
                return length_utility.FromNMToYards(length_data);
            } else if (length_spinner_index2 == 7) {
                return length_utility.FromNMToMiles(length_data);
            } else if (length_spinner_index2 == 8) {
                return length_utility.FromNMToNM(length_data);
            } else {
                return length_utility.FromNMToMils(length_data);
            }
        } else {
            if(length_spinner_index2 == 0){
                return length_utility.FromMilsToMM(length_data);
            } else if(length_spinner_index2 == 1){
                return length_utility.FromMilsToCM(length_data);
            } else if (length_spinner_index2 == 2) {
                return length_utility.FromMilsToMetres(length_data);
            } else if (length_spinner_index2 == 3) {
                return length_utility.FromMilsToKM(length_data);
            } else if (length_spinner_index2 == 4) {
                return length_utility.FromMilsToInches(length_data);
            } else if (length_spinner_index2 == 5) {
                return length_utility.FromMilsToFeet(length_data);
            } else if(length_spinner_index2 == 6) {
                return length_utility.FromMilsToYards(length_data);
            } else if (length_spinner_index2 == 7) {
                return length_utility.FromMilsToMiles(length_data);
            } else if (length_spinner_index2 == 8) {
                return length_utility.FromMilsToNM(length_data);
            } else {
                return length_utility.FromMilsToMils(length_data);
            }
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}