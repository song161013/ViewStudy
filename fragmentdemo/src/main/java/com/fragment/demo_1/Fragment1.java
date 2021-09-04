package com.fragment.demo_1;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.fragment.demo.R;

/**
 * @Description:
 * @Author: sf
 * @CreateDate: 21-8-27 下午8:56
 * @Version: 1.0.0
 */
public class Fragment1 extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getActivity() == null) {
            Log.e("Tag", "getactivity is null");
        } else {
            TextView tv = getActivity().findViewById(R.id.tv_fragment_1);
            Log.e("Tag", "getactivity is not null, tv=" + tv);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }
}
