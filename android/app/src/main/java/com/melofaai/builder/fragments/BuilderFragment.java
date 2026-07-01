package com.melofaai.builder.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.melofaai.builder.R;

public class BuilderFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_builder, container, false);
        
        recyclerView = view.findViewById(R.id.websites_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        
        // TODO: Load websites from backend
        
        return view;
    }
}
