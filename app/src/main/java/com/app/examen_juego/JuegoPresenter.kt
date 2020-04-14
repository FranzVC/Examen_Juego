package com.app.examen_juego

import android.content.Context

class JuegoPresenter(val view: IContractJuego.View, val context: Context) : IContractJuego.Presenter{
    lateinit var pos:List<Int>
    override fun jugar(pos: Int) {
        TODO("Not yet implemented")
    }

    override fun verificar(): Boolean {
        var resp = false

        return resp
    }

    override fun reiniciar() {
        TODO("Not yet implemented")
    }
}