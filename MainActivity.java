package com.example.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class MainActivity extends Activity {
    WebSettings settings;
    WebView webView;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.webView = (WebView) findViewById(R.id.webView);
        this.settings = this.webView.getSettings();
        this.settings.setJavaScriptEnabled(true);
        this.settings.setDomStorageEnabled(true);
        this.webView.loadUrl("file:///android_asset/run.html");
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        moveTaskToBack(true);
    }
}
