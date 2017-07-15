package com.mozay_mvp.Model;

import com.mozay_mvp.Presenter.LoginResultListener;

/**
 * Created by MEHMET on 15.07.2017.
 */

public interface LoginModel {


    void doLogin(String user, String pass, LoginResultListener listener);


}
