package com.example.arizki.kolam;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SensorAdapter {
    ArrayList<Sensor> listSensor;
    Context context;

    public SensorAdapter(Context context){
        this.context = context;
    }

    public ArrayList<com.example.arizki.kolam.Sensor> getListSensor(){
        return listSensor;
    }

    public void setListSensor(com.example.arizki.kolam.Sensor> listSensor){

        this.listSensor = listSensor;
    }

    @NonNull
    @Override
    public SensorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kekeruhan_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SensorAdapter.ViewHolder viewHolder, int i) {
        viewHolder.NTU.setText(getListSensor().get(i).getNTU());
        viewHolder.Kg.setText(getListSensor().get(i).getKg());
        viewHolder.Status.setText(getListSensor().get(i).getstatus());
    }
    @Override
    public int getItemCount() {
        return getListSensor().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.hasilKg)
        TextView pH;
        @BindView(R.id.hasilNTU)
        TextView nutrisi;
        @BindView(R.id.Status)
        TextView volair;


        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
