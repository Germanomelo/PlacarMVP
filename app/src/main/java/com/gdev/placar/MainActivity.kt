package com.gdev.placar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContractMVP.View{

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)

        presenter.loadNameTeamA()
        presenter.loadNameTeamB()
    }

    override fun setPointTeamA(i: Int) {
        textTeamAResult.text = i.toString()
    }

    override fun setPointTeamB(i: Int) {
        textTeamBResult.text = i.toString()
    }

    override fun setNameTeamA(name: String) {
        textTeamATitle.text = name
    }

    override fun setNameTeamB(name: String) {
        textTeamBTitle.text = name
    }

    fun onClickIncrementTeamA(view: View) {
        val point = textTeamAResult.text.toString().toInt()
        presenter.onIncrementTeamA(point)
    }

    fun onClickIncrementTeamB(view: View) {
        val point = textTeamBResult.text.toString().toInt()
        presenter.onIncrementTeamB(point)
    }
    fun onClickDecrementTeamA(view: View) {
        val point = textTeamAResult.text.toString().toInt()
        presenter.onDecrementTeamA(point)
    }
    fun onClickDecrementTeamB(view: View) {
        val point = textTeamBResult.text.toString().toInt()
        presenter.onDecrementTeamB(point)
    }

}