package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, dotButton, addButton, subButton, intButton, divButton, equalButton;
    private Button clearAll;
    private TextView resultView;

    double var1, var2;

    boolean add, sub, mul, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0Id);
        button1 = findViewById(R.id.button1Id);
        button2 = findViewById(R.id.button2Id);
        button3 = findViewById(R.id.button3Id);
        button4 = findViewById(R.id.button4Id);
        button5 = findViewById(R.id.button5Id);
        button6 = findViewById(R.id.button6Id);
        button7 = findViewById(R.id.button7Id);
        button8 = findViewById(R.id.button8Id);
        button9 = findViewById(R.id.button9Id);

        addButton = findViewById(R.id.addButtonId);
        subButton = findViewById(R.id.subButtonId);
        intButton = findViewById(R.id.intButtonId);
        divButton = findViewById(R.id.divButtonId);
        dotButton = findViewById(R.id.dotButtonId);

        equalButton = findViewById(R.id.equalButtonId);
        clearAll = findViewById(R.id.clearallId);

        resultView = findViewById(R.id.diplayTextId);



        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        dotButton.setOnClickListener(this);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        intButton.setOnClickListener(this);
        divButton.setOnClickListener(this);

        equalButton.setOnClickListener(this);
        clearAll.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        try{
            if(view.getId() == R.id.button0Id){
                resultView.setText(resultView.getText()+"0");
            }

            if(view.getId() == R.id.button1Id){
                resultView.setText(resultView.getText()+"1");
            }

            if(view.getId() == R.id.button2Id){
                resultView.setText(resultView.getText()+"2");
            }

            if(view.getId() == R.id.button3Id){
                resultView.setText(resultView.getText()+"3");
            }

            if(view.getId() == R.id.button4Id){
                resultView.setText(resultView.getText()+"4");
            }

            if(view.getId() == R.id.button5Id){
                resultView.setText(resultView.getText()+"5");
            }

            if(view.getId() == R.id.button6Id){
                resultView.setText(resultView.getText()+"6");
            }

            if(view.getId() == R.id.button7Id){
                resultView.setText(resultView.getText()+"7");
            }

            if(view.getId() == R.id.button8Id){
                resultView.setText(resultView.getText()+"8");
            }

            if(view.getId() == R.id.button9Id){
                resultView.setText(resultView.getText()+"9");
            }

            if(view.getId() == R.id.dotButtonId){
                resultView.setText(resultView.getText()+".");
            }


            if(view.getId() == R.id.addButtonId){

                var1 = Double.parseDouble(resultView.getText()+ "");
                add=true;
                resultView.setText(null);
            }

            if(view.getId() == R.id.subButtonId){

                var1 = Double.parseDouble(resultView.getText()+ "");
                sub=true;
                resultView.setText(null);
            }

            if(view.getId() == R.id.intButtonId){

                var1 = Double.parseDouble(resultView.getText()+ "");
                mul=true;
                resultView.setText(null);
            }

            if(view.getId() == R.id.divButtonId){

                var1 = Double.parseDouble(resultView.getText()+ "");
                div=true;
                resultView.setText(null);
            }


            if(view.getId() == R.id.equalButtonId){

                var2 = Double.parseDouble(resultView.getText() +"");


                if(add == true){
                    resultView.setText(var1+var2 + "");
                    add=false;
                }

                if(sub == true){
                    resultView.setText(var1-var2 + "");
                    sub=false;
                }

                if(mul == true){
                    resultView.setText(var1*var2 + "");
                    mul=false;
                }

                if(div == true){
                    resultView.setText(var1/var2 + "");
                    div=false;
                }


            }

            if(view.getId() == R.id.clearallId){
                var1 = 0;
                var2 = 0;
                resultView.setText(null);
                return;

            }

        }

        catch (Exception e){
            Toast.makeText(MainActivity.this,"Please enter number first", Toast.LENGTH_SHORT).show();
        }





    }
}
