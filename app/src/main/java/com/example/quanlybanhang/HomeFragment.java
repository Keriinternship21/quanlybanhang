package com.example.quanlybanhang;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewFragment;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import java.time.Instant;

public class HomeFragment extends Fragment {
    public HomeFragment(){
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home ,container, false);
        ImageButton QLNhomKH = (ImageButton)view.findViewById(R.id.QLnhomKH);
        ImageButton QLyKH = (ImageButton)view.findViewById(R.id.QLyKhachHang);
        //webview Quản lý nhóm khách hàng
        QLNhomKH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogQLNKHFragment dialogQLNKHFragment = new DialogQLNKHFragment();
                dialogQLNKHFragment.show(getFragmentManager(),"example");
            }
        });
        //webview Quản lý khách hàng
        QLyKH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogQLKHFragment dialogQLKHFragment = new DialogQLKHFragment();
                dialogQLKHFragment.show(getFragmentManager(),"example");
            }
        });
        //
        return view;
    }

}
