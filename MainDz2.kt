package ru.itis.firsttrialandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainDz2 : AppCompatActivity ()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_navigation)

        val navController=findNavController(R.id.nav_host_fragment)
        val bottomNavigator=findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigator.setupWithNavController(navController)
    }
}