package droid.test.com.myapplication.base.mvp;

import android.content.Context;

import droid.test.com.myapplication.base.IUi;

/**
 * Created by admin on 2016/1/14.
 */
public class BasePresenter<T extends IUi> implements IPresenter{
    private Context context;
    private T mUi;
    @Override
    public <U extends IUi> void init(Context context, U ui) {
        this.context = context;
        this.mUi = (T)ui;
    }
    protected final T getUi(){
        return mUi;
    }
}
