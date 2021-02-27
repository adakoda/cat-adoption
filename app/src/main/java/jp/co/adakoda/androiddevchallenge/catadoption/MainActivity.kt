/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.co.adakoda.androiddevchallenge.catadoption

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import jp.co.adakoda.androiddevchallenge.catadoption.ui.CatDetailScreen
import jp.co.adakoda.androiddevchallenge.catadoption.ui.CatListScreen
import jp.co.adakoda.androiddevchallenge.catadoption.ui.CatViewModel
import jp.co.adakoda.androiddevchallenge.catadoption.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    val viewModel = viewModel<CatViewModel>()
    val navController = rememberNavController()
    Surface(color = MaterialTheme.colors.background) {
        NavHost(navController, startDestination = "cat_list") {
            composable("cat_list") {
                CatListScreen(
                    cats = viewModel.cats,
                    onItemClicked = {
                        viewModel.selectedCat = it
                        navController.navigate("cat_detail")
                    }
                )
            }
            composable("cat_detail") {
                CatDetailScreen(
                    cat = viewModel.selectedCat,
                    onBack = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}
