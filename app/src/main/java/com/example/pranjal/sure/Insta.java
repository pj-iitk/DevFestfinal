package com.example.pranjal.sure;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class Insta extends Fragment {


    public Insta() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MainActivity.mWebView.loadUrl("https://www.instagram.com/accounts/login/");
        MainActivity.mWebView.setWebViewClient(new WebViewClient());
        return inflater.inflate(R.layout.fragment_insta, container, false);
    }

}
