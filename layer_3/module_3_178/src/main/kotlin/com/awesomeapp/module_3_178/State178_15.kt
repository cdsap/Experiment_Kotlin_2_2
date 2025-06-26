package com.awesomeapp.module_3_178

sealed class State178_15 {
    data object Loading : State178_15()
    data class Success(val data: String) : State178_15()
    data class Error(val message: String) : State178_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}