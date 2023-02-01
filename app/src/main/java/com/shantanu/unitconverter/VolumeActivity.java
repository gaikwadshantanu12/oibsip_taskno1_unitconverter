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
import com.shantanu.unitconverter.utility.VolumeConverterUtility;

import java.util.Objects;

public class VolumeActivity extends AppCompatActivity {

    private Spinner volume_spinner1, volume_spinner2;
    private TextInputEditText volume_input1, volume_input2;
    private AppCompatButton volume_convert_btn;
    private int volume_spinner_index1, volume_spinner_index2;
    private VolumeConverterUtility volume_utility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        // creating instance of LengthConverterUtility for DAO
        volume_utility = new VolumeConverterUtility();
        
        // add back button to toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // change activity title
        getSupportActionBar().setTitle("Volume Converter");

        // obtain all ids
        obtainAllIds();

        // spinner listener
        spinnerListener(volume_spinner1, volume_spinner2);

        volume_convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Objects.requireNonNull(volume_input1.getText()).toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter some value !", Toast.LENGTH_SHORT).show();
                }
                else {
                    double value = Double.parseDouble(Objects.requireNonNull(volume_input1.getText()).toString());
                    volume_input2.setText(""+ConvertVolume(value));
                }
            }
        });
    }

    private void obtainAllIds(){
        volume_spinner1 = findViewById(R.id.volume_spinner1);
        volume_spinner2 = findViewById(R.id.volume_spinner2);
        volume_input1 = findViewById(R.id.input_text1);
        volume_input2 = findViewById(R.id.input_text2);
        volume_convert_btn = findViewById(R.id.volume_convert_btn);
    }

    private void spinnerListener(Spinner s1, Spinner s2) {
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                volume_spinner_index1 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                volume_spinner_index2 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private double ConvertVolume(double volume_data){
        if(volume_spinner_index1 == 0) {
            if(volume_spinner_index2 == 0){
                return volume_utility.FromUKGallonsToUKGallons(volume_data);
            } else if(volume_spinner_index2 == 1){
                return volume_utility.FromUKGallonsToUSGallons(volume_data);
            } else if (volume_spinner_index2 == 2) {
                return volume_utility.FromUKGallonsToLitres(volume_data);
            } else if (volume_spinner_index2 == 3) {
                return volume_utility.FromUKGallonsToML(volume_data);
            } else if (volume_spinner_index2 == 4) {
                return volume_utility.FromUKGallonsToCubicCM(volume_data);
            } else if (volume_spinner_index2 == 5) {
                return volume_utility.FromUKGallonsToCubicMetres(volume_data);
            } else if(volume_spinner_index2 == 6) {
                return volume_utility.FromUKGallonsToCubicInches(volume_data);
            } else {
                return volume_utility.FromUKGallonsToCubicFeet(volume_data);
            }
        } else if (volume_spinner_index1 == 1) {
            if(volume_spinner_index2 == 0){
                return volume_utility.FromUSGallonsToUKGallons(volume_data);
            } else if(volume_spinner_index2 == 1){
                return volume_utility.FromUSGallonsToUSGallons(volume_data);
            } else if (volume_spinner_index2 == 2) {
                return volume_utility.FromUSGallonsToLitres(volume_data);
            } else if (volume_spinner_index2 == 3) {
                return volume_utility.FromUSGallonsToML(volume_data);
            } else if (volume_spinner_index2 == 4) {
                return volume_utility.FromUSGallonsToCubicCM(volume_data);
            } else if (volume_spinner_index2 == 5) {
                return volume_utility.FromUSGallonsToCubicMetres(volume_data);
            } else if(volume_spinner_index2 == 6) {
                return volume_utility.FromUSGallonsToCubicInches(volume_data);
            } else {
                return volume_utility.FromUSGallonsToCubicFeet(volume_data);
            }
        } else if (volume_spinner_index1 == 2) {
            if(volume_spinner_index2 == 0){
                return volume_utility.FromLitresToUKGallons(volume_data);
            } else if(volume_spinner_index2 == 1){
                return volume_utility.FromLitresToUSGallons(volume_data);
            } else if (volume_spinner_index2 == 2) {
                return volume_utility.FromLitresToLitres(volume_data);
            } else if (volume_spinner_index2 == 3) {
                return volume_utility.FromLitresToML(volume_data);
            } else if (volume_spinner_index2 == 4) {
                return volume_utility.FromLitresToCubicCM(volume_data);
            } else if (volume_spinner_index2 == 5) {
                return volume_utility.FromLitresToCubicMetres(volume_data);
            } else if(volume_spinner_index2 == 6) {
                return volume_utility.FromLitresToCubicInches(volume_data);
            } else {
                return volume_utility.FromLitresToCubicFeet(volume_data);
            }
        } else if (volume_spinner_index1 == 3) {
            if(volume_spinner_index2 == 0){
                return volume_utility.FromMLToUKGallons(volume_data);
            } else if(volume_spinner_index2 == 1){
                return volume_utility.FromMLToUSGallons(volume_data);
            } else if (volume_spinner_index2 == 2) {
                return volume_utility.FromMLToLitres(volume_data);
            } else if (volume_spinner_index2 == 3) {
                return volume_utility.FromMLToML(volume_data);
            } else if (volume_spinner_index2 == 4) {
                return volume_utility.FromMLToCubicCM(volume_data);
            } else if (volume_spinner_index2 == 5) {
                return volume_utility.FromMLToCubicMetres(volume_data);
            } else if(volume_spinner_index2 == 6) {
                return volume_utility.FromMLToCubicInches(volume_data);
            } else {
                return volume_utility.FromMLToCubicFeet(volume_data);
            }
        } else if (volume_spinner_index1 == 4) {
            if(volume_spinner_index2 == 0){
                return volume_utility.FromCubicCMToUKGallons(volume_data);
            } else if(volume_spinner_index2 == 1){
                return volume_utility.FromCubicCMToUSGallons(volume_data);
            } else if (volume_spinner_index2 == 2) {
                return volume_utility.FromCubicCMToLitres(volume_data);
            } else if (volume_spinner_index2 == 3) {
                return volume_utility.FromCubicCMToML(volume_data);
            } else if (volume_spinner_index2 == 4) {
                return volume_utility.FromCubicCMToCubicCM(volume_data);
            } else if (volume_spinner_index2 == 5) {
                return volume_utility.FromCubicCMToCubicMetres(volume_data);
            } else if(volume_spinner_index2 == 6) {
                return volume_utility.FromCubicCMToCubicInches(volume_data);
            } else {
                return volume_utility.FromCubicCMToCubicFeet(volume_data);
            }
        } else if (volume_spinner_index1 == 5) {
            if(volume_spinner_index2 == 0){
                return volume_utility.FromCubicMetresToUKGallons(volume_data);
            } else if(volume_spinner_index2 == 1){
                return volume_utility.FromCubicMetresToUSGallons(volume_data);
            } else if (volume_spinner_index2 == 2) {
                return volume_utility.FromCubicMetresToLitres(volume_data);
            } else if (volume_spinner_index2 == 3) {
                return volume_utility.FromCubicMetresToML(volume_data);
            } else if (volume_spinner_index2 == 4) {
                return volume_utility.FromCubicMetresToCubicCM(volume_data);
            } else if (volume_spinner_index2 == 5) {
                return volume_utility.FromCubicMetresToCubicMetres(volume_data);
            } else if(volume_spinner_index2 == 6) {
                return volume_utility.FromCubicMetresToCubicInches(volume_data);
            } else {
                return volume_utility.FromCubicMetresToCubicFeet(volume_data);
            }
        } else if (volume_spinner_index1 == 6) {
            if(volume_spinner_index2 == 0){
                return volume_utility.FromCubicInchesToUKGallons(volume_data);
            } else if(volume_spinner_index2 == 1){
                return volume_utility.FromCubicInchesToUSGallons(volume_data);
            } else if (volume_spinner_index2 == 2) {
                return volume_utility.FromCubicInchesToLitres(volume_data);
            } else if (volume_spinner_index2 == 3) {
                return volume_utility.FromCubicInchesToML(volume_data);
            } else if (volume_spinner_index2 == 4) {
                return volume_utility.FromCubicInchesToCubicCM(volume_data);
            } else if (volume_spinner_index2 == 5) {
                return volume_utility.FromCubicInchesToCubicMetres(volume_data);
            } else if(volume_spinner_index2 == 6) {
                return volume_utility.FromCubicInchesToCubicInches(volume_data);
            } else {
                return volume_utility.FromCubicInchesToCubicFeet(volume_data);
            }
        }
        else {
            if(volume_spinner_index2 == 0){
                return volume_utility.FromCubicFeetToUKGallons(volume_data);
            } else if(volume_spinner_index2 == 1){
                return volume_utility.FromCubicFeetToUSGallons(volume_data);
            } else if (volume_spinner_index2 == 2) {
                return volume_utility.FromCubicFeetToLitres(volume_data);
            } else if (volume_spinner_index2 == 3) {
                return volume_utility.FromCubicFeetToML(volume_data);
            } else if (volume_spinner_index2 == 4) {
                return volume_utility.FromCubicFeetToCubicCM(volume_data);
            } else if (volume_spinner_index2 == 5) {
                return volume_utility.FromCubicFeetToCubicMetres(volume_data);
            } else if(volume_spinner_index2 == 6) {
                return volume_utility.FromCubicFeetToCubicInches(volume_data);
            } else {
                return volume_utility.FromCubicFeetToCubicFeet(volume_data);
            }
        }
    }
    
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}