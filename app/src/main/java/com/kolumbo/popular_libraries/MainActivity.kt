package com.kolumbo.popular_libraries

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kolumbo.popular_libraries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        val listener = View.OnClickListener {
            presenter.counterClick1(it.id)
            presenter.counterClick2(it.id)
            presenter.counterClick3(it.id)
        }

        vb?.btnCounter1?.setOnClickListener(listener)
        vb?.btnCounter2?.setOnClickListener(listener)
        vb?.btnCounter3?.setOnClickListener(listener)


    }

    override fun setCounter1(text: String) {
        vb?.btnCounter1?.text = text
    }

    override fun setCounter2(text: String) {
        vb?.btnCounter2?.text = text
    }

    override fun setCounter3(text: String) {
        vb?.btnCounter3?.text = text
    }


}