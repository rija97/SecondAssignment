package com.rija.secondassignment.ui.gallery;

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

import com.rija.secondassignment.R;

public class GalleryFragment extends Fragment implements View.OnClickListener {
    private Button btnAreaOfCircle;
    private EditText etFirst;


    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        galleryViewModel =
//                ViewModelProviders.of(this).get(GalleryViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        galleryViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        etFirst = view.findViewById(R.id.etFirst);
        btnAreaOfCircle = view.findViewById(R.id.btnAreaOfCircle);

        btnAreaOfCircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        float first = Float.parseFloat(etFirst.getText().toString());
        float area = 3.14f * first * first;

        Toast.makeText(getActivity(),"Area of circle:" + area,Toast.LENGTH_SHORT).show();
    }
}