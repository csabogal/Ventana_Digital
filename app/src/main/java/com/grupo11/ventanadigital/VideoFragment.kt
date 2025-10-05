package com.grupo11.ventanadigital

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import androidx.fragment.app.Fragment
import com.grupo11.ventanadigital.databinding.FragmentVideoBinding

class VideoFragment : Fragment() {
    private var _binding: FragmentVideoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentVideoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Crear la ruta (URI) hacia nuestro video en la carpeta res/raw
        val videoPath = "android.resource://${requireActivity().packageName}/${R.raw.demovideo}"
        val uri = Uri.parse(videoPath)

        // 2. Establecer la URI en el VideoView
        binding.vvVideo.setVideoURI(uri)

        // 3. Crear y asociar los controles de reproducción (play, pausa, barra de progreso)
        val mediaController = MediaController(requireContext())
        binding.vvVideo.setMediaController(mediaController)
        mediaController.setAnchorView(binding.vvVideo)

        // (Opcional) Iniciar la reproducción automáticamente
        binding.vvVideo.start()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}