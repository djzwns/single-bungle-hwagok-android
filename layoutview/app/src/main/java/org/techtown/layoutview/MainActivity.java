package org.techtown.layoutview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static int index = 0;
    private FrameLayout layout;
    private ArrayList<ImageView> views = new ArrayList<ImageView>();
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.frameLayout);
        views.add(findViewById(R.id.iv1));
        views.add(findViewById(R.id.iv2));
        views.add(findViewById(R.id.iv3));
        for (ImageView view : views) {
            view.setVisibility(View.INVISIBLE);
        }
        views.get(0).setVisibility(View.VISIBLE);

        btn = findViewById(R.id.btnImageChange);
//        btn.setOnClickListener();
    }

    public void onClickBtn(View view)
    {
        index = (index + 1) % views.size();

        for(ImageView v : views)
        {
            if (v == views.get(index))
                v.setVisibility(View.VISIBLE);
            else
                v.setVisibility(View.INVISIBLE);
        }
    }
}