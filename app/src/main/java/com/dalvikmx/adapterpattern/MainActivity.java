package com.dalvikmx.adapterpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
    }


    private void initData() {

        /**
         * En este punto es probable que tengamos objetos construidos con Modelos previamente definidios
         * el objetivo del patron de diseño es Adaptar estos objetos a nuevos Modelos sin necesidad de sobreescribir
         * O modificar el core del Modelo existente, en su momento puede utilizarse
         */
        OldLocation oldLocation = new CustomerLocation();
        oldLocation.setBuilding("Sterling Building");
        oldLocation.setFloor(4);
        oldLocation.setDesk(10);

        TextView textView = findViewById(R.id.text_view);

        /**
         * Migramos el objeto anterior al nuevo con el Adapter creado
         */

        NewLocation newLocation = new Adapter(oldLocation);

        /**
         * Corroboramos que la consistencia del nuevo objeto sea el correcto
         */

        textView.setText(new StringBuilder()
                        .append(newLocation.getBuilding())
                        .append(", piso ")
                        .append(newLocation.getFloor())
                        .append(", mesa ")
                        .append(newLocation.getDesk())
                        .toString());


    }
}
