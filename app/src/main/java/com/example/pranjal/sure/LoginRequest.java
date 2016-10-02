package com.example.pranjal.sure;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by PRANJAL on 10/2/2016.
 */
public class LoginRequest extends StringRequest{
    private static final String LOGIN_REQUEST_URL ="http://niskarsh.netau.net/login.php";
    private Map<String, String> params;

    public  LoginRequest(String name, String Password,Response.Listener<String> listener){
        super(Request.Method.POST,  LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name",name);
        params.put("Password",Password);
    }

    public Map<String, String> getParams() {
        return params;
    }

}
