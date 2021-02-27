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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import jp.co.adakoda.androiddevchallenge.catadoption.R
import jp.co.adakoda.androiddevchallenge.catadoption.model.Cat

@Composable
fun CatListScreen(cats: List<Cat>, onItemClicked: (cat: Cat) -> Unit) {
    Scaffold(
        topBar = {
            val title = stringResource(id = R.string.cat_list_screen_title)
            TopAppBar(
                title = { Text(text = title) },
            )
        },
        content = {
            CatList(
                cats,
                onItemClicked
            )
        }
    )
}

@Composable
fun CatList(cats: List<Cat>, onItemClicked: (cat: Cat) -> Unit) {
    LazyColumn(content = {
        items(cats) { cat ->
            CatItem(cat, onItemClicked)
        }
    })
}

@Composable
fun CatItem(cat: Cat, onItemClicked: (cat: Cat) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable(onClick = {
                onItemClicked(cat)
            })
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = cat.imageThumbId),
            contentDescription = null
        )
        Text(
            text = cat.name,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}
