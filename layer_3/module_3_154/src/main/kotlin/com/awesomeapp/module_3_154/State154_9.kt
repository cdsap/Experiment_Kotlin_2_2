package com.awesomeapp.module_3_154

sealed class State154_9 {
    data object Loading : State154_9()
    data class Success(val data: String) : State154_9()
    data class Error(val message: String) : State154_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}