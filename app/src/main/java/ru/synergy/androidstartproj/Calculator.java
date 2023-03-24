package ru.synergy.androidstartproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;


public class Calculator extends AppCompatActivity {

    private static final String LogcatTag ="CALCULATOR_ACTIVITY";
    private static final String LifecycleTag = "LIFECYCLE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LifecycleTag, "I'm onCreate(),and i'm started");
        setContentView(R.layout.activity_calculator);

        final Button calculate = (Button) findViewById(R.id.calc);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view ) {
                Log.d(LogcatTag,"Button have been pushed");
                calcuclateAnswe();

            }
        });
    }
   @Override
   protected void onStop(){
        super.onStop();
        Log.d(LifecycleTag, "I'm onStart(), started");
   }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(LifecycleTag, "I'm onStart(), started");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(LifecycleTag, "I'm onStart(), started");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(LifecycleTag, "I'm onStart(), started");
    }

    private void calcuclateAnswe() {
        EditText numOne = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText numTwo = (EditText) findViewById(R.id.editTextNumberDecimal2);

        RadioButton add = (RadioButton) findViewById(R.id.add);
        RadioButton sub = (RadioButton) findViewById(R.id.subtract);
        RadioButton multiply = (RadioButton) findViewById(R.id.multiple);
        RadioButton divide = (RadioButton) findViewById(R.id.divide);

        TextView answer = (TextView) findViewById(R.id.result);

        Log.d(LogcatTag, "All views have been founded");


        float numone = Integer.parseInt(numOne.getText().toString());
        float numtwo = Integer.parseInt(numTwo.getText().toString());

        Log.d(LogcatTag,"Successfully grabbed data from input fields");
        Log.d(LogcatTag,"numone is:" + numone +" ; "+" numtwo is:"  + numtwo);

        float solution = 0;

        if (add.isChecked()) {
            Log.d(LogcatTag,"Operation is add");
            solution = numone + numtwo;
        }
        if (sub.isChecked()) {
            Log.d(LogcatTag,"Operation is sub");
            solution = numone - numtwo;
        }
        if (multiply.isChecked()) {
            Log.d(LogcatTag,"Operation is multiply");
            solution = numone * numtwo;
        }
        if (divide.isChecked()) {
            Log.d(LogcatTag,"Operation is divide");
            if (numtwo == 0) {
                Toast.makeText(this, "Number two Cannon be zero", Toast.LENGTH_SHORT).show();
                return;
            }
            solution = numone / numtwo;
        }


        Log.d(LogcatTag, "The result of operation is:" + solution);

        answer.setText("The answer is " + solution);
    



    }

}   






    
