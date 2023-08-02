package jimmytrivedi.`in`.android.core

import android.content.Context
import android.widget.Toast

object ToastImpl {

    @JvmStatic
    fun sampleToast (context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}