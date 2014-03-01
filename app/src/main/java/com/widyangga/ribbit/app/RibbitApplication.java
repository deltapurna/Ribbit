package com.widyangga.ribbit.app;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by delta on 3/1/14.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "EvKNjdR1TFJaygeSjfErXh6WQmh58qWrXKa7yynp", "WEZBIsGGmoh7D0FS1ffMd7VnovTsMe9Qys4Yi9EJ");
    }
}
