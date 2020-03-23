package com.example.dailyschooldiary.ui.registerrequest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.dailyschooldiary.R;
import com.example.dailyschooldiary.RegisterRequestsFragmentStudents;
import com.example.dailyschooldiary.RegisterRequestsFragmentTeachers;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RegisterRequestsFragment extends Fragment {

    private RegisterRequestsViewModel registerRequestsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_register_requests, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        registerRequestsViewModel = ViewModelProviders.of(this).get(RegisterRequestsViewModel.class);
//        registerRequestsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        BottomNavigationView bottomNavigationView = root.findViewById(R.id.register_requests_bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.register_requests_fragment_child, new RegisterRequestsFragmentTeachers()).commit();

        return root;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.nav_student:
                            selectedFragment = new RegisterRequestsFragmentStudents();
                            break;
                        case R.id.nav_teachers:
                            selectedFragment = new RegisterRequestsFragmentTeachers();
                            break;
                    }

                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.register_requests_fragment_child,
                            selectedFragment).commit();
                    return true;
                }
            };
}