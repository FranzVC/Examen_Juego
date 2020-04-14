package com.app.examen_juego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),IContractJuego.View {

    lateinit var loginPresenter: IContractJuego.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showWinMessage() {
        TODO("Not yet implemented")
    }

    override fun showLoseMessage() {
        TODO("Not yet implemented")
    }


}