package com.example.firebaseauthyt.data

import com.example.firebaseauthyt.util.Resource
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun loginUser(email: String, password: String): Flow<Resource<AuthResult>>
    fun registerUser(email: String, password: String): Flow<Resource<AuthResult>>

    fun googleSignIn(credential: AuthCredential): Flow<Resource<AuthResult>>


}