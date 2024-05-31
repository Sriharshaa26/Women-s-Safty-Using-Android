package com.vinayak09.wsafety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.Arrays;

public class RegisterNumberActivity extends AppCompatActivity {

    TextInputEditText number1, number2, number3, number4, number5;
    TextInputEditText number6, number7, number8, number9, number10;
    TextInputEditText number11, number12, number13, number14, number15;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor myEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_number);

        sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        myEdit = sharedPreferences.edit();

        number1 = findViewById(R.id.numberEdit1);
        number2 = findViewById(R.id.numberEdit2);
        number3 = findViewById(R.id.numberEdit3);
        number4 = findViewById(R.id.numberEdit4);
        number5 = findViewById(R.id.numberEdit5);
        number6 = findViewById(R.id.numberEdit6);
        number7 = findViewById(R.id.numberEdit7);
        number8 = findViewById(R.id.numberEdit8);
        number9 = findViewById(R.id.numberEdit9);
        number10 = findViewById(R.id.numberEdit10);
        number11 = findViewById(R.id.numberEdit11);
        number12 = findViewById(R.id.numberEdit12);
        number13 = findViewById(R.id.numberEdit13);
        number14 = findViewById(R.id.numberEdit14);
        number15 = findViewById(R.id.numberEdit15);
    }

    public void saveNumber(View view) {

        String numberString = number1.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM1", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number2.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM2", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number3.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM3", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number4.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM4", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number5.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM5", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number6.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM6", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number7.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM7", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number8.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM8", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number9.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM9", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number10.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM10", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number11.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM11", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number12.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM12", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number13.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM13", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number14.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM14", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        numberString = number15.getText().toString().trim();
        if (numberString != null && !numberString.equals("")){
            if(numberString.length()==10){
                myEdit.putString("ENUM15", numberString);
                myEdit.apply();
            }else {
                Toast.makeText(this, "Enter Valid Number!", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        RegisterNumberActivity.this.finish();

    }
}