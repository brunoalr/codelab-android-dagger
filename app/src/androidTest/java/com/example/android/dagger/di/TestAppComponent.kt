package com.example.android.dagger.di

import com.example.android.dagger.MyApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, TestStorageModule::class, AppSubcomponents::class])
interface TestAppComponent : AppComponent, AndroidInjector<MyApplication>