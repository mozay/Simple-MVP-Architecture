package com.mozay_mvp.Presenter;

import com.mozay_mvp.Model.LoginModel;
import com.mozay_mvp.View.LoginView;

/**
 * Created by MEHMET on 15.07.2017.
 */

public class LoginPresenterImpl implements LoginPresenter {

    private final LoginView view;
    private final LoginModel model;


    public LoginPresenterImpl(LoginView view, LoginModel model)
    {
        this.view = view;
        this.model = model;
    }


    @Override
    public void login(String user, String pass) {

          view.showLoading();
          model.doLogin(user, pass, new LoginResultListener() {
              @Override
              public void onSuccess() {
                  view.navigateToHome();
              }

              @Override
              public void onFail() {
                  view.showError("Invalid Username or Password");
              }
          });


    }
}
