package tuto.fr.mvvm.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;

public class Repas {
    @NonNull
    private String NomEntree;
    @NonNull
    private String NomPlat;
    @NonNull
    private String NomDessert;

    public Repas(@NonNull String nomEntree, @NonNull String nomPlat, @NonNull String nomDessert) {
        NomEntree = nomEntree;
        NomPlat = nomPlat;
        NomDessert = nomDessert;
    }

    @NonNull
    public String getNomEntree() {
        return NomEntree;
    }

    public void setNomEntree(@NonNull String nomEntree) {
        NomEntree = nomEntree;
    }

    @NonNull
    public String getNomPlat() {
        return NomPlat;
    }

    public void setNomPlat(@NonNull String nomPlat) {
        NomPlat = nomPlat;
    }

    @NonNull
    public String getNomDessert() {
        return NomDessert;
    }

    public void setNomDessert(@NonNull String nomDessert) {
        NomDessert = nomDessert;
    }

    public boolean isPlatValid(){
        return !TextUtils.isEmpty(getNomPlat()) && getNomPlat().length() > 3;
    }
    public boolean isEntreeValid(){
        return !TextUtils.isEmpty(getNomEntree()) && getNomEntree().length() > 3;
    }
    public boolean isDessertValid(){
        return !TextUtils.isEmpty(getNomDessert()) && getNomDessert().length() > 3;
    }
    public boolean isRepasValid(){
        return isPlatValid() && isEntreeValid() && isDessertValid();
    }
}
