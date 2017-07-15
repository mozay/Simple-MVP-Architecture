package com.mozay_mvp.View;

/**
 * Created by MEHMET on 15.07.2017.
 */

public interface LoginView {

    void showLoading();
    void hideLoading();
    void showError(String msg);
    void navigateToHome();

}
