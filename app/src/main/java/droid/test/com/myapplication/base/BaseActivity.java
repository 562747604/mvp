package droid.test.com.myapplication.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by admin on 2016/1/14.
 */
public abstract class BaseActivity extends FragmentActivity implements IUi{
    private boolean isDestory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isDestory = false;
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        isDestory = true;
        super.onDestroy();
    }

    @Override
    public boolean isDestory() {
        return isDestory;
    }
}
