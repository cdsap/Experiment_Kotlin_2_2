package com.awesomeapp.module_3_148

sealed class State148_11 {
    data object Loading : State148_11()
    data class Success(val data: String) : State148_11()
    data class Error(val message: String) : State148_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}