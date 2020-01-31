package com.example.adinkins.helloadinkins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Antonio", "Button Clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorAccent));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Antonio", "Button2 Clicked");
                findViewById(R.id.appContent).setBackgroundColor(getResources().getColor(R.color.skyBlue));

            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Antonio", "Button 3 Clicked");
                //String originalText = "Hello from Antonio!";
                // Capture the User input from Edit Text
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                // Modify textView with Captured user input when 'change text string' button is clicked
                if(TextUtils.isEmpty(newText)){
                    ((TextView)findViewById(R.id.textView)).setText(getResources().getString(R.string.originalText));
                }
                else {
                    ((TextView)findViewById(R.id.textView)).setText(newText);
                }

                //((TextView)findViewById(R.id.textView)).setText("Goodbye from Antonio!");
            }
        });
        findViewById(R.id.appContent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Antonio", "Everything reset");
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));
                findViewById(R.id.appContent).setBackgroundColor(getResources().getColor(R.color.holoBlueLight));
                ((TextView)findViewById(R.id.textView)).setText(getResources().getString(R.string.originalText));
            }
        });


    }
}
