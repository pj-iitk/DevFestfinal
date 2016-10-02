package com.example.pranjal.sure;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import com.example.pranjal.sure.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Twitter extends Fragment {


    public Twitter() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MainActivity.mWebView.loadUrl("https://www.twitter.com/");
        MainActivity.mWebView.setWebViewClient(new WebViewClient());
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_twitter2, container, false);
    }

}
