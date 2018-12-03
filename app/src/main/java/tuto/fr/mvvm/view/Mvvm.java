package tuto.fr.mvvm.view;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import tuto.fr.mvvm.R;
import tuto.fr.mvvm.viewmodel.RepasViewModel;
import tuto.fr.mvvm.databinding.ActivityMvvmBinding;

public class Mvvm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMvvmBinding activityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        activityMainBinding.setViewModel(new RepasViewModel());
        activityMainBinding.executePendingBindings();

    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
