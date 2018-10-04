package com.ytl.mff;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Richard Yi-Te Lu on 03,October,2018
 */
public class ListFragment extends Fragment {

    public interface OnRecipeSelectedInterface{
        void onListRecipeSelected(int index);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        OnRecipeSelectedInterface listener = (OnRecipeSelectedInterface) getActivity();

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recycleView = view.findViewById(R.id.listRecycleView);
        ListAdapter listAdapter = new ListAdapter(listener);

        recycleView.setAdapter(listAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recycleView.setLayoutManager(layoutManager);

        return view;
    }
}
