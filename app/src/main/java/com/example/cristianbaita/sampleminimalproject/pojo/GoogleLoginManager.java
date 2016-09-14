package com.example.cristianbaita.sampleminimalproject.pojo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.cristianbaita.sampleminimalproject.activities.LoginActivity;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Rares - Desktop on 11.09.2016.
 */
public class GoogleLoginManager extends Activity {

    private SignInButton googleButton;
    private static int RC_SIGN_IN = 9001;
    private GoogleSignInAccount acct;

    public void signIn(GoogleApiClient gap) {

        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(gap);

        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleSignInResult(result);


        }
    }

    private void handleSignInResult(GoogleSignInResult result) {
        //Log.d(TAG, "handleSignInResult:" + result.isSuccess());
        if (result.isSuccess()) {
            // Signed in successfully, show authenticated UI.
            acct = result.getSignInAccount();
            System.out.println(acct.getDisplayName());
        }
    }

    public GoogleSignInAccount getAccount(){
        return acct;
    }
}
