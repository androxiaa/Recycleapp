package it.unich.s3221238.recycleapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GG_RecyclerViewAdapter extends RecyclerView.Adapter<GG_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<ModelliGiochi> modelliGiochi;
    public GG_RecyclerViewAdapter(Context context, ArrayList<ModelliGiochi> modelliGiochi){
        this.context = context;
        this.modelliGiochi = modelliGiochi;
    }

    @NonNull
    @Override
    public GG_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);

        return new GG_RecyclerViewAdapter.MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull GG_RecyclerViewAdapter.MyViewHolder holder, int position) {
        //assegna valori alle views in base alla posizione
        holder.tvNome.setText(modelliGiochi.get(position).getGiocoNome());
        holder.tvSito.setText(modelliGiochi.get(position).getSitoNome());
        holder.ImageView.setImageResource(modelliGiochi.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        //totale items
        return modelliGiochi.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView ImageView;
        TextView tvNome, tvSito;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ImageView = itemView.findViewById(R.id.imageView);
            tvNome = itemView.findViewById(R.id.textView);
            tvSito = itemView.findViewById(R.id.textView2);
        }
    }

}
