package com.example.android.myappportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A fragment containing a main activity view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button button1 = (Button)rootView.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getActivity(), R.string.main_button1_msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button2 = (Button)rootView.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getActivity(), R.string.main_button2_msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button3 = (Button)rootView.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getActivity(), R.string.main_button3_msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button4 = (Button)rootView.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getActivity(), R.string.main_button4_msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button5 = (Button)rootView.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getActivity(), R.string.main_button5_msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button6 = (Button)rootView.findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getActivity(), R.string.main_button6_msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        return rootView;
    }
}
