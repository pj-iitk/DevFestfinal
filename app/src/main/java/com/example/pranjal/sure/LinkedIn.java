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
public class LinkedIn extends Fragment {


    public LinkedIn() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MainActivity.mWebView.loadUrl("https://www.linkedin.com/uas/login");
        MainActivity.mWebView.setWebViewClient(new WebViewClient());
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_linked_in, container, false);
    }

}
