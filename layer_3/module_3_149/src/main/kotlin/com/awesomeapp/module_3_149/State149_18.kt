package com.awesomeapp.module_3_149

sealed class State149_18 {
    data object Loading : State149_18()
    data class Success(val data: String) : State149_18()
    data class Error(val message: String) : State149_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}