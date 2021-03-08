package com.example.viikko7teht;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    String lause;
    EditText lauseInput;
    //TextWatcher watcher;
    Button nappula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.testFunction();
        text = (TextView) findViewById(R.id.textView);
        lauseInput = (EditText) findViewById(R.id.lauseInput);

        lauseInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                text.setText(s);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        nappula = (Button) findViewById(R.id.nappula);
        nappula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lause = lauseInput.getText().toString();
                text.setText(lause);


            }
        });



    }



    public void testFunction(View v){
        System.out.println("Hello world");
        //text.setText(lause);
    }

}
