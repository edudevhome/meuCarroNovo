package com.devhome.eduardobastos.bastosconsultoria.renault;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RenaultViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RenaultViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Toque no veículo para acessar o Manual do Proprietário");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
