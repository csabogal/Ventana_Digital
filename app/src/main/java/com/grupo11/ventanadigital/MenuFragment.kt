package com.grupo11.ventanadigital

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.grupo11.ventanadigital.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    // La interface define un contrato. Cualquier Actividad que quiera usar este fragmento
    // debe implementar esta interface y su metodo. Así nos aseguramos de que pueda recibir los clics.
    interface OnMenuOptionClickListener {
        fun onMenuOptionClick(option: String)
    }

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    private var listener: OnMenuOptionClickListener? = null

    // onAttach se llama cuando el fragmento se conecta a la Actividad.
    // Aquí es donde establecemos la comunicación.
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnMenuOptionClickListener) {
            listener = context
        } else {
            throw RuntimeException("$context debe implementar OnMenuOptionClickListener")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    // onViewCreated se llama justo después de que la vista ha sido creada.
    // Es este espacio esta configurado los listeners de los botones.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPerfil.setOnClickListener { listener?.onMenuOptionClick("perfil") }
        binding.btnFotos.setOnClickListener { listener?.onMenuOptionClick("fotos") }
        binding.btnVideo.setOnClickListener { listener?.onMenuOptionClick("video") }
        binding.btnWeb.setOnClickListener { listener?.onMenuOptionClick("web") }
        binding.btnBotones.setOnClickListener { listener?.onMenuOptionClick("botones") }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // onDetach se llama cuando el fragmento se desconecta.
    // Limpiamos el listener para evitar fugas de memoria.
    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}