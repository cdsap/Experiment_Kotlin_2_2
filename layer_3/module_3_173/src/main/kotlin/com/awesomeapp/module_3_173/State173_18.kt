package com.awesomeapp.module_3_173

sealed class State173_18 {
    data object Loading : State173_18()
    data class Success(val data: String) : State173_18()
    data class Error(val message: String) : State173_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}