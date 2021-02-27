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
package jp.co.adakoda.androiddevchallenge.catadoption.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import jp.co.adakoda.androiddevchallenge.catadoption.R
import jp.co.adakoda.androiddevchallenge.catadoption.model.Cat

@Composable
fun CatDetailScreen(
    cat: Cat,
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            val title = stringResource(id = R.string.cat_detail_screen_title)
            TopAppBar(
                title = { Text(text = title) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = null
                        )
                    }
                }
            )
        },
        content = {
            CatContent(cat)
        },
        bottomBar = {
            BottomBar()
        }
    )
}

@Composable
fun CatContent(
    cat: Cat
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = cat.imageId),
            modifier = Modifier
                .height(180.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .fillMaxWidth(),
            contentDescription = null
        )
        Spacer(Modifier.height(24.dp))
        Column(
            modifier = Modifier.background(
                color = MaterialTheme.colors.surface,
            )
        ) {
            Text(
                text = cat.name,
                style = MaterialTheme.typography.h5
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = cat.kind,
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "Age: ${cat.age}",
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "Gender: ${cat.gender}",
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "Size: ${cat.size}",
                style = MaterialTheme.typography.body1
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = "About me: ${cat.aboutme}",
                style = MaterialTheme.typography.body2
            )
        }
    }
}

@Composable
private fun BottomBar(
) {
    Surface(elevation = 2.dp) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth()
        ) {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = null
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.BookmarkBorder,
                    contentDescription = null
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.Share,
                    contentDescription = null
                )
            }
        }
    }
}
