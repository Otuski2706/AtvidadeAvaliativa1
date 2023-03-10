package com.example.app_temperatura_versao1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private EditText inputEditText;
    private Button converterButtonCelcius;
    private TextView outputTextView;

    CelciusStrategy C = new CelciusStrategy();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText  = findViewById(R.id.edittext_value);

        converterButtonCelcius = findViewById(R.id.button_converter_celcius);

        outputTextView = findViewById(R.id.textview_value_converted);

        converterButtonCelcius.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == converterButtonCelcius){
            double value = getValue();
            double temp = C.getConversion(value);
            outputTextView.setText(String.format("%.2f C", temp));
        }

    }

    private double getValue(){
        double value;
        String valueString;

        valueString = inputEditText.getText().toString();

        try{
            value = Double.valueOf(valueString);
        }catch(NumberFormatException nfExeption){
            value = 0;
            Toast.makeText(this, "Valor digitado é inválido.", Toast.LENGTH_SHORT).show();
        }

        return value;
    }
}