package com.example.am.andro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

import android.support.v4.widget.ImageViewCompat;
import android.widget.ImageView;
import android.widget.TextView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.edit)
    EditText editText;
    @BindView(R.id.miasto)
    TextView city;
    @BindView(R.id.Ikona)
    ImageView ic;


    //@BindView(R.id.recyclerView) RecyclerView recyclerView;

    @OnClick(R.id.btn)

    public void click(View view) {

        Intent intent = new Intent(MainActivity.this, okno2.class);
        Bundle bundle = new Bundle();
        String enteredText = editText.getText().toString();
        bundle.putString("Key", enteredText);
        intent.putExtras(bundle);
        startActivity(intent);

    }

    @OnClick(R.id.btn1)
    public void click2(View view) {
        String g = editText.getText().toString();
        city.setText(g);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //ImageView Ikona=findViewById(R.id.Ikona);
        Glide.with(MainActivity.this).load(
                "http://www.woodbridgeschool.org.uk/wp-content/uploads/2015/05/happy.png").into(ic);

        Intent getData = getIntent();
        Bundle bundle = getIntent().getExtras();


        if (bundle != null) {
            String newcity = bundle.getString("CityName");
            city.setText(newcity);
        }
        //Button btn2 = findViewById(R.id.btn);
        //Button btn1 = findViewById(R.id.btn1);

        //final EditText editText = findViewById(R.id.edit);
        //final TextView miasto = findViewById(R.id.miasto);
//        btn2.setOnClickListener(new View.OnClickListener()
//
//        {
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, okno2.class);
//                startActivity(intent);
//
//            }
//
//
//        });
//      btn1.setOnClickListener(new View.OnClickListener()
//
//        {
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, okno2.class);
//                String g = editText.getText().toString();
//                miasto.setText(g);
//                Bundle bundle = new Bundle();
//                bundle.putString("item", g);
//                intent.putExtras(bundle);
//
//            }
//
//
//        }
//        );

    }
}










