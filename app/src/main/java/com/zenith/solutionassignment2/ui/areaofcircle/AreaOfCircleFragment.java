package com.zenith.solutionassignment2.ui.areaofcircle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.zenith.solutionassignment2.R;

public class AreaOfCircleFragment extends Fragment implements View.OnClickListener {
    private Button btncircle;
    private EditText etradius;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_areaofcircle, container, false);
        etradius = view.findViewById(R.id.etradius);
        btncircle = view.findViewById(R.id.btncircle);

        btncircle.setOnClickListener(this);
        return view;


            }

    @Override
    public void onClick(View v) {
        int radius = Integer.parseInt(etradius.getText().toString());
        int result = (2*22/7)* radius;

        Toast.makeText(getActivity(), "radius is :" + result, Toast.LENGTH_SHORT).show();

    }
}
