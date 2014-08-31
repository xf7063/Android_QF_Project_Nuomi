package com.android.qf.project.nuomi.model.main;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

import com.android.qf.project.nuomi.R;
import com.android.qf.project.nuomi.abstracts.AbstractFullScreenActivity;

/**
 * 引导界面
 * @author Lusifer
 *
 */
public class GuidActivity extends AbstractFullScreenActivity implements OnClickListener {
	private ViewPager vpGuid;
	private int[] guids = new int[] {R.drawable.guide_1, R.drawable.guide_2, R.drawable.guide_3, R.drawable.guide_4};
	private List<ImageView> imgs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_guid);
		
		imgs = new ArrayList<ImageView>();
		for (int i = 0 ; i < guids.length ; i++) {
			ImageView img = new ImageView(this);
			img.setImageResource(guids[i]);
			img.setScaleType(ScaleType.CENTER);
			if (i == guids.length - 1) {
				img.setOnClickListener(this);
			}
			imgs.add(img);
		}
		
		vpGuid = (ViewPager) findViewById(R.id.vp_guid);
		vpGuid.setAdapter(adapter);
	}
	
	private PagerAdapter adapter = new PagerAdapter() {
		@Override
		public boolean isViewFromObject(View view, Object obj) {
			return view == obj;
		}
		
		@Override
		public int getCount() {
			return imgs.size();
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			container.addView(imgs.get(position));
			return imgs.get(position);
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView(imgs.get(position));
		}
		
	};

	@Override
	public void onClick(View v) {
		startActivity(new Intent(this, MainActivity.class));
		finish();
	}
	
}
