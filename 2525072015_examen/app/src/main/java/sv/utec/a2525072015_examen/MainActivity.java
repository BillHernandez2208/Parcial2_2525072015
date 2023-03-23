package sv.utec.a2525072015_examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    Adapter adaptador;
    ListView ListaDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrecyclerView=findViewById(R.id.rvUsuarios);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adaptador = new Adapter(this,getListado());
        mrecyclerView.setAdapter(adaptador);

        mrecyclerView.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View v, MotionEvent event) {

                Toast.makeText(getBaseContext(),"seleccionar",Toast.LENGTH_SHORT).show();
                return false;
            }
        });



    }

    private ArrayList<Modelo> getListado(){
        ArrayList<Modelo> modelos= new ArrayList<>();
        Modelo modeloLista=new Modelo();
        modeloLista.setNombreUsuario("Alexander Perriot");
        modeloLista.setCargolaboral("CEO");
        modeloLista.setCompania("Insures S.O");
        modeloLista.setAvatr(R.drawable.lead_photo_1);
        modelos.add(modeloLista);

        modeloLista=new Modelo();
        modeloLista.setNombreUsuario("Carlos Lopez");
        modeloLista.setCargolaboral("Asistente");
        modeloLista.setCompania("Hospital Blue");
        modeloLista.setAvatr(R.drawable.lead_photo_2);
        modelos.add(modeloLista);

        modeloLista=new Modelo();
        modeloLista.setNombreUsuario("Sara Bond");
        modeloLista.setCargolaboral("Directora de Marketing");
        modeloLista.setCompania("Electrical Part ltd");
        modeloLista.setAvatr(R.drawable.lead_photo_3);
        modelos.add(modeloLista);

        modeloLista=new Modelo();
        modeloLista.setNombreUsuario("Liliana Clarence");
        modeloLista.setCargolaboral("Diseñadora de Producto");
        modeloLista.setCompania("Creativa App");
        modeloLista.setAvatr(R.drawable.lead_photo_4);
        modelos.add(modeloLista);

        modeloLista=new Modelo();
        modeloLista.setNombreUsuario("Carlos Lopez");
        modeloLista.setCargolaboral("Asistente");
        modeloLista.setCompania("Hospital Blue");
        modeloLista.setAvatr(R.drawable.lead_photo_5);
        modelos.add(modeloLista);

        modeloLista=new Modelo();
        modeloLista.setNombreUsuario("Benito Peralta");
        modeloLista.setCargolaboral("Supervisor de Ventas");
        modeloLista.setCompania("Neumaticos Press");
        modeloLista.setAvatr(R.drawable.lead_photo_6);
        modelos.add(modeloLista);

        modeloLista=new Modelo();
        modeloLista.setNombreUsuario("Juan Jaramillo");
        modeloLista.setCargolaboral("CEO");
        modeloLista.setCompania("Banco Nacional");
        modeloLista.setAvatr(R.drawable.lead_photo_7);
        modelos.add(modeloLista);

        modeloLista=new Modelo();
        modeloLista.setNombreUsuario("Christian Steps");
        modeloLista.setCargolaboral("CTO");
        modeloLista.setCompania("Cooperativa Verde");
        modeloLista.setAvatr(R.drawable.lead_photo_8);
        modelos.add(modeloLista);

        modeloLista=new Modelo();
        modeloLista.setNombreUsuario("Alexa Geraldo");
        modeloLista.setCargolaboral("Lead Programmer");
        modeloLista.setCompania("Linda Murillo");
        modeloLista.setAvatr(R.drawable.lead_photo_9);
        modelos.add(modeloLista);

        modeloLista=new Modelo();
        modeloLista.setNombreUsuario("Lizeth Astrada");
        modeloLista.setCargolaboral("CEO");
        modeloLista.setCompania("Concensionario Molotox");
        modeloLista.setAvatr(R.drawable.lead_photo_2);
        modelos.add(modeloLista);


        return modelos;
    }

}