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
public class facebook extends Fragment {


    public facebook() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        MainActivity.mWebView.loadUrl("https://www.facebook.com/");
        MainActivity.mWebView.setWebViewClient(new WebViewClient());
        return inflater.inflate(R.layout.fragment_facebook, container, false);
    }

}
