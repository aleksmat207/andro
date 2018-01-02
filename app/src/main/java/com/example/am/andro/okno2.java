package com.example.am.andro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class okno2 extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okno2);
        ButterKnife.bind(this);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Gliwice",11, "Możliwe przelotne opady deszczu"));
        places.add(new Place("Lublin",15, "Duże zachmurzenie"));
        places.add(new Place("Wrocław",9, "Słonecznie"));
        places.add(new Place("Poznań",13, "Lekkie zachmurzenie"));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);
    }
}
