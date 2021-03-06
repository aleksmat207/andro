package com.example.am.andro;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by aleks on 20.12.2017.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {
    private ArrayList<Place> places = new ArrayList<>();
    private OnClickPlace listener;


    PlaceAdapter(ArrayList<Place> places,OnClickPlace listener) {
        this.places = places;
        this.listener=listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView, listener);
    }

    @Override
    public void onBindViewHolder(PlaceAdapter.ViewHolder holder, int position) {
        holder.setPlaceName(places.get(position).getPlaceName() + "");
        holder.setTemperature(places.get(position).getTemperature() + "");
        holder.setInformation(places.get(position).getInformation() + "");
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
   


        @BindView(R.id.info)
        TextView placeInfo;

        @BindView(R.id.nazwaMiejsca)
        TextView placeName;

        @BindView(R.id.temp)
        TextView temperature;

//        @OnClick(R.id.btn)
//        void selectPlace() {
//         openAlertDialog();
//        }
         private OnClickPlace listener;

        public ViewHolder(View itemView, OnClickPlace listener) {
            super(itemView);

            ButterKnife.bind(this, itemView);
            this.listener = listener;
            itemView.setOnClickListener(this);
        }


        public void setPlaceName(String name) {
            placeName.setText(name);
        }

        public void setTemperature(String s) {
            temperature.setText(s);
        }

        public void setInformation(String s) {
            placeInfo.setText(s);
        }


        @Override
        public void onClick(View view) {listener.onClickPlace(view, getAdapterPosition());
        }
//        private void openAlertDialog() {
//            AlertDialog.Builder builder;
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                builder = new AlertDialog.Builder(itemView.getContext(), android.R.style.Theme_Material_Dialog_Alert);
//            } else {
//                builder = new AlertDialog.Builder(itemView.getContext());
//            }
//            builder.setTitle(itemView.getContext().getString(R.string.alert_title))
//                    .setMessage(itemView.getContext().getString(R.string.alert_dialog))
//                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int which) {
//                            // continue
//                        }
//                    })
//                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int which) {
//                            //n
//                        }
//                    })
//                    .setIcon(android.R.drawable.ic_dialog_alert)
//                    .show();
//        }
    }

}
