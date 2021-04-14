package com.gdev.placar

class MainPresenter(private val view: MainContractMVP.View) : MainContractMVP.Presenter {
    private var model: MainContractMVP.Model = MainModel(this)

    override fun onIncrementTeamA(i: Int) {
        view.setPointTeamA(i+1)
    }

    override fun onDecrementTeamA(i: Int) {
        var result = i
        if(i > 0) result--
        view.setPointTeamA(result)
    }

    override fun onIncrementTeamB(i: Int) {
        view.setPointTeamB(i+1)
    }

    override fun onDecrementTeamB(i: Int) {
        var result = i
        if(i > 0) result--
        view.setPointTeamB(result)
    }

    override fun loadNameTeamA() {
        val nameTeamA = model.getNameTeamA();
        view.setNameTeamA(nameTeamA)
    }

    override fun loadNameTeamB() {
        val nameTeamB = model.getNameTeamB();
        view.setNameTeamB(nameTeamB)
    }

}