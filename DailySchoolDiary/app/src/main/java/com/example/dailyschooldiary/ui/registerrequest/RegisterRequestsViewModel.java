package com.example.dailyschooldiary.ui.registerrequest;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegisterRequestsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RegisterRequestsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is register requests fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}