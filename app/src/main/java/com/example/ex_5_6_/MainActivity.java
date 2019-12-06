package com.example.ex_5_6_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    LinearLayout  layout1,layout2,layout3,layout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1=(LinearLayout)findViewById(R.id.layout1);
        layout2=(LinearLayout)findViewById(R.id.layout2);
        layout3=(LinearLayout)findViewById(R.id.layout3);
        layout4=(LinearLayout)findViewById(R.id.layout4);


        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"넓이="+layout1.getWidth()+"높이="+layout1.getHeight(),Toast.LENGTH_LONG).show();
            }
        });
//자바는 픽셀로 표현되며, xml은 dp로표현된다.
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"넓이="+layout2.getWidth()+"높이="+layout2.getHeight(),Toast.LENGTH_LONG).show();

            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"넓이="+layout3.getWidth()+"높이="+layout3.getHeight(),Toast.LENGTH_LONG).show();
            }
        });

        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"넓이="+layout4.getWidth()+"높이="+layout4.getHeight(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
