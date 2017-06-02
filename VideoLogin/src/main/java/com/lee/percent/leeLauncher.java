package com.lee.percent;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.lee.percent.base.baseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Administrator on 6/1 0001.
 */

public class leeLauncher extends baseActivity {
    @BindView(R.id.tv1)
    TextView mtv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laucnher);
        ButterKnife.bind(this);
        mtv.setText("一个简单的Login界面");
    }
}
