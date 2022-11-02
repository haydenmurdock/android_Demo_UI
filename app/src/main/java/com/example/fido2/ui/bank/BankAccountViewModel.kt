package com.example.fido2.ui.bank

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fido2.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BankAccountViewModel @Inject constructor(
    private val repository: AuthRepository
) : ViewModel() {

    fun signOut() {
        viewModelScope.launch {
            repository.signOut()
        }
    }

    fun userNameVerified(){
        viewModelScope.launch {
            //repository.userNameHasBeenVerified()
        }
    }


}