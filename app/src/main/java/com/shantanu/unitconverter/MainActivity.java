package com.shantanu.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private static final int[] images = {R.drawable.icon_area, R.drawable.icon_length, R.drawable.icon_mass, R.drawable.icon_temperature, R.drawable.icon_volume, R.drawable.icon_data};
    private static final String[] texts = {"Area", "Length", "Mass", "Temperature", "Volume", "Data"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);

        GridviewCustomAdapter adapter = new GridviewCustomAdapter(getApplicationContext(), images, texts);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, AreaActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, LengthActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, MassActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, TemperatureActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, VolumeActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this, DataActivity.class));
                        break;
                }
            }
        });
    }
}