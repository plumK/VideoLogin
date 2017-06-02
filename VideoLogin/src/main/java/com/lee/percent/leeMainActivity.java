package com.lee.percent;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lee.percent.base.baseActivity;

import java.net.URI;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class leeMainActivity extends baseActivity {

    @BindView(R.id.lee_video_view)
    leevideoview mVideoView;
    @BindView(R.id.lee_bt_button)
    Button mbutton;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mVideoView.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.classroom));
        mVideoView.start();

        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mVideoView.start();
            }
        });

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mVideoView.isPlaying()) {
                    mVideoView.stopPlayback();
                    mVideoView = null;
                }
                openActivity(leeLauncher.class);
                leeMainActivity.this.finish();
            }
        });
    }
}
