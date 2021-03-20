package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {


    Button delete, div, multiplication, difference, sum, clear, sevenbutton, fourbutton, onebutton, decimalbutton, power, eightbutton, fivebutton, twobutton, zerobutton, modulusbutton, ninebutton, sixbutton, threebutton, equalbutton;

    TextView inputstextview, outputtextview;
    String inputnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        delete = findViewById(R.id.delete);
        div = findViewById(R.id.division);
        multiplication = findViewById(R.id.multiplication);
        difference = findViewById(R.id.difference);
        sum = findViewById(R.id.addition);
        power = findViewById(R.id.power);
        clear = findViewById(R.id.clear);
        equalbutton = findViewById(R.id.equal);
        zerobutton = findViewById(R.id.zero);
        onebutton = findViewById(R.id.one);
        twobutton = findViewById(R.id.two);
        threebutton = findViewById(R.id.three);
        fourbutton = findViewById(R.id.four);
        fivebutton = findViewById(R.id.five);
        sixbutton = findViewById(R.id.six);
        sevenbutton = findViewById(R.id.seven);
        eightbutton = findViewById(R.id.eight);
        ninebutton = findViewById(R.id.nine);
        decimalbutton = findViewById(R.id.decimal);
        modulusbutton = findViewById(R.id.modulus);
        inputstextview = findViewById(R.id.inputs);
        outputtextview = findViewById(R.id.output);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputstextview.setText("");
                outputtextview.setText("");

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                if (inputnumber.length()==0)
                {}
                else
                {
                    String del = inputnumber.substring(0,inputnumber.length()-1);
                    inputstextview.setText(del + "");
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "/");
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "*");
            }
        });

        equalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();

                ScriptEngine engine = new ScriptEngineManager().getEngineByName(  "rhino");

                try {
                    double result = (double)engine.eval(inputnumber);

                    outputtextview.setText(result+"");

                }
                catch (ScriptException e)
                {
                    Toast.makeText(getApplicationContext(),"syntax error/maths error",Toast.LENGTH_SHORT).show();
                }


            }
        });

        difference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "-");

            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "+");
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "**");
            }
        });


        modulusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "%");
            }
        });

        decimalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ ".");
            }
        });



        onebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "1");
            }
        });

        twobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "2");
            }
        });

        threebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "3");
            }
        });

        fourbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "4");
            }
        });

        fivebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "5");
            }
        });

        sixbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "6");
            }
        });

        sevenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "7");
            }
        });

        eightbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "8");
            }
        });
        ninebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "9");
            }
        });

        zerobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber= inputstextview.getText().toString();
                inputstextview.setText(inputnumber+ "0");
            }
        });


    }
}