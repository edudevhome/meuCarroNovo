package com.devhome.eduardobastos.bastosconsultoria.volkswagen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VolkswagenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VolkswagenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Toque no veículo para acessar o Manual do Proprietário");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
