package com.grupo11.ventanadigital

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.grupo11.ventanadigital.databinding.FragmentFotosBinding

class FotosFragment : Fragment() {
    private var _binding: FragmentFotosBinding? = null
    private val binding get() = _binding!!

    // Modelo de datos simple para nuestras fotos
    data class Foto(val recursoId: Int, val descripcion: String)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentFotosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Creamos una lista de nuestros objetos Foto
        val listaDeFotos = listOf(
            Foto(R.drawable.foto_1, "Camisetas Rockeras Hombre."),
            Foto(R.drawable.foto_2, "Anillos Rockeros."),
            Foto(R.drawable.foto_3, "Chaquetas Rockeras Hombre."),
            Foto(R.drawable.foto_4, "Decoración Rockera."),
            Foto(R.drawable.foto_5, "Guitarras Eléctricas."),
            Foto(R.drawable.foto_6, "Discos de Vinilo Rockeros."),
            Foto(R.drawable.foto_7, "Replica de Placa Conmemorativa del gran Ozzy Osbourne."),
        )

        // Obtenemos el contenedor del layout
        val container = binding.fotosContainer

        // Iteramos sobre la lista para crear y añadir cada foto
        for (foto in listaDeFotos) {
            // Creamos un ImageView dinámicamente
            val imageView = ImageView(requireContext()).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, // Ancho
                    600 // Alto en píxeles
                ).also { it.bottomMargin = 16 } // Margen inferior

                setImageDrawable(ContextCompat.getDrawable(requireContext(), foto.recursoId))
                scaleType = ImageView.ScaleType.CENTER_INSIDE // Escala de la imagen

                // Evento de clic para mostrar la descripción
                setOnClickListener {
                    Toast.makeText(context, foto.descripcion, Toast.LENGTH_LONG).show()
                }
            }
            // Añadimos el ImageView al contenedor
            container.addView(imageView)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}