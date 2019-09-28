package com.lukban.a28septlabactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText subj1, subj2, subj3, subj4, subj5, subj6, subj7, subj8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subj1 =findViewById(R.id.editText);
        subj2 =findViewById(R.id.editText2);
        subj3 =findViewById(R.id.editText3);
        subj4 =findViewById(R.id.editText4);
        subj5 =findViewById(R.id.editText5);
        subj6 =findViewById(R.id.editText6);
        subj7 =findViewById(R.id.editText7);
        subj8 =findViewById(R.id.editText8);
    }

    public void saveData(View v) {
        String subj1Input = subj1.getText().toString();
        String subj2Input = subj2.getText().toString();
        String subj3Input = subj3.getText().toString();
        String subj4Input = subj4.getText().toString();
        String subj5Input = subj5.getText().toString();
        String subj6Input = subj6.getText().toString();
        String subj7Input = subj7.getText().toString();
        String subj8Input = subj8.getText().toString();
        String nextLine = "_";
        FileOutputStream writer = null;

        try {
            writer = openFileOutput("userSubjects.txt", MODE_PRIVATE);
            writer.write(subj1Input.getBytes());
            writer.write(nextLine.getBytes());
            writer.write(subj2Input.getBytes());
            writer.write(nextLine.getBytes());
            writer.write(subj3Input.getBytes());
            writer.write(nextLine.getBytes());
            writer.write(subj4Input.getBytes());
            writer.write(nextLine.getBytes());
            writer.write(subj5Input.getBytes());
            writer.write(nextLine.getBytes());
            writer.write(subj6Input.getBytes());
            writer.write(nextLine.getBytes());
            writer.write(subj7Input.getBytes());
            writer.write(nextLine.getBytes());
            writer.write(subj8Input.getBytes());

        } catch (FileNotFoundException e) {
            Log.d("error", "file not found");
        } catch (IOException e) {
            Log.d("error", "IO not found");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                Log.d("error", "file not found");
            }
        }
        Toast.makeText(this, "data saved", Toast.LENGTH_LONG).show();
    }
    public void nextPage(View v){
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}
