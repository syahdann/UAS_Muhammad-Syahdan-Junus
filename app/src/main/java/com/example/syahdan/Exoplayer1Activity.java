package com.example.syahdan;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.helloappssyahdan.R;

public class Exoplayer1Activity extends AppCompatActivity {
    SimpleExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exoplayer1);

        StyledPlayerView playerView = findViewById(R.id.playerView);
        player = new SimpleExoPlayer.Builder(this).build();
        playerView.setPlayer(player);

        // Mendapatkan videoInfo dari Intent
        String videoInfo = getIntent().getStringExtra("videoInfo");
        Log.d("Exoplayer1Activity", "Video Info: " + videoInfo);

        // Menggunakan getVideoUri untuk mendapatkan URI berdasarkan videoInfo
        Uri uri = getVideoUri(videoInfo);
        MediaItem mediaItem = MediaItem.fromUri(uri);

        player.setMediaItem(mediaItem);
        player.prepare();
        player.setPlayWhenReady(true);
    }

    @Override
    protected void onStop() {
        super.onStop();
        player.setPlayWhenReady(false);
        player.release();
        player = null;
    }

    private Uri getVideoUri(String videoInfo) {
        // Menggunakan videoInfo untuk mengidentifikasi video yang akan diputar
        // Misalnya, konstruksi URI dari folder assets
        return Uri.parse("asset:///"+ videoInfo +".mp4");
    }
}
