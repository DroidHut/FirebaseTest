package com.example.shivani.firebasetest;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


public class MyFirebaseIdService extends FirebaseInstanceIdService {
    private static final String REG_TOKEN= "REG_TOKEN";
    @Override
    public void onTokenRefresh() {
      // String newToken= FirebaseInstanceId.getInstance().getToken();
        String newToken=getResources().getString(R.string.token);
        //Toast.makeText(getApplicationContext(),newToken,Toast.LENGTH_SHORT).show();
                 Log.d(REG_TOKEN,newToken);
         
    }
}
