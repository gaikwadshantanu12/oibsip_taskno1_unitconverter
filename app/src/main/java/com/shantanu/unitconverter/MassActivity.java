package com.shantanu.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.shantanu.unitconverter.utility.MassConverterUtility;
import java.util.Objects;

public class MassActivity extends AppCompatActivity {

    private Spinner mass_spinner1, mass_spinner2;
    private TextInputEditText mass_input1, mass_input2;
    private AppCompatButton mass_convert_btn;
    private int mass_spinner_index1, mass_spinner_index2;
    private MassConverterUtility mass_utility;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        // creating instance of LengthConverterUtility for DAO
        mass_utility = new MassConverterUtility();

        // add back button to toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // change activity title
        getSupportActionBar().setTitle("Mass Converter");

        // obtain all ids
        obtainAllIds();

        // spinner listener
        spinnerListener(mass_spinner1, mass_spinner2);
        
        mass_convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Objects.requireNonNull(mass_input1.getText()).toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter some value !", Toast.LENGTH_SHORT).show();
                }
                else {
                    double value = Double.parseDouble(Objects.requireNonNull(mass_input1.getText()).toString());
                    mass_input2.setText(""+ConvertMass(value));
                }
            }
        });
    }

    private void obtainAllIds(){
        mass_spinner1 = findViewById(R.id.mass_spinner1);
        mass_spinner2 = findViewById(R.id.mass_spinner2);
        mass_input1 = findViewById(R.id.input_text1);
        mass_input2 = findViewById(R.id.input_text2);
        mass_convert_btn = findViewById(R.id.mass_convert_btn);
    }

    private void spinnerListener(Spinner s1, Spinner s2) {
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mass_spinner_index1 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mass_spinner_index2 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private double ConvertMass(double mass_data){
        if(mass_spinner_index1 == 0) {
            if(mass_spinner_index2 == 0){
                return mass_utility.FromTonsToTons(mass_data);
            } else if(mass_spinner_index2 == 1){
                return mass_utility.FromTonsToUKTons(mass_data);
            } else if (mass_spinner_index2 == 2) {
                return mass_utility.FromTonsUSTons(mass_data);
            } else if (mass_spinner_index2 == 3) {
                return mass_utility.FromTonsToPounds(mass_data);
            } else if (mass_spinner_index2 == 4) {
                return mass_utility.FromTonsToOunces(mass_data);
            } else if (mass_spinner_index2 == 5) {
                return mass_utility.FromTonsToKG(mass_data);
            } else {
                return mass_utility.FromTonsToGrams(mass_data);
            }
        } else if (mass_spinner_index1 == 1) {
            if(mass_spinner_index2 == 0){
                return mass_utility.FromUKTonsToTons(mass_data);
            } else if(mass_spinner_index2 == 1){
                return mass_utility.FromUKTonsToUKTons(mass_data);
            } else if (mass_spinner_index2 == 2) {
                return mass_utility.FromUKTonsToUSTons(mass_data);
            } else if (mass_spinner_index2 == 3) {
                return mass_utility.FromUKTonsToPounds(mass_data);
            } else if (mass_spinner_index2 == 4) {
                return mass_utility.FromUKTonsToOunces(mass_data);
            } else if (mass_spinner_index2 == 5) {
                return mass_utility.FromUKTonsToKG(mass_data);
            } else {
                return mass_utility.FromUKTonsToGrams(mass_data);
            }
        } else if (mass_spinner_index1 == 2) {
            if(mass_spinner_index2 == 0){
                return mass_utility.FromUSTonsToTons(mass_data);
            } else if(mass_spinner_index2 == 1){
                return mass_utility.FromUSTonsToUKTons(mass_data);
            } else if (mass_spinner_index2 == 2) {
                return mass_utility.FromUSTonsToUSTons(mass_data);
            } else if (mass_spinner_index2 == 3) {
                return mass_utility.FromUSTonsToPounds(mass_data);
            } else if (mass_spinner_index2 == 4) {
                return mass_utility.FromUSTonsToOunces(mass_data);
            } else if (mass_spinner_index2 == 5) {
                return mass_utility.FromUSTonsToKG(mass_data);
            } else {
                return mass_utility.FromUSTonsToGrams(mass_data);
            }
        } else if (mass_spinner_index1 == 3) {
            if(mass_spinner_index2 == 0){
                return mass_utility.FromPoundsToTons(mass_data);
            } else if(mass_spinner_index2 == 1){
                return mass_utility.FromPoundsToUKTons(mass_data);
            } else if (mass_spinner_index2 == 2) {
                return mass_utility.FromPoundsToUSTons(mass_data);
            } else if (mass_spinner_index2 == 3) {
                return mass_utility.FromPoundsToPounds(mass_data);
            } else if (mass_spinner_index2 == 4) {
                return mass_utility.FromPoundsToOunces(mass_data);
            } else if (mass_spinner_index2 == 5) {
                return mass_utility.FromPoundsToKG(mass_data);
            } else {
                return mass_utility.FromPoundsToGrams(mass_data);
            }
        } else if (mass_spinner_index1 == 4) {
            if(mass_spinner_index2 == 0){
                return mass_utility.FromOuncesToTons(mass_data);
            } else if(mass_spinner_index2 == 1){
                return mass_utility.FromOuncesToUKTons(mass_data);
            } else if (mass_spinner_index2 == 2) {
                return mass_utility.FromOuncesToUSTons(mass_data);
            } else if (mass_spinner_index2 == 3) {
                return mass_utility.FromOuncesToPounds(mass_data);
            } else if (mass_spinner_index2 == 4) {
                return mass_utility.FromOuncesToOunces(mass_data);
            } else if (mass_spinner_index2 == 5) {
                return mass_utility.FromOuncesToKG(mass_data);
            } else {
                return mass_utility.FromOuncesToGrams(mass_data);
            }
        } else if (mass_spinner_index1 == 5) {
            if(mass_spinner_index2 == 0){
                return mass_utility.FromKGToTons(mass_data);
            } else if(mass_spinner_index2 == 1){
                return mass_utility.FromKGToUKTons(mass_data);
            } else if (mass_spinner_index2 == 2) {
                return mass_utility.FromKGToUSTons(mass_data);
            } else if (mass_spinner_index2 == 3) {
                return mass_utility.FromKGToPounds(mass_data);
            } else if (mass_spinner_index2 == 4) {
                return mass_utility.FromKGToOunces(mass_data);
            } else if (mass_spinner_index2 == 5) {
                return mass_utility.FromKGToKG(mass_data);
            } else {
                return mass_utility.FromKGToGrams(mass_data);
            }
        } else {
            if(mass_spinner_index2 == 0){
                return mass_utility.FromGramsToTons(mass_data);
            } else if(mass_spinner_index2 == 1){
                return mass_utility.FromGramsToUKTons(mass_data);
            } else if (mass_spinner_index2 == 2) {
                return mass_utility.FromGramsToUSTons(mass_data);
            } else if (mass_spinner_index2 == 3) {
                return mass_utility.FromGramsToPounds(mass_data);
            } else if (mass_spinner_index2 == 4) {
                return mass_utility.FromGramsToOunces(mass_data);
            } else if (mass_spinner_index2 == 5) {
                return mass_utility.FromGramsToKG(mass_data);
            } else {
                return mass_utility.FromGramsToGrams(mass_data);
            }
        }
    }
    
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}