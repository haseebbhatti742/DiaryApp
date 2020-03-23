package com.example.dailyschooldiary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RegisterRequestsTeachersRecyclerAdapter extends RecyclerView.Adapter<RegisterRequestsTeachersRecyclerAdapter.Holder> {
    ArrayList<RegisterRequestsTeachersRecyclerviewCard> arrayList;

    public static class Holder extends RecyclerView.ViewHolder{
        public CircleImageView circleImageView;
        public TextView textViewName;
        public TextView textViewClass;

        public Holder(View itemView){
            super(itemView);
            circleImageView = itemView.findViewById(R.id.register_requests_teachers_recycler_view_image);
            textViewName = itemView.findViewById(R.id.register_requests_teachers_recycler_view_name);
            textViewClass = itemView.findViewById(R.id.register_requests_teachers_recycler_view_class);
        }
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.register_requests_teachers_recycler_view_card, parent, false);
        Holder holder = new Holder(v);
        return holder;
    }

    public RegisterRequestsTeachersRecyclerAdapter(ArrayList<RegisterRequestsTeachersRecyclerviewCard> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        RegisterRequestsTeachersRecyclerviewCard card = this.arrayList.get(position);

        holder.circleImageView.setImageResource(card.getImageResource());
        holder.textViewName.setText(card.getTextName());
        holder.textViewClass.setText(card.getTextClass());
    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }
}
