package com.awesomeapp.module_4_201

sealed class State201_13 {
    data object Loading : State201_13()
    data class Success(val data: String) : State201_13()
    data class Error(val message: String) : State201_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}