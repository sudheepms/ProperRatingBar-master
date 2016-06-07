package io.techery.properratingbarsample;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    public SliderLayout sliderShow;
    CardView cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        sliderShow = (SliderLayout) view.findViewById(R.id.image_slider);
        cat1 = (CardView) view.findViewById(R.id.h_cat1);
        cat2 = (CardView) view.findViewById(R.id.h_cat2);
        cat3 = (CardView) view.findViewById(R.id.h_cat3);
        cat4 = (CardView) view.findViewById(R.id.h_cat4);
        cat5 = (CardView) view.findViewById(R.id.h_cat5);
        cat6 = (CardView) view.findViewById(R.id.h_cat6);
        cat7 = (CardView) view.findViewById(R.id.h_cat7);
        cat8 = (CardView) view.findViewById(R.id.h_cat8);


        HashMap<String, Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("offer1", R.drawable.slide1);
        file_maps.put("offer2", R.drawable.slide2);

        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(getContext());
            textSliderView
                    .description("New Items")
                    //  .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);

            sliderShow.addSlider(textSliderView);
        }

        cat1.setOnClickListener(this);

        cat2.setOnClickListener(this);
        cat3.setOnClickListener(this);
        cat4.setOnClickListener(this);
        cat5.setOnClickListener(this);
        cat6.setOnClickListener(this);
        cat7.setOnClickListener(this);
        cat8.setOnClickListener(this);


        return view;
    }


    @Override
    public void onStop() {
        sliderShow.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.h_cat1:
            case R.id.h_cat2:
            case R.id.h_cat3:
            case R.id.h_cat4:
            case R.id.h_cat5:
            case R.id.h_cat6:
            case R.id.h_cat7:
            case R.id.h_cat8:
                i = new Intent(getActivity(), ItemListActivity.class);
                startActivity(i);

        }

    }

}
