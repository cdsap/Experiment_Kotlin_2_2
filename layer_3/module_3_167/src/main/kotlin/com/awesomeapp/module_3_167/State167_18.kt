package com.awesomeapp.module_3_167

sealed class State167_18 {
    data object Loading : State167_18()
    data class Success(val data: String) : State167_18()
    data class Error(val message: String) : State167_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}