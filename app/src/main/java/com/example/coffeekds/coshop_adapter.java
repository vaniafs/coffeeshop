package com.example.coffeekds;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class coshop_adapter extends RecyclerView.Adapter<coshop_adapter.ViewHolder> {

    coshop_data[] coshop_data;
    Context context;

    public coshop_adapter(coshop_data[] coshop_data, MainActivity activity) {
        this.coshop_data = coshop_data;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.coffeeshop_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final coshop_data coshop_dataList = coshop_data[position];
        holder.textViewName.setText(coshop_dataList.getCoshopName());
        holder.textViewLocate.setText(coshop_dataList.getCoshopData());
        holder.coshopImg.setImageResource(coshop_dataList.getCoshopImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, coshop_dataList.getCoshopName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return coshop_data.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView coshopImg;
        TextView textViewName;
        TextView textViewLocate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            coshopImg =  itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            textViewLocate = itemView.findViewById(R.id.textLocation);
        }
    }

}
