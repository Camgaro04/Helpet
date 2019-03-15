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
import java.util.List;

import co.edu.konrad.helpet.Adapters.AdapterPetLost;
import co.edu.konrad.helpet.Models.LostPet;
import co.edu.konrad.helpet.R;

public class PetLostFragment extends Fragment {

    private ListView listLostPets;
    public PetLostFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lost_pet_fragment,container,false);
        listLostPets = view.findViewById(R.id.listLostPets);
        loadData();
        return view;
    }


    private void loadData(){
        ArrayList<LostPet> lostPets = new ArrayList<>();
        lostPets.add(new LostPet("Lucky","Carlos Marcel","312-885-2","Cra 78 #85-62","PERDIDO",R.mipmap.dog_one));
        lostPets.add(new LostPet("Lukas","Marcela Cardenas","885-312-2","Cra 87 #52-67","PERDIDO",R.mipmap.dog_two));
        lostPets.add(new LostPet("Frizzer","Mateo Abadon","312-885-2","Cra 78 #85-62","ADOPCION",R.mipmap.cat_one));
        lostPets.add(new LostPet("Till","Carlos Marcel","312-885-2","Cra 78 #85-62","PERDIDO",R.mipmap.cat_two));

        AdapterPetLost adapterPetLost = new AdapterPetLost(getActivity(),lostPets);
        listLostPets.setAdapter(adapterPetLost);

    }
}
