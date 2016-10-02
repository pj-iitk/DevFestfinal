package com.example.pranjal.sure;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by PRANJAL on 10/2/2016.
 */
public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL ="http://niskarsh.netau.net/Register.php";
    private Map<String, String> params;

    public  RegisterRequest(String name, String Password,Response.Listener<String> listener){
        super(Method.POST,  REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name",name);
        params.put("Password",Password+"");
    }

    public Map<String, String> getParams() {
        return params;
    }
}
