package com.devhome.eduardobastos.bastosconsultoria.ford;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorkViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WorkViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Toque no veículo para acessar o Manual do Proprietário");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
