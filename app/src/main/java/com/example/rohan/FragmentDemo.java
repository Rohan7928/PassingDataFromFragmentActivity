package com.example.rohan;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentDemo extends Fragment {
    MainActivity listener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layoutInflater=inflater.inflate(R.layout.fragment,container,false);
        return layoutInflater;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final EditText editText=view.findViewById(R.id.e_txt);
        Button button=view.findViewById(R.id.btn_click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           listener.setmeassage(editText.getText().toString());
            }
        });
    }



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listener=(MainActivity)activity;
    }


}
