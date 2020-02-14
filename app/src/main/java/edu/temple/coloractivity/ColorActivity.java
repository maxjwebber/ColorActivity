package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] colors = getResources().getStringArray(R.array.colors);
        ColorAdapter adapter = new ColorAdapter(this,colors);
        Spinner spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

    }
}
