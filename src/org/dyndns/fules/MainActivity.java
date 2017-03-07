package org.dyndns.fules;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    protected static final String TAG = "MakeProjectSkel";
    //EditText input;

	@Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "MainActivity.onCreate() " + this);

		setContentView(R.layout.main);

        //input = (EditText)findViewById(R.id.input);

	}

}

// vim: set ts=4 sw=4 et:
