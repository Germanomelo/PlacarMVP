package com.gdev.placar

interface MainContractMVP {

    interface View {
        fun setPointTeamA(i: Int)
        fun setPointTeamB(i: Int)
        fun setNameTeamA(name: String)
        fun setNameTeamB(name: String)
    }

    interface Presenter {
        fun onIncrementTeamA(i: Int)
        fun onDecrementTeamA(i: Int)
        fun onIncrementTeamB(i: Int)
        fun onDecrementTeamB(i: Int)
        fun loadNameTeamA()
        fun loadNameTeamB()
    }

    interface Model {
        fun getNameTeamA():String
        fun getNameTeamB():String
    }
}