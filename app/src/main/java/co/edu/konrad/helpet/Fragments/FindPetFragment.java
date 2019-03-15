package co.edu.konrad.helpet.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.konrad.helpet.Adapters.AdapterPetFind;
import co.edu.konrad.helpet.Models.PetFind;
import co.edu.konrad.helpet.R;

public class FindPetFragment extends Fragment {

    private ListView petsFind;


    public FindPetFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.find_pet_fragment,container,false);
        petsFind = view.findViewById(R.id.listPetFind);
        loadData();
        return view;
    }

    private void loadData(){

        ArrayList<PetFind> petFinds = new ArrayList<>();
        petFinds.add(new PetFind("Frizzer","Shasam",R.mipmap.cat_one));
        petFinds.add(new PetFind("Lucky","Freddy Riben",R.mipmap.dog_one));
        petFinds.add(new PetFind("Motoso","Juan Barajas",R.mipmap.cat_two));

        AdapterPetFind adapterPetFind = new AdapterPetFind(getActivity(),petFinds);
        petsFind.setAdapter(adapterPetFind);
    }
}
