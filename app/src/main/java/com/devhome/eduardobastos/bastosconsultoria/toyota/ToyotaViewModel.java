package com.devhome.eduardobastos.bastosconsultoria.toyota;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToyotaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ToyotaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Toque no veículo para acessar o Manual do Proprietário");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
