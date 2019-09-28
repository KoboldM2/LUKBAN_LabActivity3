package com.lukban.a28septlabactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class SecondActivity extends AppCompatActivity {
    CheckBox firstSubj, secondSubj, thirdSubj, fourthSubj, fifthSubj, sixthSubj, seventhSubj, eighthSubj;


    public String fileName = "userSubjects.txt";
    public String line = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.setTitle("Subjects Taken");

        firstSubj = findViewById(R.id.checkBox1);
        secondSubj = findViewById(R.id.checkBox2);
        thirdSubj = findViewById(R.id.checkBox3);
        fourthSubj = findViewById(R.id.checkBox4);
        fifthSubj = findViewById(R.id.checkBox5);
        sixthSubj = findViewById(R.id.checkBox6);
        seventhSubj = findViewById(R.id.checkBox7);
        eighthSubj = findViewById(R.id.checkBox8);

        try {
            FileInputStream reader = new FileInputStream("userSubjects.txt");
            char test = (char) reader.read();

        }

        catch(IOException e) {
            e.printStackTrace();
        }


    }
}
