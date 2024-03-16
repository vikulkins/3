package com.example.a3;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3.databinding.FragmentFromBinding;
import com.example.a3.databinding.FragmentSecondBinding;
public class FromFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(
                            R.id.fragment_container_view,
                            ToFragment.class,
                            null
                    ).commit();
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentFromBinding binding = FragmentFromBinding.inflate(inflater,container,false);
        getChildFragmentManager()
                .setFragmentResultListener("REQUESTkey",this, ((requestKey, result) -> {
                    binding.welcome.setText(result.getString("BUNDLEkey"));
                }));
        return binding.getRoot();
    }
}