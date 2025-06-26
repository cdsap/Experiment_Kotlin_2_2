package com.awesomeapp.module_2_122

sealed class State122_18 {
    data object Loading : State122_18()
    data class Success(val data: String) : State122_18()
    data class Error(val message: String) : State122_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}