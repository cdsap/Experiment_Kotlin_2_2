package com.awesomeapp.module_2_130

sealed class State130_14 {
    data object Loading : State130_14()
    data class Success(val data: String) : State130_14()
    data class Error(val message: String) : State130_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}