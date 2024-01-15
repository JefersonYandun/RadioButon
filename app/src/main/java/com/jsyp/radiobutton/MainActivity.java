package com.jsyp.radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton1, radioButton2;

    ToggleButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias de los elementos en el layout
        radioGroup = findViewById(R.id.radioGroup);
        radioButton1 = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);


        // Configurar el evento clic del botón
        Button btnMostrar = findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Llamar a la función para mostrar la selección
                Mostrarseleccion();
            }
        });
    }

    private void Mostrarseleccion() {
        // Obtener el ID de la opción seleccionada
        int selectedId = radioGroup.getCheckedRadioButtonId();

        // Verificar la opción seleccionada y mostrar un mensaje
        String message;
        if (selectedId == R.id.radioButton) {
            message = "HAZ ELEGIDO GENERO MASCULINO";
        } else if (selectedId == R.id.radioButton2) {
            message = "HAZ ELEGIDO GENERO FEMENINO";

        } else {
            message = "NINGUNA OPCION SELECCIONADA";
        }

        // Mostrar un Toast con el mensaje
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
