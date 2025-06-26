package com.awesomeapp.module_3_142

sealed class State142_12 {
    data object Loading : State142_12()
    data class Success(val data: String) : State142_12()
    data class Error(val message: String) : State142_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}