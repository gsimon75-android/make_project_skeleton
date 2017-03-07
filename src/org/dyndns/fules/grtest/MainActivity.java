package org.dyndns.fules.grtest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import java.util.HashMap;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Color;

import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.ShapeDrawable;

public class MainActivity extends Activity {

    protected static final String TAG = "GRTest";
    EditText input;
    GestureView iv;

	@Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "MainActivity.onCreate() " + this);

		setContentView(R.layout.keyboard);

        input = (EditText)findViewById(R.id.input);
        iv = (GestureView)findViewById(R.id.iv);
	}

	public void drawGesture(View v) {
	}


}

// vim: set ts=4 sw=4 et:
