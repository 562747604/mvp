package droid.test.com.myapplication.base.mvp;

import android.os.Bundle;

import droid.test.com.myapplication.base.BaseActivity;
import droid.test.com.myapplication.base.IUi;

/**
 * Created by admin on 2016/1/14.
 */
public abstract class BaseMVPActivity<P extends IPresenter> extends BaseActivity{
    private P mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mPresenter = onCreatePresenter();
        getPresenter().init(BaseMVPActivity.this, getUI());
        onCreateExecute(savedInstanceState);
    }
    protected abstract  IUi getUI();
    protected  abstract P onCreatePresenter();
    protected  abstract  void onCreateExecute(Bundle bundle);
    protected  P getPresenter(){
        return mPresenter;
    }
}
