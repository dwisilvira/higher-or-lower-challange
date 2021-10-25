package com.example.androidstudiochallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity<int_randomNumber> extends AppCompatActivity {
    int randomNumber;
    public void makeToast(String string) {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }
    public void guess(View view) {
        EditText guessEditTextNumber = (EditText) findViewById(R.id.guessEditTextNumber);

        int guessInt = Integer.parseInt(guessEditTextNumber.getText().toString());

        if (guessInt > randomNumber) {
           makeToast("Lower!");
        }else if (guessInt < randomNumber) {
            makeToast("Higher!");
        }else {
            makeToast("That's right! Try again!");
            Random rand = new Random();
            randomNumber = rand.nextInt(30) + 1;
        }

        // Toast.makeText(MainActivity.this, guessEditTextNumber.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(30) + 1;
    }


}