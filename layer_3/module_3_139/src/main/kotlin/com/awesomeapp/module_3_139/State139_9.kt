package com.awesomeapp.module_3_139

sealed class State139_9 {
    data object Loading : State139_9()
    data class Success(val data: String) : State139_9()
    data class Error(val message: String) : State139_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}