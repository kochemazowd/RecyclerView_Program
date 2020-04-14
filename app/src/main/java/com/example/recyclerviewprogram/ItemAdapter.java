package com.example.recyclerviewprogram;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public final class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context context;

    public ItemAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int index) {
        return new RecyclerView.ViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.items, parent, false)
        ) {};
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int index) {
        TextView name = holder.itemView.findViewById(R.id.name_items);
        TextView address = holder.itemView.findViewById(R.id.address_items);
        TextView age = holder.itemView.findViewById(R.id.age_items);
        TextView ind = holder.itemView.findViewById(R.id.index_item);
        Item item = Users.getUsers().get(index);
        name.setText(item.getName());
        address.setText(item.getAddress());
        age.setText(item.getAge());
        ind.setText("" + index);
    }

    @Override
    public int getItemCount() {
        return Users.getUsers().size();
    }

}