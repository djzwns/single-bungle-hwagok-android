package org.techtown.challenge_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private EditText etNum1;
    private EditText etNum2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        tvResult = findViewById(R.id.tvResult);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = 0, num2 = 0;
                try {
                    num1 = Integer.parseInt(etNum1.getText().toString());
                    num2 = Integer.parseInt(etNum2.getText().toString());
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
                }
                String result = String.format("%d", num1 + num2);
                tvResult.setText(result);
            }
        });

        btnSub = findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = 0, num2 = 0;
                try {
                    num1 = Integer.parseInt(etNum1.getText().toString());
                    num2 = Integer.parseInt(etNum2.getText().toString());
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
                }
                String result = String.format("%d", num1 - num2);
                tvResult.setText(result);
            }
        });

        btnMul = findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = 0, num2 = 0;
                try {
                    num1 = Integer.parseInt(etNum1.getText().toString());
                    num2 = Integer.parseInt(etNum2.getText().toString());
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
                }
                String result = String.format("%d", num1 * num2);
                tvResult.setText(result);
            }
        });

        btnDiv = findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = 0f, num2 = 0f;
                String result = "";
                try {
                    num1 = Float.parseFloat(etNum1.getText().toString());
                    num2 = Float.parseFloat(etNum2.getText().toString());
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
                }

                try {
                    result = String.format("%f", num1 / num2);
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
                }
                tvResult.setText(result);
            }
        });
    }
}