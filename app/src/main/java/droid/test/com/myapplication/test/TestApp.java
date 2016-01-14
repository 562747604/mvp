package droid.test.com.myapplication.test;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import droid.test.com.myapplication.R;
import droid.test.com.myapplication.base.IUi;
import droid.test.com.myapplication.base.mvp.BaseMVPActivity;

/**
 * Created by admin on 2016/1/14.
 */
public class TestApp extends BaseMVPActivity<TestPresenter> implements ITestUi {
    @Override
    protected IUi getUI() {
        return this;
    }

    @Override
    protected TestPresenter onCreatePresenter() {
        return new TestPresenter();
    }
private TextView mTvName;
    @Override
    protected void onCreateExecute(Bundle bundle) {
        setContentView(R.layout.activity_test);
        mTvName = (TextView)findViewById(R.id.tvName);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().setText("成功了，哈啊");
            }
        });
    }

    @Override
    public void show(String text) {
        if(text == null){
            return;
        }

        mTvName.setText(text);
    }
}
