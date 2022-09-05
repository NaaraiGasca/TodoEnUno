package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Wwebview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wwebview);

        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        myWebView.loadUrl("https://developer.android.com/guide/webapps/webview?hl=es-419");

    }
}