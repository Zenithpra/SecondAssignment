package com.zenith.solutionassignment2.ui.swapping;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.zenith.solutionassignment2.R;

public class SwappingFragment extends Fragment implements View.OnClickListener {
        private TextView txsw,txsw1;
        private Button btnswapping;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_swapping, container, false);

        txsw = view.findViewById(R.id.txsw);
        txsw1 = view.findViewById(R.id.txsw1);
        btnswapping = view.findViewById(R.id.btnswapping);

        btnswapping.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int num1, num2;
        num1 = Integer.parseInt(txsw.getText().toString());
        num2 = Integer.parseInt(txsw1.getText().toString());

        txsw.setText(Integer.toString(num2));
        txsw1.setText(Integer.toString(num1));
    }
}