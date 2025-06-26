package com.awesomeapp.module_4_185

sealed class State185_17 {
    data object Loading : State185_17()
    data class Success(val data: String) : State185_17()
    data class Error(val message: String) : State185_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}