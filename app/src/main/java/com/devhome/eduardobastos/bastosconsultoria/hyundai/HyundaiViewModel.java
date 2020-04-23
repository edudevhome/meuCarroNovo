package com.devhome.eduardobastos.bastosconsultoria.hyundai;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HyundaiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HyundaiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Toque no veículo para acessar o Manual do Proprietário");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
