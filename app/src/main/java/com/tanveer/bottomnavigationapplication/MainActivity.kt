 package com.tanveer.bottomnavigationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.tanveer.bottomnavigationapplication.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
     var navController: NavController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.bottomNav?.setOnItemSelectedListener{
            when(it.itemId){
                R.id.home ->  navController?.navigate(R.id.firstFragment)
                R.id.details ->  navController?.navigate(R.id.secondFragment)
                R.id.login ->  navController?.navigate(R.id.thirdFragment)
            }
            return@setOnItemSelectedListener true
        }
        navController = findNavController(R.id.host)
    }

}