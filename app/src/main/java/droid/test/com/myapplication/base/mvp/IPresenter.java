package droid.test.com.myapplication.base.mvp;

import android.content.Context;

import droid.test.com.myapplication.base.IUi;

/**
 * Created by admin on 2016/1/14.
 */
public interface IPresenter {
   <U extends IUi> void init(Context context, U ui);
}
