package com.example.bessmertnyi.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class LaunchActivity extends AppCompatActivity {
    Button editButton1, editButton2, editButton3, editButton4, editButton5, editButton6,
            editButton7, editButton8, editButton9, editButton0, editButtonAdd, editButtonDiff,
            editButtonMult, editButtonDiv, editButtonDot, editButtonEqual;
    TextView editTextView, resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        editTextView = findViewById(R.id.editTextView);
        resultTextView = findViewById(R.id.resultTextView);

        editButton1 = findViewById(R.id.editButton1);
        editButton2 = findViewById(R.id.editButton2);
        editButton3 = findViewById(R.id.editButton3);
        editButton4 = findViewById(R.id.editButton4);
        editButton5 = findViewById(R.id.editButton5);
        editButton6 = findViewById(R.id.editButton6);
        editButton7 = findViewById(R.id.editButton7);
        editButton8 = findViewById(R.id.editButton8);
        editButton9 = findViewById(R.id.editButton9);
        editButton0 = findViewById(R.id.editButton0);
        editButtonAdd = findViewById(R.id.editButtonAdd);
        editButtonDiff = findViewById(R.id.editButtonDiff);
        editButtonMult = findViewById(R.id.editButtonMult);
        editButtonDiv = findViewById(R.id.editButtonDiv);
        editButtonDot = findViewById(R.id.editButtonDot);
        editButtonEqual = findViewById(R.id.editButtonEqual);

        editButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "1");
                computCalculations();
            }
        });

        editButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "2");
                computCalculations();
            }
        });

        editButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "3");
                computCalculations();
            }
        });

        editButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "4");
                computCalculations();
            }
        });

        editButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "5");
                computCalculations();
            }
        });

        editButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "6");
                computCalculations();
            }
        });

        editButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "7");
                computCalculations();
            }
        });

        editButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "8");
                computCalculations();
            }
        });

        editButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "9");
                computCalculations();
            }
        });

        editButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "0");
                computCalculations();
            }
        });

        editButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "+");
            }
        });

        editButtonDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "-");
            }
        });

        editButtonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "*");
            }
        });

        editButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "/");
            }
        });

        editButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + ".");
            }
        });

        editButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(Double.toString(computCalculations()));
            }
        });

    }

    public double computCalculations() {
        double result = 0;
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("rhino");
        try {
            result = (Double)engine.eval(editTextView.getText().toString());
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        resultTextView.setText("= " + result);
        return result;
    }
}
