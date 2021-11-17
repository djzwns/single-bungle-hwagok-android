package org.techtown.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        btn1 = findViewById(R.id.btnSimple);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                tv.setText("Simple Click");

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0000"));
                startActivity(myIntent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void onClickBtn(View view)
    {
        CharSequence text = tv.getText() == "Hello World!" ? "clicked" : "Hello World!";
        tv.setText(text);
        // bottom text
        Toast.makeText(getApplicationContext(), "Toast Text", Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(myIntent);
    }
}