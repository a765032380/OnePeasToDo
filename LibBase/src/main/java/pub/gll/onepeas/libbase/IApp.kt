package pub.gll.onepeas.libbase

import android.content.Context

interface IApp {
    /**
     * Application
     *
     * @return
     */
    fun getAppContext(): Context
}