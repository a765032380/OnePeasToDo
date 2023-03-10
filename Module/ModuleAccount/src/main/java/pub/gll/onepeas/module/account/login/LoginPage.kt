package pub.gll.onepeas.module.account.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import pub.gll.onepeas.libbase.ui.theme.AppTheme
import pub.gll.onepeas.libbase.ui.theme.ToolBarHeight
import pub.gll.onepeas.libbase.util.RouteUtils.back
import pub.gll.onepeas.libbase.widget.*

@ExperimentalComposeUiApi
@Composable
fun LoginPage(
    navCtrl: NavHostController,
    scaffoldState: ScaffoldState,
    viewModel: LoginViewModel = hiltViewModel()
) {
    val viewStates = viewModel.viewStates
    val keyboardController = LocalSoftwareKeyboardController.current
    val coroutineState = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        viewModel.viewEvents.collect {
            if (it is LoginViewEvent.PopBack) {
                navCtrl.popBackStack()
            } else if (it is LoginViewEvent.ErrorMessage) {
                popupSnackBar(coroutineState, scaffoldState, label = SNACK_ERROR, it.message)
            }
        }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.themeUi)
            .pointerInput(Unit) {
                detectTapGestures(
                    onPress = {
                        keyboardController?.hide()
                    }
                )
            },
    ) {
        item {
            Box(
                modifier = Modifier
                    .padding(bottom = 80.dp)
                    .fillMaxWidth()
                    .height(ToolBarHeight)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    tint = AppTheme.colors.mainColor,
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .align(Alignment.CenterStart)
                        .clickable { navCtrl.back() }
                )
            }
        }
        item {
            Box(Modifier.fillMaxWidth()) {
                LargeTitle(
                    title = "WanAndroid",
                    modifier = Modifier
                        .padding(bottom = 50.dp)
                        .align(Alignment.Center),
                    color = AppTheme.colors.mainColor
                )
            }
        }
        item {
            LoginEditView(
                text = viewStates.account,
                labelText = "??????",
                hintText = "??????????????????",
                onValueChanged = { viewModel.dispatch(LoginViewAction.UpdateAccount(it)) },
                onDeleteClick = { viewModel.dispatch(LoginViewAction.ClearAccount) }
            )
        }
        item {
            LoginEditView(
                text = viewStates.password,
                labelText = "??????",
                hintText = "???????????????",
                onValueChanged = { viewModel.dispatch(LoginViewAction.UpdatePassword(it)) },
                onDeleteClick = { viewModel.dispatch(LoginViewAction.ClearPassword) },
                modifier = Modifier.padding(top = 20.dp, bottom = 20.dp),
                isPassword = true
            )
        }
        item {
            AppButton(
                text = "??????",
                modifier = Modifier.padding(horizontal = 20.dp)
            ) {
                keyboardController?.hide()
                viewModel.dispatch(LoginViewAction.Login)
            }
        }
    }
}