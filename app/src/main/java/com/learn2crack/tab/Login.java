package com.learn2crack.tab;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //creating the view from the login_frag xml layout file
        View login = inflater.inflate(R.layout.login_frag, container, false);

        //setting text to Or, testing purposes
        TextView tv = (TextView) login.findViewById(R.id.or);
        tv.setText(" Or");

        //setting password and username fonts to default
        //password font
        EditText pw = (EditText) login.findViewById(R.id.password);
        pw.setTypeface(Typeface.DEFAULT);
        pw.setTransformationMethod(new PasswordTransformationMethod());
        //username font
        EditText un = (EditText) login.findViewById(R.id.username);
        un.setTypeface(Typeface.DEFAULT);

        return login;
    }

}
