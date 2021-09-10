package polukhin.apps.daggergrocery

import android.app.Application
import polukhin.apps.daggergrocery.di.app.AppComponent
import polukhin.apps.daggergrocery.di.app.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}