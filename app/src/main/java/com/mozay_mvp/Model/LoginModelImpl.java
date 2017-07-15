package com.mozay_mvp.Model;

import android.os.Handler;

import com.mozay_mvp.Presenter.LoginResultListener;

/**
 * Created by MEHMET on 15.07.2017.
 */

public class LoginModelImpl implements LoginModel{

    public static String USER = "admin";
    public static String PASS = "12345";

    @Override
    public void doLogin(final String user,final String pass,final LoginResultListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (user.equals(USER) && pass.equals(PASS)) {
                    listener.onSuccess();
                } else {
                    listener.onFail();
                }
            }
        }, 1500);

    }
}
