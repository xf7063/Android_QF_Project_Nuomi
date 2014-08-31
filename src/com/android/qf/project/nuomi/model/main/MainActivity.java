package com.android.qf.project.nuomi.model.main;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.qf.project.nuomi.R;
import com.android.qf.project.nuomi.abstracts.AbstractNoDisplayActivity;

public class MainActivity extends AbstractNoDisplayActivity implements OnClickListener {
	private int[] menus = new int[] {R.id.menu_group, R.id.menu_near, R.id.menu_mine, R.id.menu_more};
	private int[] iconsNormal = new int[] {R.drawable.tab_ic_home_normal, R.drawable.tab_ic_nearby_normal, R.drawable.tab_ic_mine_normal, R.drawable.tab_ic_more_normal};
	private int[] iconsHigh = new int[] {R.drawable.tab_ic_home_highlight, R.drawable.tab_ic_nearby_highlight, R.drawable.tab_ic_mine_highlight, R.drawable.tab_ic_more_highlight};
	private int[] titles = new int[] {R.string.group, R.string.near, R.string.mine, R.string.more};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.main_bottom, menu);
    	
    	int itemCount = menu.size();
    	MenuItem item = null;
    	View view = null;
    	ImageView imgIcon = null;
    	TextView txTitle = null;
    	
    	for (int i = 0 ; i < itemCount; i++) {
    		item = menu.getItem(i);
    		view = item.getActionView();
    		view.setId(i);
    		imgIcon = (ImageView) view.findViewById(R.id.img_icon);
    		txTitle = (TextView) view.findViewById(R.id.tx_title);
    		
    		txTitle.setText(titles[i]);
    		
    		view.setTag(R.id.img_icon, imgIcon);
    		view.setTag(R.id.tx_title, txTitle);
    		view.setOnClickListener(this);
    	}
    	
    	return true;
    }

	@Override
	public void onClick(View v) {
//		ImageView imgIcon = (ImageView) v.getTag(R.id.img_icon);
//		TextView txTitle = (TextView) v.getTag(R.id.tx_title);
//		txTitle.setTextColor(getResources().getColor(R.color.Text_7849FF));
		
		switch (v.getId()) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
	}

}
