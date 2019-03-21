package com.gotobus;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class TripsAdapter extends RecyclerView.Adapter<TripsAdapter.MyViewHolder> {
    Context context;
    ArrayList<Trip> trips;

    public TripsAdapter(Context context, ArrayList<Trip> trips) {
        this.context = context;
        this.trips = trips;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int type) {
        View view = LayoutInflater.from(context).inflate(R.layout.trip_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        myViewHolder.date.setText(trips.get(i).date);
        myViewHolder.fare.setText("₹" + trips.get(i).fare);
        myViewHolder.bus.setText(trips.get(i).bus);
        myViewHolder.type.setText(trips.get(i).type);
        myViewHolder.status.setText(trips.get(i).status);
        myViewHolder.source.setText(trips.get(i).source);
        myViewHolder.destination.setText(trips.get(i).destination);
    }

    @Override
    public int getItemCount() {
        return trips.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView date, fare, bus, type, status, source, destination;

        public MyViewHolder(View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.date);
            fare = itemView.findViewById(R.id.fare);
            bus = itemView.findViewById(R.id.bus);
            type = itemView.findViewById(R.id.type);
            status = itemView.findViewById(R.id.status);
            source = itemView.findViewById(R.id.source);
            destination = itemView.findViewById(R.id.destination);
        }
    }
}
