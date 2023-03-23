package sv.utec.a2525072015_examen;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Elementos extends RecyclerView.ViewHolder{
    static ImageView imvimgUsuario;
    static TextView nom,cargo,compañia;
    public Elementos(@NonNull View itemView) {
        super(itemView);
        imvimgUsuario=itemView.findViewById(R.id.avatar);
        nom=itemView.findViewById(R.id.tvNombre);
        cargo=itemView.findViewById(R.id.tvCargo);
        compañia=itemView.findViewById(R.id.tvCompañia);
    }

}
