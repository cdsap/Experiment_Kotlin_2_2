package com.awesomeapp.module_4_211

sealed class State211_15 {
    data object Loading : State211_15()
    data class Success(val data: String) : State211_15()
    data class Error(val message: String) : State211_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}