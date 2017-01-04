package com.example.kimo.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtDisplay ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDisplay = (TextView)findViewById(R.id.txtDisplay);
    }

    public void login(View view) {
        TextView usr =  (TextView)findViewById(R.id.editText2);
        txtDisplay.setText("Welcome " + usr.getText());
    }
}
