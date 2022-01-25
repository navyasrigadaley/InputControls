package com.example.droidcafeinput

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    val EXTRA_MESSAGE = "com.example.android.droidcafeinput.extra.MESSAGE"
    private val mOrderMessage: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val intent = Intent(this@MainActivity, OrderActivity::class.java)
            startActivity(intent)
            fab.setImageResource(R.drawable.ic_action_shopping_cart);


        }
        /* fun cart(view:android.view.View)
       {
        val intent=Intent(this,OrderActivity::class.java)
           startActivity(intent)
    }*/

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
    fun displayToast(message: String?) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
    fun showDonutOrder(view: View) {
        displayToast(getString(R.string.donut_order_message))
        //  var mOrderMessage = getString(R.string.donut_order_message);
        // displayToast(mOrderMessage);
    }
    fun showIceCreamOrder(view: View?) {
        displayToast(getString(R.string.ice_cream_order_message))
        // var mOrderMessage = getString(R.string.ice_cream_order_message);
        //displayToast(mOrderMessage);
    }

    /**
     * Shows a message that the froyo image was clicked.
     */
    fun showFroyoOrder(view: View?) {
        displayToast(getString(R.string.froyo_order_message))
        //var mOrderMessage = getString(R.string.froyo_order_message);
        // val mOrderMessage
        // displayToast(mOrderMessage);
    }

}