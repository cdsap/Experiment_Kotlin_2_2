package com.awesomeapp.module_3_148

sealed class State148_14 {
    data object Loading : State148_14()
    data class Success(val data: String) : State148_14()
    data class Error(val message: String) : State148_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}