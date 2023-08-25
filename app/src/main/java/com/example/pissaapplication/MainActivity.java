package com.example.pissaapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtname, txtnumber;
    CheckBox Large, Mediam , Reguler;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname = (EditText) findViewById(R.id.txtNumber);
        txtnumber = (EditText) findViewById(R.id.txtNumber);
        Large = (CheckBox) findViewById(R.id.large);
        Mediam = (CheckBox) findViewById(R.id.medium);
        Reguler = (CheckBox) findViewById(R.id.reguler);
        btnSubmit = (Button) findViewById(R.id.button);

    }

    public void orderPizza(View view){
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amount = 0;
                if (Large.isChecked()){
                    amount = amount + 1500;
                }
                if(Mediam.isChecked()){
                    amount = amount + 800;
                }
                if(Reguler.isChecked()){
                    amount = amount + 500;
                }

                Toast.makeText(MainActivity.this, String.valueOf(amount), Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),txtname.getText() + "Total Amount : "+String.valueOf(amount), Toast.LENGTH_LONG).show();
            }
        });
    }
}