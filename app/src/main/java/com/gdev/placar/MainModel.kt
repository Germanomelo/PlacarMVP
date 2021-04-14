package com.gdev.placar

class MainModel(private val present: MainContractMVP.Presenter) : MainContractMVP.Model {

    override fun getNameTeamA(): String { return "Bayer" }

    override fun getNameTeamB(): String { return "Liverpool" }

}