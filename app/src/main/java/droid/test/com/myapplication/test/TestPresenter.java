package droid.test.com.myapplication.test;

import droid.test.com.myapplication.base.mvp.BasePresenter;

/**
 * Created by admin on 2016/1/14.
 */
public class TestPresenter extends BasePresenter<ITestUi> {
    public void setText(String text){
        if(getUi().isDestory()){
            getUi().show("true");
        }else {
            getUi().show("false");
        }
    };

}
