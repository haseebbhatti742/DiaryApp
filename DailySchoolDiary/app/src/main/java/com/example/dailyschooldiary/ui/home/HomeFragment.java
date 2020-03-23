package com.example.dailyschooldiary.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailyschooldiary.ClassesRecyclerViewAdapter;
import com.example.dailyschooldiary.ClassesRecyclerViewCard;
import com.example.dailyschooldiary.R;
import com.example.dailyschooldiary.RegisterRequestsTeachersRecyclerAdapter;
import com.example.dailyschooldiary.RegisterRequestsTeachersRecyclerviewCard;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    //private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        ArrayList<ClassesRecyclerViewCard> cardArrayList = new ArrayList<>();
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover1,"Class 7th","15 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover2,"Class 8th","22 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover3,"Class 9th","20 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover4,"Class 10th","35 Students"));


        recyclerView = view.findViewById(R.id.classes_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        adapter = new ClassesRecyclerViewAdapter(cardArrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }
}