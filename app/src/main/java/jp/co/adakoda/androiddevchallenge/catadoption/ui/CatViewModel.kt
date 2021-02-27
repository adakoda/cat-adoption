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

import androidx.lifecycle.ViewModel
import jp.co.adakoda.androiddevchallenge.catadoption.R
import jp.co.adakoda.androiddevchallenge.catadoption.model.Cat

class CatViewModel : ViewModel() {
    var cats: List<Cat> = listOf(
        Cat(
            name = "Sora",
            kind = "Scottish Fold",
            age = "2 years old",
            gender = "Male",
            size = "Large",
            aboutme = "Sora can stand and walk.",
            imageThumbId = R.drawable.t_animal_stand_neko_bw,
            imageId = R.drawable.animal_stand_neko_bw
        ),
        Cat(
            name = "Leo",
            kind = "Abyssinian",
            age = "4 years old",
            gender = "Male",
            size = "Medium",
            aboutme = "Muscular body and fluffy tail.",
            imageThumbId = R.drawable.t_cat_abyssinian,
            imageId = R.drawable.cat_abyssinian
        ),
        Cat(
            name = "Coco",
            kind = "American",
            age = "3 years old",
            gender = "Female",
            size = "Medium",
            aboutme = "Coco has a cute smile.",
            imageThumbId = R.drawable.t_cat_american_curl,
            imageId = R.drawable.cat_american_curl
        ),
        Cat(
            name = "Maron",
            kind = "American",
            age = "2 years old",
            gender = "Female",
            size = "Small",
            aboutme = "Large tail and tightly striped body.",
            imageThumbId = R.drawable.t_cat_american_shorthair,
            imageId = R.drawable.cat_american_shorthair
        ),
        Cat(
            name = "Momo",
            kind = "Bengal",
            age = "5 years old",
            gender = "Male",
            size = "Medium",
            aboutme = "Momo loves people.",
            imageThumbId = R.drawable.t_cat_bengal,
            imageId = R.drawable.cat_bengal
        ),
        Cat(
            name = "Rin",
            kind = "Bombay",
            age = "3 years old",
            gender = "Male",
            size = "Large",
            aboutme = "Shiny black hair.",
            imageThumbId = R.drawable.t_cat_bombay,
            imageId = R.drawable.cat_bombay
        ),
        Cat(
            name = "Luna",
            kind = "American",
            age = "3 years old",
            gender = "Female",
            size = "Large",
            aboutme = "Boss cat.",
            imageThumbId = R.drawable.t_cat_boss_gang,
            imageId = R.drawable.cat_boss_gang
        ),
        Cat(
            name = "Maru",
            kind = "Cornish Rex",
            age = "4 years old",
            gender = "Male",
            size = "Small",
            aboutme = "Maru loves to take naps.",
            imageThumbId = R.drawable.t_cat_cornish_rex,
            imageId = R.drawable.cat_cornish_rex
        ),
        Cat(
            name = "Rui",
            kind = "Cymric",
            age = "2 years old",
            gender = "Female",
            size = "Large",
            aboutme = "Leopard-like pattern.",
            imageThumbId = R.drawable.t_cat_cymric,
            imageId = R.drawable.cat_cymric
        ),
        Cat(
            name = "Nyan",
            kind = "American",
            age = "5 years old",
            gender = "Female",
            size = "Large",
            aboutme = "Cute voice.",
            imageThumbId = R.drawable.t_cat_hair_long,
            imageId = R.drawable.cat_hair_long
        ),
    )

    var selectedCat: Cat = cats.first()
}
