package com.example.mvvm_architecture;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModulePersonne extends ViewModel {
    MutableLiveData<String> personNameLiveData = new MutableLiveData<>();

    public Pesonne getPersonne() {
        return new Pesonne("douirek",20,1.80);
    }
    public void getPersonneInfo(){
        personNameLiveData.setValue(getPersonne().getName()+ "\n" + getPersonne().getAge()+ "\n"+getPersonne().getTaille());
    }
}
