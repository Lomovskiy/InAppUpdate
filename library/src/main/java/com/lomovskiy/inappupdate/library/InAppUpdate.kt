package com.lomovskiy.inappupdate.library

sealed interface State {
    object Pending : State
    object Downloading : State

}

interface StateConsumer {

    fun onNewState(state: State)

}

class InAppUpdate(
    val stateConsumer: StateConsumer,

)