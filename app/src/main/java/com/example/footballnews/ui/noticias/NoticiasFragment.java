package com.example.footballnews.ui.noticias;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.footballnews.databinding.FragmentNoticiasBinding;

public class NoticiasFragment extends Fragment {

    private FragmentNoticiasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NoticiasViewModel noticiasViewModel =
                new ViewModelProvider(this).get(NoticiasViewModel.class);

        binding = FragmentNoticiasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        noticiasViewModel.getText().observe(getViewLifecycleOwner(), binding.textHome::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}