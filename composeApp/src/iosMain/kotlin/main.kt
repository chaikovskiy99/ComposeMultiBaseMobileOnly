import androidx.compose.ui.window.ComposeUIViewController
import com.limongradstudio.cmbmo.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}
