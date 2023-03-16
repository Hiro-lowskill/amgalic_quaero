package com.example.amgalic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Panorama_next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panorama_next);
        WebView webView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("https://www.google.ru/maps/@60.7689934,131.8117523,3a,79.6y,144.07h,69.5t/data=!3m8!1e1!3m6!1sAF1QipPWoLFrgzebJCSUfpc9jMd3FgZWIDVuLJ1X80-g!2e10!3e11!6shttps:%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipPWoLFrgzebJCSUfpc9jMd3FgZWIDVuLJ1X80-g%3Dw203-h100-k-no-pi-0-ya193.37897-ro0-fo100!7i8192!8i4096");
    }
}