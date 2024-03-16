package com.example.a3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3.databinding.FragmentToBinding;

public class ToFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentToBinding binding = FragmentToBinding.inflate(inflater, container, false);
        binding.buttonBack.setOnClickListener(view -> {
            Bundle result = new Bundle();
            result.putString("BUNDLEkey", "передача данных");
            getParentFragmentManager().setFragmentResult("REQUESTkey",result);
            getParentFragmentManager().setFragmentResultListener("REQUESTkey",
                    this, (requestKey, bundle) -> {
                        String secondResult = bundle.getString("BUNDLEkey");
                        binding.buttonBack.setText(secondResult);
                    });
        });
        return binding.getRoot();
    }
}