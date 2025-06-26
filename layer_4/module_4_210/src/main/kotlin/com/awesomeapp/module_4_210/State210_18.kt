package com.awesomeapp.module_4_210

sealed class State210_18 {
    data object Loading : State210_18()
    data class Success(val data: String) : State210_18()
    data class Error(val message: String) : State210_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}