package com.aoeng.degu.ui;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

import com.aoeng.degu.R;
import com.aoeng.degu.views.CircleCanvasView;
import com.aoeng.degu.views.CircleCanvasView.CircleInfo;

public class Chapter1UI extends Activity {
	private CircleCanvasView mCircleCanvas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//装载布局
		ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.ui_chap1,null);
		mCircleCanvas = new CircleCanvasView(this);
		viewGroup.addView(mCircleCanvas,new LayoutParams(LayoutParams.FILL_PARENT,700));
		setContentView(viewGroup);
		
		
		
		//setContentView(R.layout.ui_chap1);
	}

	// 开始随机绘制圆形
	public void onClick_DrawRandomCircle(View v) {
		Random random = new Random();
		float randomX = (float) (random.nextInt(450));
		float randomY = (float) (100 + random.nextInt(700));
		float randomRadius = (float) (20 + random.nextInt(40));
		int randomColor = 0;
		// 产生 0-100 的随机数，若产生的随机数大于 50 ，则画笔颜色为蓝色
		if (random.nextInt(100) > 50) {
			randomColor = Color.BLUE;
		} else {
			if (random.nextInt(100) > 50)
				randomColor = Color.RED;
			else
				randomColor = Color.GREEN;
		}
		CircleInfo circleInfo = new CircleInfo();
		circleInfo.setX(randomX);
		circleInfo.setY(randomY);
		circleInfo.setRadius(randomRadius);
		circleInfo.setColor(randomColor);
		mCircleCanvas.mCircleInfos.add(circleInfo);
		mCircleCanvas.invalidate();
	}

	public void onClick_Clear(View v) {
		mCircleCanvas.mCircleInfos.clear();
		mCircleCanvas.invalidate();
	}

}
