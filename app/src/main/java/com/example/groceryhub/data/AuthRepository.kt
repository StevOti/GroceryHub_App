package com.example.groceryhub.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.groceryhub.models.User
import com.example.groceryhub.navigation.BottomBarScreen
import com.example.groceryhub.navigation.ROUTE_LOGIN
import com.example.groceryhub.navigation.ROUTE_SIGNUP
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthRepository(var navController: NavHostController, var context: Context) {
    val myAuth: FirebaseAuth
    val progress: ProgressDialog


    init {
        myAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun signup(name:String, email:String, password:String){
        progress.show()

        myAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener{

            progress.dismiss()
            if (it.isSuccessful){
                var userData = User(name, email, password, myAuth.currentUser!!.uid)
                var regRef = FirebaseDatabase.getInstance().getReference()
                    .child("Users/" + myAuth.currentUser!!.uid)
                regRef.setValue(userData).addOnCompleteListener{
                    if (it.isSuccessful){
                        Toast.makeText(context,"Signup successful", Toast.LENGTH_SHORT).show()
                        navController.navigate(route = BottomBarScreen.Home.route)
                    }else{
                        Toast.makeText(context, "ERROR: ${it.exception!!.message}", Toast.LENGTH_SHORT ).show()
                        navController.navigate(ROUTE_LOGIN)
                    }
                }
            } else{
                navController.navigate(ROUTE_SIGNUP)
            }

        }
    }

    fun login(email: String, password: String){
        progress.show()

        myAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful){
                Toast.makeText(context, "Login successful", Toast.LENGTH_SHORT).show()
                navController.navigate(route = BottomBarScreen.Home.route)
            }else{
                Toast.makeText(context, "ERROR: ${it.exception!!.message}", Toast.LENGTH_SHORT).show()
                navController.navigate(ROUTE_LOGIN)
            }
        }
    }
    fun logout(){
        myAuth.signOut()
        navController.navigate(ROUTE_LOGIN)
    }

    fun isLoggedin(): Boolean = myAuth.currentUser !=null
    //alternatively you can write this code to check if a user is logged in as follows:
    //fun isLoggedin(): Boolean{
    //if (myAuth.currentUser == null){
    //return false
    //}else{
    //return true
    // }
}