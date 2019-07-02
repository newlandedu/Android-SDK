package nle.com.example.sdk_demo;


import android.app.Activity;
import android.os.Bundle;

/**
 * Created by marco on 2017/8/21.
 * 基类activity
 */

public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onFirst(savedInstanceState);
        setContentView(setLayoutRes());
        setTitle("NLECloud SDK DEMO - " + setTitle());
        instantiateView();
        initViewData();
        registerListener();

    }


    protected void onFirst(Bundle saveInstanceState) {

    }

    protected abstract int setLayoutRes();

    protected abstract String setTitle();

    protected void instantiateView() {
    }

    protected void initViewData() {

    }

    protected void registerListener() {
    }



}
