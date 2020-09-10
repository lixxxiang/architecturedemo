package com.android.cgwx.architecture_demo.tasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.android.cgwx.architecture_demo.R
import kotlinx.android.synthetic.main.activity_main.*

class TasksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var appBarConfiguration: AppBarConfiguration = AppBarConfiguration.Builder(R.id.tas)
        setupActionBarWithNavController(findNavController(R.id.nav_host_fragment))
    }
}