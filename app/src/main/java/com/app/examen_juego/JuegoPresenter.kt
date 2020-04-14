package com.app.examen_juego

import android.content.Context

class JuegoPresenter(val view: IContractJuego.View, val context: Context) : IContractJuego.Presenter{
    override fun jugar(pos: Int) {
        TODO("Not yet implemented")
    }

    override fun verificar(): Boolean {
        TODO("Not yet implemented")
    }

    override fun reiniciar() {
        TODO("Not yet implemented")
    }
}