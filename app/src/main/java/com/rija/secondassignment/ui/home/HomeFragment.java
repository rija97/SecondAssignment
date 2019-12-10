package com.rija.secondassignment.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.rija.secondassignment.Palindrome;
import com.rija.secondassignment.R;

public class HomeFragment extends Fragment implements View.OnClickListener{
    private EditText etPalindrome;
    private Button btnCalculate;



    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        etPalindrome  = view.findViewById(R.id.etPalindrome);
        btnCalculate = view.findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {


        int no = Integer.parseInt(etPalindrome.getText().toString());
        Palindrome palindrome = new Palindrome();
        int result = palindrome.reverse(no);
        if (result == no) {
            Toast.makeText(getActivity(), "is Palindrome:" + result, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "is not Palindrome:" + result, Toast.LENGTH_SHORT).show();

        }
    }

    }
