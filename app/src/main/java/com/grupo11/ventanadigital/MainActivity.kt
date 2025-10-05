package com.grupo11.ventanadigital

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), MenuFragment.OnMenuOptionClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Esta condición sirve para evitar que se creen fragmentos duplicados
        // como por ejemplo al girar la pantalla).
        if (savedInstanceState == null) {
            // Cargar el MenuFragment en su contenedor
            supportFragmentManager.beginTransaction()
                .replace(R.id.menu_fragment_container, MenuFragment())
                .commit()

            // Cargar el PerfilFragment como la pantalla por defecto en el contenedor de contenido
            supportFragmentManager.beginTransaction()
                .replace(R.id.content_fragment_container, PerfilFragment())
                .commit()
        }
    }

    // Este es el metodo que se ejecuta cuando el usuario presiona un boton en el MenuFragment.
    // Lo implementamos aquí porque MainActivity es la que escucha los clics del menu.
    override fun onMenuOptionClick(option: String) {
        val fragmentToLoad: Fragment = when (option) {
            "perfil" -> PerfilFragment()
            "fotos" -> FotosFragment()
            "video" -> VideoFragment()
            "web" -> WebFragment()
            "botones" -> BotonesFragment()
            else -> PerfilFragment() // Opción por defecto
        }

        // Llamamos a la función para reemplazar el fragmento de contenido
        replaceContentFragment(fragmentToLoad)
    }

    // Una función de ayuda para mantener el código limpio y no repetir la lógica de transacción.
    private fun replaceContentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.content_fragment_container, fragment)
            .commit()
    }
}