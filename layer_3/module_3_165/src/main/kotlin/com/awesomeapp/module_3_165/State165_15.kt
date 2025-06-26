package com.awesomeapp.module_3_165

sealed class State165_15 {
    data object Loading : State165_15()
    data class Success(val data: String) : State165_15()
    data class Error(val message: String) : State165_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}