package com.awesomeapp.module_4_185

sealed class State185_20 {
    data object Loading : State185_20()
    data class Success(val data: String) : State185_20()
    data class Error(val message: String) : State185_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}