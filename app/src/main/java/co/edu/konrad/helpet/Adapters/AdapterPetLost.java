package co.edu.konrad.helpet.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import co.edu.konrad.helpet.Models.LostPet;
import co.edu.konrad.helpet.R;
import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterPetLost extends ArrayAdapter {

    private Context context;
    private ArrayList<LostPet> datos;

    public AdapterPetLost(Context context, ArrayList<LostPet> datos){
        super(context, R.layout.item_lost_pets, datos);
        this.context = context;
        this.datos = datos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_lost_pets,parent,false);

        CircleImageView imagen =  view.findViewById(R.id.profile_pet);
        imagen.setImageResource(datos.get(position).getImage());

        TextView nombre = (TextView) view.findViewById(R.id.petName);
        nombre.setText(datos.get(position).getPetName());

        TextView direccion = (TextView) view.findViewById(R.id.ownerName);
        direccion.setText(datos.get(position).getOwnerName());

        TextView phone = (TextView) view.findViewById(R.id.ownerPhone);
        phone.setText(datos.get(position).getNumerOwner());

        TextView ownerAddress = (TextView) view.findViewById(R.id.ownerAddress);
        ownerAddress.setText(datos.get(position).getDirection());

        TextView state = (TextView) view.findViewById(R.id.state);
        state.setText(datos.get(position).getType());

        return view;
    }
}
