package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.telephony.MbmsGroupCallSession;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed_weight;
    private EditText ed_height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_weight = findViewById(R.id.ed_weight);
        ed_height = findViewById(R.id.ed_height);

    }

    public void bmi (View view){
        float weight = Float.parseFloat(ed_weight.getText().toString());
        float height = Float.parseFloat(ed_height.getText().toString());
        float bmi = weight/(height*height);
        Log.d("MainActivit","bmi:"+bmi);

    }
}
