package com.forbit.searchview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    List<Model> modelList;
    LayoutInflater inflater;

    public Adapter(Context context, List<Model> modelList) {
        this.context = context;
        this.modelList = modelList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.title.setText(model.getTitle());
        holder.image.setImageResource(model.getImage());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.image);
        }
    }
}
