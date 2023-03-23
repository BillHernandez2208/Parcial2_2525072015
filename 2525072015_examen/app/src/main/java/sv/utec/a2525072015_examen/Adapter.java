package sv.utec.a2525072015_examen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Elementos>{
    Context context;
    ArrayList<Modelo> modelos;

    public Adapter(Context context, ArrayList<Modelo> modelos) {
        this.context = context;
        this.modelos = modelos;
    }
    @NonNull
    @Override
    public Elementos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.usuarios,null);
        return new Elementos(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Elementos holder, int position) {
        Elementos.nom.setText(modelos.get(position).getNombreUsuario());
        Elementos.cargo.setText(modelos.get(position).getCargolaboral());
        Elementos.compañia.setText(modelos.get(position).getCompania());
        Elementos.imvimgUsuario.setImageResource(modelos.get(position).getAvatr());

    }

    @Override
    public int getItemCount() {
        return  modelos.size();
    }



}
