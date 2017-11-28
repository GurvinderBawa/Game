package com.bawa.mvpdemo.model;

import android.content.Context;
import android.widget.Toast;

import com.bawa.mvpdemo.presenter.Singup;

/**
 * Created by hp on 29-11-2017.
 */

public class SignupPresentImpl implements Singup {

    @Override
    public void signin(Context context) {
        Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();

    }

}
