package com.app.examen_juego

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),IContractJuego.View {

    lateinit var juegoPresenter: IContractJuego.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickButton(view: View){
        if (view.id == btn_pos00.id){
            juegoPresenter.jugar(1)
        }
        if (view.id == btn_pos01.id){
            juegoPresenter.jugar(2)
        }
        if (view.id == btn_pos02.id){
            juegoPresenter.jugar(3)
        }
        if (view.id == btn_pos10.id){
            juegoPresenter.jugar(4)
        }
        if (view.id == btn_pos11.id){
            juegoPresenter.jugar(5)
        }
        if (view.id == btn_pos12.id){
            juegoPresenter.jugar(6)
        }
        if (view.id == btn_pos20.id){
            juegoPresenter.jugar(7)
        }
        if (view.id == btn_pos21.id){
            juegoPresenter.jugar(8)
        }
        if (view.id == btn_pos22.id){
            juegoPresenter.jugar(9)
        }
    }

    override fun showWinMessage() {

    }

    override fun showLoseMessage() {
    }

    override fun pos1Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos00.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos00.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos2Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos01.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos01.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos3Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos02.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos02.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos4Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos10.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos10.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos5Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos11.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos11.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos6Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos12.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos12.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos7Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos20.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos20.setBackgroundColor(resources.getColor(R.color.j2))
        }
         }

    override fun pos8Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos21.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos21.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }

    override fun pos9Selected(numeroJugador: Int) {
        if(numeroJugador == 1){
            btn_pos22.setBackgroundColor(resources.getColor(R.color.j1))
        }else {
            btn_pos22.setBackgroundColor(resources.getColor(R.color.j2))
        }
    }
}