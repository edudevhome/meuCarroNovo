package com.devhome.eduardobastos.bastosconsultoria.nissan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NissanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NissanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Toque no veículo para acessar o Manual do Proprietário");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
