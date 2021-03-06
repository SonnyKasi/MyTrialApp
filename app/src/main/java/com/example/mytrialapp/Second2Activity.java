package com.example.mytrialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Second2Activity extends AppCompatActivity {

    String description = "Passing Messages Activity";
    EditText editText;
    Button btn = (Button) findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText= (EditText) findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namevalue = editText.getText().toString();
                Intent intent = new Intent(Second2Activity.this,ThirdActivity.class);
                intent.putExtra("Name",namevalue);
                startActivity(intent);
            }
        });
    }
}
