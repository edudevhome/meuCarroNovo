package com.devhome.eduardobastos.bastosconsultoria.peugeot;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PeugeotViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PeugeotViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Toque no veículo para acessar o Manual do Proprietário");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
