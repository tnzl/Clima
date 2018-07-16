package com.londonappbrewery.climapm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class ChangeCityController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_city_layout);

        final EditText editCityField=new EditText(this);
        final ImageButton backButton=new ImageButton(this);


        editCityField.findViewById(R.id.queryET);
        backButton.findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newCityIntent=new Intent(ChangeCityController.this,WeatherController.class);
                newCityIntent.putExtra("city","");
                startActivity(newCityIntent);
            }
        });

        editCityField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                String newcity=(editCityField.getText()).toString();
                Intent myIntent=new Intent(ChangeCityController.this,WeatherController.class);
                myIntent.putExtra("city",newcity);

                startActivity(myIntent);

                return false;
            }
        });


    }
}
