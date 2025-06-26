package com.awesomeapp.module_4_211

sealed class State211_9 {
    data object Loading : State211_9()
    data class Success(val data: String) : State211_9()
    data class Error(val message: String) : State211_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}