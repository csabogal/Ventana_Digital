package com.grupo11.ventanadigital

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.grupo11.ventanadigital.databinding.FragmentWebBinding

class WebFragment : Fragment() {
    private var _binding: FragmentWebBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentWebBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configuración básica del WebView
        binding.webView.webViewClient = WebViewClient() // Para que las URLs se abran dentro de la app
        binding.webView.settings.javaScriptEnabled = true // Habilitar JavaScript si es necesario

        // Evento del botón
        binding.btnWebCargar.setOnClickListener {
            var url = binding.etWebUrl.text.toString()
            if (url.isNotEmpty()) {
                // Asegurarse de que la URL tenga el prefijo http:// o https://
                if (!url.startsWith("https://") && !url.startsWith("http://")) {
                    url = "https://$url"
                }
                binding.webView.loadUrl(url)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}