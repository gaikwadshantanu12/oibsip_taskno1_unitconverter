package com.shantanu.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import com.shantanu.unitconverter.utility.AreaConverterUtility;
import java.util.Objects;

public class AreaActivity extends AppCompatActivity {

    private Spinner spinner1, spinner2;
    private TextInputEditText input1, input2;
    private AppCompatButton area_convert_btn;
    private int spinner_index1, spinner_index2;
    private AreaConverterUtility utility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        // creating instance of AreaConverterUtility for DAO
        utility = new AreaConverterUtility();

        // add back button to toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // change activity title
        getSupportActionBar().setTitle("Area Converter");

        // obtain ids
        obtainAllIds();

        // spinner listener
        spinnerListener(spinner1, spinner2);

        area_convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Objects.requireNonNull(input1.getText()).toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter some value !", Toast.LENGTH_SHORT).show();
                }
                else {
                    double value = Double.parseDouble(Objects.requireNonNull(input1.getText()).toString());
                    input2.setText(""+ConvertArea(value));
                }

                // correct index.
                // Toast.makeText(getApplicationContext(),"s1 = "+spinner_index1+", s2 = "+spinner_index2, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void obtainAllIds(){
        spinner1 = findViewById(R.id.area_spinner1);
        spinner2 = findViewById(R.id.area_spinner2);
        input1 = findViewById(R.id.input_text1);
        input2 = findViewById(R.id.input_text2);
        area_convert_btn = findViewById(R.id.area_convert_btn);
    }

    private void spinnerListener(Spinner s1, Spinner s2) {
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner_index1 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner_index2 = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private double ConvertArea(double area_data){
        if(spinner_index1 == 0) {
            if(spinner_index2 == 0){
                return utility.FromAcresToAcres(area_data);
            }
            else if(spinner_index2 == 1){
                return utility.FromAcresToAres(area_data);
            } else if (spinner_index2 == 2) {
                return utility.FromAcresToHectares(area_data);
            } else if (spinner_index2 == 3) {
                return utility.FromAcresToSquareCentimetres(area_data);
            } else if (spinner_index2 == 4) {
                return utility.FromAcresToSquareFeet(area_data);
            } else if (spinner_index2 == 5) {
                return utility.FromAcresToSquareInches(area_data);
            }
            else {
                return utility.FromAcresToSquareMetres(area_data);
            }
        } else if (spinner_index1 == 1) {
            if(spinner_index2 == 0){
                return utility.FromAresToAcres(area_data);
            }
            else if(spinner_index2 == 1){
                return utility.FromAresToAres(area_data);
            } else if (spinner_index2 == 2) {
                return utility.FromAresToHectares(area_data);
            } else if (spinner_index2 == 3) {
                return utility.FromAresToSquareCentimetres(area_data);
            } else if (spinner_index2 == 4) {
                return utility.FromAresToSquareFeet(area_data);
            } else if (spinner_index2 == 5) {
                return utility.FromAresToSquareInches(area_data);
            }
            else {
                return utility.FromAresToSquareMetres(area_data);
            }
        } else if (spinner_index1 == 2) {
            if(spinner_index2 == 0){
                return utility.FromHectaresToAcres(area_data);
            }
            else if(spinner_index2 == 1){
                return utility.FromHectaresToAres(area_data);
            } else if (spinner_index2 == 2) {
                return utility.FromHectaresToHectares(area_data);
            } else if (spinner_index2 == 3) {
                return utility.FromHectaresToSquareCentimetres(area_data);
            } else if (spinner_index2 == 4) {
                return utility.FromHectaresToSquareFeet(area_data);
            } else if (spinner_index2 == 5) {
                return utility.FromAcresToSquareInches(area_data);
            }
            else {
                return utility.FromHectaresToSquareMetres(area_data);
            }
        } else if (spinner_index1 == 3) {
            if(spinner_index2 == 0){
                return utility.FromSquareCentimetresToAcres(area_data);
            }
            else if(spinner_index2 == 1){
                return utility.FromSquareCentimetresToAres(area_data);
            } else if (spinner_index2 == 2) {
                return utility.FromSquareCentimetresToHectares(area_data);
            } else if (spinner_index2 == 3) {
                return utility.FromSquareCentimetresToSquareCentimetres(area_data);
            } else if (spinner_index2 == 4) {
                return utility.FromSquareCentimetresToSquareFeet(area_data);
            } else if (spinner_index2 == 5) {
                return utility.FromSquareCentimetresToSquareInches(area_data);
            }
            else {
                return utility.FromSquareCentimetresToSquareMetres(area_data);
            }
        } else if (spinner_index1 == 4) {
            if(spinner_index2 == 0){
                return utility.FromSquareFeetToAcres(area_data);
            }
            else if(spinner_index2 == 1){
                return utility.FromSquareFeetToAres(area_data);
            } else if (spinner_index2 == 2) {
                return utility.FromSquareFeetToHectares(area_data);
            } else if (spinner_index2 == 3) {
                return utility.FromSquareFeetToSquareCentimetres(area_data);
            } else if (spinner_index2 == 4) {
                return utility.FromSquareFeetToSquareFeet(area_data);
            } else if (spinner_index2 == 5) {
                return utility.FromSquareFeetToSquareInches(area_data);
            }
            else {
                return utility.FromSquareFeetToSquareMetres(area_data);
            }
        } else if (spinner_index1 == 5) {
            if(spinner_index2 == 0){
                return utility.FromSquareInchesToAcres(area_data);
            }
            else if(spinner_index2 == 1){
                return utility.FromSquareInchesToAres(area_data);
            } else if (spinner_index2 == 2) {
                return utility.FromSquareInchesToHectares(area_data);
            } else if (spinner_index2 == 3) {
                return utility.FromSquareInchesToSquareCentimetres(area_data);
            } else if (spinner_index2 == 4) {
                return utility.FromSquareInchesToSquareFeet(area_data);
            } else if (spinner_index2 == 5) {
                return utility.FromSquareInchesToSquareInches(area_data);
            }
            else {
                return utility.FromSquareInchesToSquareMetres(area_data);
            }
        } else {
            if(spinner_index2 == 0){
                return utility.FromSquareMetresToAcres(area_data);
            }
            else if(spinner_index2 == 1){
                return utility.FromSquareMetresToAres(area_data);
            } else if (spinner_index2 == 2) {
                return utility.FromSquareMetresToHectares(area_data);
            } else if (spinner_index2 == 3) {
                return utility.FromSquareMetresToSquareCentimetres(area_data);
            } else if (spinner_index2 == 4) {
                return utility.FromSquareMetresToSquareFeet(area_data);
            } else if (spinner_index2 == 5) {
                return utility.FromSquareMetresToSquareInches(area_data);
            }
            else {
                return utility.FromSquareMetresToSquareMetres(area_data);
            }
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}