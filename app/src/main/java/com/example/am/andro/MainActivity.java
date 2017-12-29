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
import android.widget.TextView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btn) Button btn;
    @BindView(R.id.btn1) Button btn1;
    @BindView(R.id.edit) EditText editText;
    @BindView(R.id.miasto) TextView miasto;
    //@BindView(R.id.recyclerView) RecyclerView recyclerView;
    @Nullable
    @OnClick( R.id.btn)

    public void click (Button btn) {

        Intent intent = new Intent(MainActivity.this, okno2.class);
        startActivity(intent);

    }
    @Nullable
    @OnClick(R.id.btn1)
    public void click2(Button btn1){
        Intent intent = new Intent(MainActivity.this, okno2.class);
        String g = editText.getText().toString();
        miasto.setText(g);
        Bundle bundle = new Bundle();
        bundle.putString("item", g);
        intent.putExtras(bundle);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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










