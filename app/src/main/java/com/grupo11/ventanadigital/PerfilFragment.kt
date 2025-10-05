package com.grupo11.ventanadigital

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.grupo11.ventanadigital.databinding.FragmentPerfilBinding

class PerfilFragment : Fragment() {

    // Declarar la variable de View Binding
    private var _binding: FragmentPerfilBinding? = null
    private val binding get() = _binding!!

    // Declarar las variables para las vistas
    private lateinit var tvTitulo: TextView
    private lateinit var ivFoto: ImageView
    private lateinit var tvDescripcion: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflar la vista usando View Binding
        _binding = FragmentPerfilBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Vincular las variables con las vistas del XML a través de binding
        tvTitulo = binding.tvPerfilTitulo
        ivFoto = binding.ivPerfilFoto
        tvDescripcion = binding.tvPerfilDescripcion

        // Cambiamos el contenido desde el código para el titulo
        tvTitulo.text = "Perfil del Vendedor"

        // desde aqui podemos cambiar el texto que se muestra en la descripción
        tvDescripcion.text = "Soy un vendedor con 5 años de experiencia, especializado en la gestión de clientes y el cierre de ventas efectivas. Cuento con formación en Ingeniería de Software del Politécnico Grancolombiano, lo que me permite combinar habilidades comerciales con un enfoque analítico y orientado a resultados."
    }

    // Limpiar el binding para evitar fugas de memoria
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}