package com.android.qf.project.nuomi.model.main;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.android.qf.project.nuomi.R;
import com.android.qf.project.nuomi.abstracts.AbstractFullScreenActivity;

public class WelcomeActivity extends AbstractFullScreenActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main_welcome);
		
		// �ж��Ƿ��һ�ν��룬��������������棬�����������ҳ
		SharedPreferences preferences = getSharedPreferences("isFirst", 0);
		final boolean isFirst = preferences.getBoolean("isFirst", true);
		final SharedPreferences.Editor editor = preferences.edit();
		
		// ����ʱִ������
		new CountDownTimer(1000, 3000) {
			@Override
			public void onTick(long millisUntilFinished) {
				
			}
			
			@Override
			public void onFinish() {
				if (isFirst) {
					startActivity(new Intent(WelcomeActivity.this, GuidActivity.class));
					editor.putBoolean("isFirst", false);
					editor.commit();
				} else {
					startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
				}
				
				finish();
			}
		}.start();
	}
}
