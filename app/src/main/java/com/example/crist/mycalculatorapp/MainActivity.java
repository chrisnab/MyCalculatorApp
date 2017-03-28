package com.example.crist.mycalculatorapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    /**
     * Value of the first number
     */
    private double num1 = Double.NaN;

    /**
     * value of the second number
     */
    private double num2;

    /**
     * Static final fields to hold all possible operations of the calculator
     */
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    /**
     * character to keep track of current operation
     */
    private char CURRENT_ACTION;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
         @Author: Artin
         Getting the textField, making it uneditable, and setting its text size
          */
        final EditText textField = (EditText) findViewById(R.id.textField);
        textField.setEnabled(false);
        textField.setTextSize(32);

        /*
        @Author: Artin
        Getting all the number buttons and providing functionality to them
         */
        Button num0 = (Button)findViewById(R.id.num0);
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText(textField.getText() + "0");
            }
        });

        Button num1 = (Button)findViewById(R.id.num1);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText(textField.getText() + "1");
            }
        });

       Button num2 = (Button)findViewById(R.id.num2);
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText(textField.getText() + "2");
            }
        });

        Button num3 = (Button)findViewById(R.id.num3);
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText(textField.getText() + "3");
            }
        });

        Button num4 = (Button)findViewById(R.id.num4);
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText(textField.getText() + "4");
            }
        });

        Button num5 = (Button)findViewById(R.id.num5);
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText(textField.getText() + "5");
            }
        });

        Button num6 = (Button)findViewById(R.id.num6);
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText(textField.getText() + "6");
            }
        });

        Button num7 = (Button)findViewById(R.id.num7);
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText(textField.getText() + "7");
            }
        });

        Button num8 = (Button)findViewById(R.id.num8);
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText(textField.getText() + "8");
            }
        });

        Button num9 = (Button)findViewById(R.id.num9);
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText(textField.getText() + "9");
            }
        });

        Button clear = (Button)findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textField.setText("");
            }
        });

        Button delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textField.getText().length()>0)
                    textField.getText().delete(textField.getText().length()-1, textField.getText().length());
            }
        });
        //TODO: Add funtionality for operations
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

}
