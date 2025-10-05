    package com.grupo11.ventanadigital

    import android.os.Bundle
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.Toast
    import androidx.fragment.app.Fragment
    import com.grupo11.ventanadigital.databinding.FragmentBotonesBinding

    class BotonesFragment : Fragment() {
        private var _binding: FragmentBotonesBinding? = null
        private val binding get() = _binding!!

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
            _binding = FragmentBotonesBinding.inflate(inflater, container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            // Vínculos y declaración de metodos para los eventos
            binding.btnAccionUno.setOnClickListener {
                Toast.makeText(context, "Acción: Añadir al carrito", Toast.LENGTH_SHORT).show()
            }

            binding.btnAccionDos.setOnClickListener {
                Toast.makeText(context, "Acción: Contactar al vendedor", Toast.LENGTH_SHORT).show()
            }
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }