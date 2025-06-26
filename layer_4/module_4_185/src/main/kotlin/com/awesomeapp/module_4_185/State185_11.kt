package com.awesomeapp.module_4_185

sealed class State185_11 {
    data object Loading : State185_11()
    data class Success(val data: String) : State185_11()
    data class Error(val message: String) : State185_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}