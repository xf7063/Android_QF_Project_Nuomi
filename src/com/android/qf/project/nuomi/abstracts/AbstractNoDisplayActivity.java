package com.android.qf.project.nuomi.abstracts;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public abstract class AbstractNoDisplayActivity extends Activity {
	protected ActionBar actionBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setDisplayShowHomeEnabled(true);
		actionBar.setDisplayShowTitleEnabled(false);
	}
}
