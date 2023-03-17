package ru.synergy.androidstartproj;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView textView =(TextView) findViewById(R.id.normal);

       textView.setText("Text from java code");
       textView.setTextColor(Color.RED);





//        TextView textView = (TextView) findViewById(R.id.header);

//        textView.setText("**Hello from Java**");

 //       ConstraintLayout constraintLayout = new ConstraintLayout(this);
 //       TextView textView = new TextView(this);//
//          textView.setText("!!!Hello Android!!!");
//          textView.setTextSize(26);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT);
//       layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
//
//       textView.setLayoutParams(layoutParams);
//
//        constraintLayout.addView(textView);
//
//        setContentView(constraintLayout);


    }
}
