package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import dagger.Component
import dagger.Subcomponent

// Scope annotation that the LoginComponent uses
// Classes annotated with @ActivityScope will have a unique instance in this Component
@ActivityScope
// Definition of a Dagger subcomponent
@Subcomponent
interface LoginComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)
}