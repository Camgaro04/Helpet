package co.edu.konrad.helpet.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import co.edu.konrad.helpet.Models.LostPet;
import co.edu.konrad.helpet.Models.PetFind;
import co.edu.konrad.helpet.R;
import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterPetFind extends ArrayAdapter {

    private Context context;
    private ArrayList<PetFind> data;

    public AdapterPetFind(Context context, ArrayList<PetFind> data) {
        super(context, R.layout.item_pet_find, data);
        this.context = context;
        this.data = data;
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_pet_find,parent,false);

        CircleImageView imagen =  view.findViewById(R.id.profile_pet);
        imagen.setImageResource(data.get(position).getPetImage());

        TextView nombre = (TextView) view.findViewById(R.id.petName);
        nombre.setText(data.get(position).getPetName());

        TextView direccion = (TextView) view.findViewById(R.id.petFindByName);
        direccion.setText(data.get(position).getPetFindByName());

        return view;
    }
}
