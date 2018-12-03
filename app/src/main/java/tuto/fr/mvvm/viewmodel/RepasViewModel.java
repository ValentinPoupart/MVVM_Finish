package tuto.fr.mvvm.viewmodel;

import tuto.fr.mvvm.model.Repas;

import com.android.databinding.library.baseAdapters.BR;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class RepasViewModel extends  BaseObservable {
    private Repas repas;

    private String successMessage = "Validation du repas";
    private String entreeErrorMessage = "Une entrée vous ouvrirez l'appétit ..";
    private String platErrorMessage = "Vous n'avez déjà plus faim ?";
    private String dessertErrorMessage = "Pourquoi ne pas prendre un dessert ?";

    @Bindable
    public String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public RepasViewModel() {
        repas = new Repas("", "", "");
    }

    public void afterEntreeTextChanged(CharSequence s) {
        repas.setNomEntree(s.toString());
    }

    public void afterPlatTextChanged(CharSequence s) {
        repas.setNomPlat(s.toString());
    }

    public void afterDessertTextChanged(CharSequence s) {
        repas.setNomDessert(s.toString());
    }

    public void onValidationClicked() {
        if (repas.isRepasValid())
            setToastMessage(successMessage);
        else if (!repas.isEntreeValid())
            setToastMessage(entreeErrorMessage);
        else if (!repas.isPlatValid())
            setToastMessage(platErrorMessage);
        else if (!repas.isDessertValid())
            setToastMessage(dessertErrorMessage);
    }
}
