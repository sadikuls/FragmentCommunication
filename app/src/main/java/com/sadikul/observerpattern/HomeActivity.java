package com.sadikul.observerpattern;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import com.sadikul.observerpattern.CustomObserver.CustomObservable;
import com.sadikul.observerpattern.Fragments.FragThree;

public class HomeActivity extends AppCompatActivity implements FragThree.OnFragmentInteractionListener {


    EditText inputEdittext = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
