package com.arjinmc.openexpress.fragments;

import com.arjinmc.openexpress.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @desciption History records for searching
 * @author eminem
 * @email eminem@hicsg.com
 * @website arjinmc.com
 * @create 2015/3/12
 */
public class HistoryFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_history, null);
		//return super.onCreateView(inflater, container, savedInstanceState);
		return view;
	}

}