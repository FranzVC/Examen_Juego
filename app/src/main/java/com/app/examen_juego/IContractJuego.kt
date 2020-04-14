package com.app.examen_juego

interface IContractJuego {
    interface View {
        fun showWinMessage()
        fun showLoseMessage()
    }

    interface Presenter {
        fun jugar(pos:Int)
        fun verificar():Boolean
        fun reiniciar()
    }
}