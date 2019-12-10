package com.zenith.solutionassignment2.ui.palindrome;

import android.os.Bundle;
import android.text.TextUtils;
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

public class PalindromeFragment extends Fragment implements View.OnClickListener {

    private EditText etnumber;
    private Button btnpalindrome;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        etnumber = view.findViewById(R.id.etnumber);
        btnpalindrome = view.findViewById(R.id.btnpalindrome);

        btnpalindrome.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etnumber.getText())){
            etnumber.setError("Enter Number");
            etnumber.requestFocus();
            return;
        }
        int x, rev;
        x=Integer.parseInt(etnumber.getText().toString());
        PalindromeFragment pc=new PalindromeFragment();
        rev=pc.reverse(x);
        if(rev==x){
            Toast.makeText(getActivity(), "It is a Palindrome" , Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getActivity(), "It is not a Palindrome" , Toast.LENGTH_LONG).show();

        }
    }
        public int reverse (int i){
            int r, rev=0;
            while (i>0){
                r=i%10;
                rev=rev*10+r;
                i=i/10;
            }
            return  rev;
        }
    }

