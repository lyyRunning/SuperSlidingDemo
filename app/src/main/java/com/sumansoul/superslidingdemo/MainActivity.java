package com.sumansoul.superslidingdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.king.view.superslidingpanelayout.SuperSlidingPaneLayout;

public class MainActivity extends Activity {
    private SuperSlidingPaneLayout sspl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sspl = findViewById(R.id.sspl);
        Button tvMode = findViewById(R.id.tvMode);
        ImageView ivLeft = findViewById(R.id.ivLeft);
        //设置颜色
        sspl.setSliderFadeColor(getResources().getColor(R.color.black_transparent));
        sspl.setCoveredFadeColor(getResources().getColor(R.color.transparent));

        //设置侧边距离
        View menu = findViewById(R.id.menu);
        ViewGroup.LayoutParams params = menu.getLayoutParams();
        //自己设置侧边大小
        params.width = (int) (getResources().getDisplayMetrics().widthPixels * 0.65f);
        menu.setLayoutParams(params);

        /**
         * 选择模式
         */
        tvMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//             DEFAULT(0),默认
//             TRANSLATION(1),平移
//             SCALE_MENU(2),缩放菜单
//             SCALE_PANEL(3),缩放面单
//             SCALE_BOTH(4),缩放两个
//             TRANSLATION_SCALE(5);平移加缩放
                //模式
                SuperSlidingPaneLayout.Mode mode = sspl.getMode();
                Log.d("LUO","模式====="+mode.name());
                //设置模式
                sspl.setMode(SuperSlidingPaneLayout.Mode.TRANSLATION_SCALE);
            }
        });


        sspl.setPanelSlideListener(new SuperSlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
                //侧滑时操作
            }

            @Override
            public void onPanelOpened(View panel) {
                //打开时操作
            }

            @Override
            public void onPanelClosed(View panel) {
                //关闭时操作
            }
        });

    }

    public void OnClick(View v){
        switch (v.getId()){
            case R.id.ivLeft:
                sspl.openPane();
                break;
            case R.id.ivRight:
                Toast.makeText(MainActivity.this,"点击logo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ivLogo:
                Toast.makeText(MainActivity.this,"点击logo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvUser:
                Toast.makeText(MainActivity.this,"点击logo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvCollect:
                Toast.makeText(MainActivity.this,"点击logo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvSystem:
                Toast.makeText(MainActivity.this,"点击logo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvProject:
                Toast.makeText(MainActivity.this,"点击logo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvNavi:
                Toast.makeText(MainActivity.this,"点击logo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvAbout:
                Toast.makeText(MainActivity.this,"点击logo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvLogout:
                Toast.makeText(MainActivity.this,"点击logo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvVersion:
                Toast.makeText(MainActivity.this,"点击版本",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

}