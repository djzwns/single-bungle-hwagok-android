package org.techtown.sampleevent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private View view;
    private TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.view);
        tv = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                println("Button Cllick!!");
            }
        });

        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int action = event.getAction();
                float currentX = event.getX();
                float currentY = event.getY();
                switch (action)
                {
                    case MotionEvent.ACTION_DOWN:
                        println(String.format("Down: %f, %f", currentX, currentY));
                        break;

                    case MotionEvent.ACTION_MOVE:
                        println(String.format("Move: %f, %f", currentX, currentY));
                        break;

                    case MotionEvent.ACTION_UP:
                        println(String.format("Up: %f, %f", currentX, currentY));
                        break;
                }
                return true;
            }
        });
    }

    public void println(String s)
    {
        tv.append(s + "\n");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != KeyEvent.KEYCODE_BACK)
            return false;

        Toast.makeText(getApplicationContext(), "KeyDown Back", Toast.LENGTH_SHORT).show();
        return true;
//        return super.onKeyDown(keyCode, event);
    }
}