package com.ylzhao.task1;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn,preBtn;
    private TextView textView;
    private ImageView imageView;
    private EditText editText;
    private int clickTimes,clickTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        preBtn=findViewById(R.id.previous_picture);
        textView=findViewById(R.id.textView);
        imageView=findViewById(R.id.imageView);
        editText=findViewById(R.id.input);
        clickTimes=clickTime=0;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickTimes=clickTimes+1;
                clickTime=clickTime+1;
                textView.setText(String.format("click %d", clickTime));
                if (clickTimes%3==0)imageView.setImageResource(R.mipmap.pic);
                else if (clickTimes%3==1)imageView.setImageResource(R.mipmap.a2);
                else imageView.setImageResource(R.mipmap.a27);
                Log.d("MainActivity","next pic");
            }
        });

        preBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickTimes=clickTimes-1;
                clickTime=clickTime+1;
                textView.setText(String.format("click %d", clickTime));
                if (clickTimes%3==0)imageView.setImageResource(R.mipmap.pic);
                else if (clickTimes%3==1)imageView.setImageResource(R.mipmap.a2);
                else imageView.setImageResource(R.mipmap.a27);
                Log.d("MainActivity","pre pic");
            }
        });

        Log.d("MainActivity","start");
    }
}
