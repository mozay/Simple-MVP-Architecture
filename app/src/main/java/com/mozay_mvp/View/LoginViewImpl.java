package com.mozay_mvp.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mozay_mvp.Model.LoginModelImpl;
import com.mozay_mvp.Presenter.LoginPresenter;
import com.mozay_mvp.Presenter.LoginPresenterImpl;
import com.mozay_mvp.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

// Base Logic : 1. Process view to presenter when login btn click.
//              2. Presenter verify data on model
//              3. Update view with Result from model

public class LoginViewImpl extends AppCompatActivity implements LoginView {

    @Bind(R.id.user)
    protected EditText user;
    @Bind(R.id.pass)
    protected EditText pass;
    @Bind(R.id.login)
    protected Button login;
    @Bind(R.id.progress)
    protected ProgressBar progress;

    protected LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view_impl);
        ButterKnife.bind(this);

        presenter = new LoginPresenterImpl(this,new LoginModelImpl());


    }

    @Override
    public void showLoading() {
        progress.setVisibility(View.VISIBLE);
        login.setEnabled(false);
    }

    @Override
    public void hideLoading() {
        progress.setVisibility(View.GONE);
        login.setEnabled(true);
    }

    @Override
    public void showError(String msg) {
        hideLoading();
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, HomeViewImpl.class));
        finish();
    }


    @OnClick(R.id.login)
    public void loginClick(View view) {
        String userVal = user.getText().toString().trim();
        String passVal = pass.getText().toString().trim();
        presenter.login(userVal, passVal);
    }

}
