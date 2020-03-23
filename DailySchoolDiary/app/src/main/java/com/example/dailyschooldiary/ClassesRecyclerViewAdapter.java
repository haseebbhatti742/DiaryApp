package com.example.dailyschooldiary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ClassesRecyclerViewAdapter extends RecyclerView.Adapter<ClassesRecyclerViewAdapter.Holder> {
    ArrayList<ClassesRecyclerViewCard> arrayList;

    public static class Holder extends RecyclerView.ViewHolder{
        public ImageView circleImageView;
        public TextView textViewName;
        public TextView textViewClass;

        public Holder(View itemView){
            super(itemView);
            circleImageView = itemView.findViewById(R.id.classes_recycler_view_image);
            textViewName = itemView.findViewById(R.id.classes_recycler_view_class);
            textViewClass = itemView.findViewById(R.id.classes_recycler_view_students);
        }
    }

    @NonNull
    @Override
    public ClassesRecyclerViewAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.classes_recycler_view_card, parent, false);
        ClassesRecyclerViewAdapter.Holder holder = new ClassesRecyclerViewAdapter.Holder(v);
        return holder;
    }

    public ClassesRecyclerViewAdapter(ArrayList<ClassesRecyclerViewCard> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public void onBindViewHolder(@NonNull ClassesRecyclerViewAdapter.Holder holder, int position) {
        ClassesRecyclerViewCard card = this.arrayList.get(position);

        holder.circleImageView.setImageResource(card.getImageResource());
        holder.textViewName.setText(card.getTextName());
        holder.textViewClass.setText(card.getTextClass());
    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }
}
