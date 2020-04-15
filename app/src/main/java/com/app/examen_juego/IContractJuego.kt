package com.app.examen_juego

interface IContractJuego {
    interface View {
        fun showWinMessage()
        fun showLoseMessage()
        fun pos1Selected(numeroJugador:Int)
        fun pos2Selected(numeroJugador:Int)
        fun pos3Selected(numeroJugador:Int)
        fun pos4Selected(numeroJugador:Int)
        fun pos5Selected(numeroJugador:Int)
        fun pos6Selected(numeroJugador:Int)
        fun pos7Selected(numeroJugador:Int)
        fun pos8Selected(numeroJugador:Int)
        fun pos9Selected(numeroJugador:Int)

    }

    interface Presenter {
        fun jugar(pos:Int)
        fun verificar(list: MutableList<Int>):Boolean
        fun reiniciar()
    }
}