package com.rija.secondassignment.ui.tools;

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

public class ToolsFragment extends Fragment implements View.OnClickListener {
    private Button btnAuto;
    private EditText etAuto;

    private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        toolsViewModel =
//                ViewModelProviders.of(this).get(ToolsViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_tools, container, false);
//        final TextView textView = root.findViewById(R.id.text_tools);
//        toolsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;

        View view = inflater.inflate(R.layout.fragment_tools, container, false);

        etAuto = view.findViewById(R.id.etAuto);
        btnAuto = view.findViewById(R.id.btnAuto);

        btnAuto.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int a, square, counter = 1;
        int no = Integer.parseInt(etAuto.getText().toString());
        a = no;
        square = no * no;
        while (no != 0) {
            counter = counter * 10;
            no = no / 10;
        }
        if (square % counter == a) {
            Toast.makeText(getActivity(), "is Automorphic:", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "is not Automorphic:", Toast.LENGTH_SHORT).show();

        }
    }
}


