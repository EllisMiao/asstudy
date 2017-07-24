package com.mxh.mianshi.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mxh.mianshi.R;

/**
 * Created by mxh on 17/7/22.
 */

public class TestFragmentActivity extends FragmentActivity implements View.OnClickListener,TestFragment.TestFragmentListener{

    public static final String TAG = "TestFragmentActivity";

    //private FrameLayout content;
    private Button btn_1,btn_2;
    private TestFragment testFragment;
    private TestFragment2 testFragment2;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fragment);
        Log.i(TAG,"onCreate");
        initView();
        //setDefaultFragment();
    }

    private void initView(){
        //content = (FrameLayout)findViewById(R.id.content);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);

        viewpager = (ViewPager)findViewById(R.id.viewpager);
        viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Fragment fragment = null;
                switch (position){
                    case 0:
                        fragment = new TestFragment();

                        break;
                    case 1:
                        fragment = new TestFragment2();
                        break;
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return 2;
            }
        });
    }

    private void setDefaultFragment(){

        //testFragment = new TestFragment();
        //testFragment2 = new TestFragment2();


        //动态添加
        //FragmentManager manager = getFragmentManager();
        //FragmentTransaction transaction = manager.beginTransaction();
        //transaction.replace(R.id.content,testFragment);
        //transaction.commit();
    }


    @Override
    public void onClick(View v) {
        //FragmentManager manager = getFragmentManager();
       // FragmentTransaction transaction = manager.beginTransaction();
        switch (v.getId()){
            case R.id.btn_1:
                //transaction.replace(R.id.content,testFragment);
                //transaction.addToBackStack(null);
                //transaction.commit();
                viewpager.setCurrentItem(0);
                break;
            case R.id.btn_2:
                //transaction.replace(R.id.content,testFragment2);
                //transaction.addToBackStack(null);
               // transaction.commit();
                viewpager.setCurrentItem(1);
                break;
        }
    }
    @Override
    public void doSomething() {
        Toast.makeText(TestFragmentActivity.this,"testfragment调用了Activity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

}
