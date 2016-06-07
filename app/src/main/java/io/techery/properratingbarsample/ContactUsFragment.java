package io.techery.properratingbarsample;


import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUsFragment extends Fragment {
    private PackageManager packageManager;

    public ContactUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact_us, container, false);
        final FrameLayout frameLayout = (FrameLayout) v.findViewById(R.id.frame_layout);
        frameLayout.getBackground().setAlpha(0);
        FloatingActionButton find_us = (FloatingActionButton) v.findViewById(R.id.fab_findus);
        FloatingActionButton mail_us = (FloatingActionButton) v.findViewById(R.id.fab_mailus);
        FloatingActionButton call_us = (FloatingActionButton) v.findViewById(R.id.fab_callus);


        final FloatingActionsMenu fabMenu = (FloatingActionsMenu) v.findViewById(R.id.fab_menu);

        fabMenu.setOnFloatingActionsMenuUpdateListener(new FloatingActionsMenu.OnFloatingActionsMenuUpdateListener() {
            @Override
            public void onMenuExpanded() {
                frameLayout.getBackground().setAlpha(240);
                frameLayout.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        fabMenu.collapse();
                        return true;
                    }
                });
            }

            @Override
            public void onMenuCollapsed() {
                frameLayout.getBackground().setAlpha(0);
                frameLayout.setOnTouchListener(null);
            }
        });
        find_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://maps.google.com/maps?daddr=" + 10.05387 + "," + 76.32762300000002;
                Intent goZe = new Intent(Intent.ACTION_VIEW);
                goZe.setData(Uri.parse(url));
                startActivity(goZe);
            }
        });
        mail_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"hello@GravityKerala.in"});
                startActivity(emailIntent);
            }
        });
        call_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_CALL);
                String phNum = "tel:" + "9746440467";
                myIntent.setData(Uri.parse(phNum));
                startActivity(myIntent);

            }
        });


        return v;
    }

}
