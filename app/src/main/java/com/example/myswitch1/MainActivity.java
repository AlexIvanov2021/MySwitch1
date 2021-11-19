package com.example.myswitch1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch aSwitch;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.switch2);
        radioGroup = findViewById(R.id.radioGroup);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                   compoundButton.setText("true");

                }else{
                    compoundButton.setText("false");
                }

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.one) {
                    Toast.makeText(getApplicationContext(), "one", Toast.LENGTH_SHORT).show();
                }
                if (i == R.id.two) {
                    Toast.makeText(getApplicationContext(), "two", Toast.LENGTH_SHORT).show();
                }
                if (i == R.id.there) {
                    Toast.makeText(getApplicationContext(), "there", Toast.LENGTH_SHORT).show();
                }
                if (i == R.id.four) {
                    Toast.makeText(getApplicationContext(), "four", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}