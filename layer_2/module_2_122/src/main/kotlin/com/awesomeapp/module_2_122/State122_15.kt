package com.awesomeapp.module_2_122

sealed class State122_15 {
    data object Loading : State122_15()
    data class Success(val data: String) : State122_15()
    data class Error(val message: String) : State122_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}