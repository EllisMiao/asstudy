package com.mxh.mianshi.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.mxh.mianshi.R;

/**
 * Created by mxh on 17/7/22.
 */

public class BFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b,null);
        Button btn = (Button)view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"我是BFragment",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);

    }
}
