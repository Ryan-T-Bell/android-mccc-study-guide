package com.armyprogrammer.mcccstudyguide

import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.util.Log
import android.view.Menu
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import database.AppDatabase
import database.QuestionsContract
import java.lang.NullPointerException

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d(TAG, "Initialize")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActionBar()
        setupNavigationDrawer()
        setupDatabase()
    }

    private fun setupDatabase() {

        val projection = arrayOf(QuestionsContract.Columns.KEY, QuestionsContract.Columns.CORRECT, QuestionsContract.Columns.INCORRECT)
        val sortOrder = QuestionsContract.Columns.KEY

        /** !! is the "bang bang" operator used to throw NullPointerException in getting Database from [AppProvider]
         * ALT SOLUTION: val context = this ?: throw NullPointerException("Database context can't be null here")
         */
        val cursor = contentResolver.query(QuestionsContract.CONTENT_URI,
            projection,
            null,
            null,
            sortOrder
        )!!

        Log.d(TAG, "***************************************************")
        cursor.use {
            while (it.moveToNext()) {
                with(cursor) {

                    //Cycle through all records
                    val key = getString(0)
                    val correct = getInt(1)
                    val incorrect = getInt(2)
                    val result = "ID: $key. Correct: $correct. Incorrect: $incorrect."
                    Log.d(TAG, "onCreate: reading data $result")
                }
            }
        }
        Log.d(TAG, "***************************************************")

    }

    private fun setupActionBar() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    private fun setupNavigationDrawer() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)

        // Passing each menu ID as a set of Ids because each menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(setOf(R.id.nav_dashboard, R.id.nav_study, R.id.nav_message_developer), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
