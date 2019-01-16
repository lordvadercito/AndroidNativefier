package com.agustinducca.androidnativefier;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView mWebView;

    SwipeRefreshLayout swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.agustinducca.androidnativefier.R.layout.activity_main);


        swipe = (SwipeRefreshLayout) findViewById(com.agustinducca.androidnativefier.R.id.swipe);
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            public void onRefresh() {
                LoadWeb();
            }
        });

        LoadWeb();

    }



    public void LoadWeb() {
        mWebView = (WebView) findViewById(com.agustinducca.androidnativefier.R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setAppCacheEnabled(false);
        //TODO: Authentication
        mWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {
                handler.proceed("User", "pass");
            }
        });
        //TODO: Your app URL
        mWebView.loadUrl("https:agustinducca.com");
        swipe.setRefreshing(true);
        mWebView.setWebViewClient(new WebViewClient() {

            public void onReveivedError(WebView view, int errorCode, String description, String failingUrl) {
                mWebView.loadUrl("file://android_asset/error.html");
            }

            public void onPageFinished(WebView view, String url) {
                //Oculta el refresh gif cuando termina la carga de la pagina
                swipe.setRefreshing(false);
            }

        });

    }

    @Override
    public void onBackPressed(){

    }
}
