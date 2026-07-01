package com.melofaai.builder.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.melofaai.builder.R;

public class TemplatesFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_templates, container, false);
        
        recyclerView = view.findViewById(R.id.templates_recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        
        // TODO: Load templates from backend
        
        return view;
    }
}
