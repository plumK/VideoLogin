package com.lee.percent;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * Created by Administrator on 6/1 0001.
 */

public class leevideoview extends VideoView {
    public leevideoview(Context context) {
        super(context);
    }

    public leevideoview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public leevideoview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = getDefaultSize(0, widthMeasureSpec);
        int height = getDefaultSize(0, heightMeasureSpec);
        setMeasuredDimension(width, height);
    }
    
}
