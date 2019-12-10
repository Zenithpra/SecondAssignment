package com.zenith.solutionassignment2.ui.automorphic;

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

public class AutoMorphicFragment extends Fragment implements View.OnClickListener {

     private EditText etauto;
     private Button btnauto;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etauto = view.findViewById(R.id.etauto);
        btnauto = view.findViewById(R.id.btnauto);

        btnauto.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
     int a , square, counter=1;
     int n=Integer.parseInt(etauto.getText().toString() );

     a=n;
     square=n*n;
     while (n!=0)
     {
         counter=counter*10;
         n=n/10;
     }
     if(square%counter==a){
         Toast.makeText(getActivity(), "It is a Automorphic Number" , Toast.LENGTH_LONG).show();
     }
     else{
         Toast.makeText(getActivity(), "It is not a Automorphic Number" , Toast.LENGTH_LONG).show();
     }
    }
}