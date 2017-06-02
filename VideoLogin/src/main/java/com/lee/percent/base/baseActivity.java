package com.lee.percent.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 6/1 0001.
 * 写个基类方便扩展
 */

public class baseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void openActivity(Class<?> pClass) {
        Intent mIntent = new Intent(this, pClass);
        this.startActivity(mIntent);
    }
}
