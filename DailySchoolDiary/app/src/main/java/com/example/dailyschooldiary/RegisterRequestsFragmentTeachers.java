package com.example.dailyschooldiary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RegisterRequestsFragmentTeachers extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.register_requests_fragment_techers, container, false);

        ArrayList<RegisterRequestsTeachersRecyclerviewCard> cardArrayList = new ArrayList<>();
        cardArrayList.add(new RegisterRequestsTeachersRecyclerviewCard(R.drawable.dp1,"Haseeb Bhatti","Class 9th"));
        cardArrayList.add(new RegisterRequestsTeachersRecyclerviewCard(R.drawable.bg1,"Hamza Asif","Class 10th"));
        cardArrayList.add(new RegisterRequestsTeachersRecyclerviewCard(R.drawable.bg2,"Rabia Rana","Class 9th"));
        cardArrayList.add(new RegisterRequestsTeachersRecyclerviewCard(R.drawable.bg3,"Sana Saleem","Class 7th"));


        recyclerView = view.findViewById(R.id.register_requests_teachers_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new RegisterRequestsTeachersRecyclerAdapter(cardArrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
