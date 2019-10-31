package com.b3nedikt.restring.example

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.b3nedikt.restring.Restring
import com.b3nedikt.restring.RestringLocale
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val localeStrings = APP_LOCALES.map { it.language + " " + it.country }
        val adapter = ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, localeStrings)

        spinner.adapter = adapter
    }

    override fun onResume() {
        super.onResume()

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                RestringLocale.currentLocale = APP_LOCALES[position]
                
                Restring.reword(topLayout)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) = Unit
        }
    }
}
