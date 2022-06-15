package com.formatioproperty

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Declare the Vals and find the view id
        //val drawerLayout : DrawerLayout = findViewById(R.id.dlHome)
        drawerLayout = findViewById(R.id.dlHome)

        val navView : NavigationView = findViewById(R.id.nav_view)
        val drawerButton = findViewById<Button>(R.id.btnMenuDL)
        drawerButton.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        navView.setNavigationItemSelectedListener {
            //Show that item is selected
            it.isChecked = true

            when(it.itemId){
                R.id.navHome -> replaceFragment(HomeFragment(), it.title.toString())
                R.id.navMyApartments -> replaceFragment(ApartmentsFragment(), it.title.toString())
                R.id.navTenants -> replaceFragment(TenantsFragment(), it.title.toString())
                R.id.navMyIncome -> replaceFragment(IncomeFragment(), it.title.toString())
                R.id.navSubscription -> replaceFragment(SubscriptionFragment(), it.title.toString())
                R.id.navManage -> replaceFragment(ManageFragment(), it.title.toString())
                R.id.navAbout -> replaceFragment(AboutUsFragment(), it.title.toString())
                R.id.navContactUs -> replaceFragment(ContactUsFragment(), it.title.toString())
                R.id.navReport -> Toast.makeText(applicationContext,"Clicked Report/Inquire",Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    // Function when an item in drawerlayout is clicked open on the FragmentLayout
    private fun replaceFragment(fragment: Fragment,title: String){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)
    }

    //override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //if (myToggle.onOptionsItemSelected(item)){
            //return true
        //}
        //return super.onOptionsItemSelected(item)
    //}
}