package com.example.am.andro;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by aleks on 20.12.2017.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>{
    private ArrayList<Place> places = new ArrayList<>();

    PlaceAdapter(ArrayList<Place> places) {
        this.places = places;
    }

    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PlaceAdapter.ViewHolder holder, int position) {
  
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
