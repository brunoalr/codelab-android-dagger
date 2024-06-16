package com.example.android.dagger.user

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@LoggedUserScope
@Subcomponent
interface UserComponent: AndroidInjector<SettingsActivity> {
    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    fun inject(activity: MainActivity)
}