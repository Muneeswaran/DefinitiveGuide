package com.aoeng.degu.ui.uis;

import com.aoeng.degu.utils.ViewUtils;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;

public class Action2UI extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		String data = getIntent().getStringExtra("data");
		if (!TextUtils.isEmpty(data)) {
			ViewUtils.toast(this, "参数值是" + data, true);
		}

	}

}
