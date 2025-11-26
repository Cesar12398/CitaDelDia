package com.cesarm.citadeldia

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var tvCita : TextView
    lateinit var tvAutor : TextView
    lateinit var  btnNuevaCita : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        private val listaCitas = listOf(
            Cita ("La vida es sueño", "Calderón de la Barca"),
            Cita ( "Pienso, luego existo", "René Descartes"),
            Cita ("El conocimiento es poder", "Francis Bacon")
        )

        tvCita.findViewById(R.id.tv_cita)
        tvAutor.findViewById(R.id.tv_autor)
        btnNuevaCita.findViewById(R.id.btn_nueva_cita)

        //Acción del boton









    }
}