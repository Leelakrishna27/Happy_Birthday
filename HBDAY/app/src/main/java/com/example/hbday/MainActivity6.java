package com.example.hbday;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        final ViewPager2 videosViewPager= findViewById(R.id.videosViewPager);

        ArrayList<VideoItem> videoItems=new ArrayList<>();

        VideoItem videoItemCelebration=new VideoItem();

        videoItemCelebration.VideoURL ="android.resource://"+getPackageName()+"/"+R.raw.jun8v;
        videoItemCelebration.videoTitle = "#RisingStar";
        videoItemCelebration.videoDescription= "karthi karthik";
        videoItems.add(videoItemCelebration);

        VideoItem videoItemParty=new VideoItem();
        videoItemParty.VideoURL="android.resource://"+getPackageName()+"/"+R.raw.may8v;
        videoItemParty.videoTitle="#Leela Bhai acting";
        videoItemParty.videoDescription="Manaki bar time aindi endukee sodhi";
        videoItems.add(videoItemParty);

        VideoItem videoItemNature= new VideoItem();
        videoItemNature.VideoURL="android.resource://"+getPackageName()+"/"+R.raw.jun8v1;
        videoItemNature.videoTitle="#Dancing star";
        videoItemNature.videoDescription="Tuluk tuluk tuk tarara song dance video";
        videoItems.add(videoItemNature);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));
    }

}