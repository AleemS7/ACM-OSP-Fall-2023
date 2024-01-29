package edu.uga.acm.osp.nav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import edu.uga.acm.osp.components.TextButton
import edu.uga.acm.osp.composables.DisplayBox
import edu.uga.acm.osp.composables.Header
import edu.uga.acm.osp.composables.NotificationComposable
import edu.uga.acm.osp.composables.TestComposable
import edu.uga.acm.osp.composables.displayNavBar
import edu.uga.acm.osp.ui.theme.BusAppTheme

@Composable
fun SearchScreen(navController: NavController) {
    Scaffold(
        topBar = {
            Header(text = "Search All")
        },
        bottomBar = {
            displayNavBar(navController = navController, enableSearch = true)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            // Put composables here!
            TextButton(textButton = "test", colorBackground = BusAppTheme.colors.container, colorText = BusAppTheme.colors.onBackgroundPrimary)
        }
    }
}