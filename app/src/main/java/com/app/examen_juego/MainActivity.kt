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

    override fun pos1Selected(numeroJugador:Int) {
        TODO("Not yet implemented")
    }

    override fun pos2Selected(numeroJugador:Int) {
        TODO("Not yet implemented")
    }

    override fun pos3Selected(numeroJugador:Int) {
        TODO("Not yet implemented")
    }

    override fun pos4Selected(numeroJugador:Int) {
        TODO("Not yet implemented")
    }

    override fun pos5Selected(numeroJugador:Int) {
        TODO("Not yet implemented")
    }

    override fun pos6Selected(numeroJugador:Int) {
        TODO("Not yet implemented")
    }

    override fun pos7Selected(numeroJugador:Int) {
        TODO("Not yet implemented")
    }

    override fun pos8Selected(numeroJugador:Int) {
        TODO("Not yet implemented")
    }

    override fun pos9Selected(numeroJugador:Int) {
        TODO("Not yet implemented")
    }


}