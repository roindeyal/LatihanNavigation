package com.svafvel.software.production.myapplication;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailCategoryFragment extends Fragment {


    public DetailCategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle saveInstanceState){

        super.onViewCreated(view, saveInstanceState);
        TextView tvCatagoryName = view.findViewById(R.id.tv_category_name);
        TextView tvCategoryDescription = view.findViewById(R.id.tv_category_description);

//        String dataName = getArguments().getString(CategoryFragment.EXTRA_NAME);
//        long dataDescription = getArguments().getLong(CategoryFragment.EXTRA_STOCK);

        String dataName = DetailCategoryFragmentArgs.fromBundle(getArguments()).getName();
        Long dataDescription = DetailCategoryFragmentArgs.fromBundle(getArguments()).getStock();

        tvCatagoryName.setText(dataName);
        tvCategoryDescription.setText("Stock : " + dataDescription);

    }

}
