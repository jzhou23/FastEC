package com.jhzhou.fastec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jhzhou.jh.activities.ProxyActivity;
import com.jhzhou.jh.app.App;
import com.jhzhou.jh.delegates.AppDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public AppDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
