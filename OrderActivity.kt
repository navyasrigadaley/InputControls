package com.example.droidcafeinput

//import android.R
//import android.R

//import android.R

//import android.R
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


abstract class OrderActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        val spinner = findViewById<Spinner>(R.id.label_spinner)
        if (spinner != null) {
            spinner.onItemSelectedListener = this
        }
        val adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
// Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    fun onRadioButtonClicked(view: View) {
        val checked = (view as RadioButton).isChecked
        when (view.getId()) {
            R.id.sameday -> if (checked) // Same day service
                displayToast(getString(R.string.same_day_messenger_service))
            R.id.nextday -> if (checked) // Next day delivery
                displayToast(getString(R.string.next_day_ground_delivery))
            R.id.pickup -> if (checked) // Pick up
                displayToast(getString(R.string.pick_up))
            else -> {
            }
        }

    }
    override fun onItemSelected(adapterView: AdapterView<*>,
                                view: View?, i: Int, l: Long) {
        val spinnerLabel = adapterView.getItemAtPosition(i).toString()
        displayToast(spinnerLabel)
    }
    override fun onNothingSelected(adapterView: AdapterView<*>?) {
        // Do nothing.
    }
    private fun displayToast(message: String?) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

}