package com.example.gena;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ApprenticeFrag extends Fragment {

    private RecyclerView recyclerView;
    private ApprenticeAdapter adapter;
    private List<ApprenticeData> mApprenticeList;
    private ApprenticeData mApprenticeData;

    public ApprenticeFrag() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.apprentice_frag, container, false);

        recyclerView = rootView.findViewById(R.id.recyclerView);

        mApprenticeList = new ArrayList<>();
        mApprenticeData = new ApprenticeData("Darya Yakushenko", getString(R.string.appr1_descr), R.drawable.daryay);
        mApprenticeList.add(mApprenticeData);
        mApprenticeData = new ApprenticeData("Patrick Roche", getString(R.string.appr2_descr), R.drawable.patrickr);
        mApprenticeList.add(mApprenticeData);
        mApprenticeData = new ApprenticeData("Nikolas Turtak", getString(R.string.appr3_descr), R.drawable.nikolast);
        mApprenticeList.add(mApprenticeData);
        mApprenticeData = new ApprenticeData("Helena Gargan", getString(R.string.appr4_descr), R.drawable.helenag);
        mApprenticeList.add(mApprenticeData);
        mApprenticeData = new ApprenticeData("Michael Gartlan", getString(R.string.appr6_descr), R.drawable.michaelg);
        mApprenticeList.add(mApprenticeData);
        mApprenticeData = new ApprenticeData("Ahmed Mahmood", getString(R.string.appr6_descr), R.drawable.ahmed);
        mApprenticeList.add(mApprenticeData);
        mApprenticeData = new ApprenticeData("john doe7", getString(R.string.appr7_descr), R.drawable.appr7);
        mApprenticeList.add(mApprenticeData);
        mApprenticeData = new ApprenticeData("john doe8", getString(R.string.appr8_descr), R.drawable.appr8);
        mApprenticeList.add(mApprenticeData);
        mApprenticeData = new ApprenticeData("john doe9", getString(R.string.appr9_descr), R.drawable.appr9);
        mApprenticeList.add(mApprenticeData);
        mApprenticeData = new ApprenticeData("john doe10", getString(R.string.appr10_descr), R.drawable.appr10);
        mApprenticeList.add(mApprenticeData);
        mApprenticeData = new ApprenticeData("john doe11", getString(R.string.appr11_descr), R.drawable.appr11);
        mApprenticeList.add(mApprenticeData);

        adapter = new ApprenticeAdapter(getActivity(), mApprenticeList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);



        // Inflate the layout for this fragment
        return rootView;
    }
}
