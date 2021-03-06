package com.aoeng.degu.receiver;

import com.aoeng.degu.utils.ViewUtils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScreenOnOffReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		if (Intent.ACTION_SCREEN_ON.equals(intent.getAction())) {
			// 屏幕亮
			InCallReceiver.showToast(context, "屏幕亮");
			ViewUtils.log(context.getPackageName(), "屏幕亮");
		} else if (Intent.ACTION_SCREEN_OFF.equals(intent.getAction())) {
			InCallReceiver.showToast(context, "屏幕暗");
			ViewUtils.log(context.getPackageName(), "屏幕暗");
		}
	}

}
