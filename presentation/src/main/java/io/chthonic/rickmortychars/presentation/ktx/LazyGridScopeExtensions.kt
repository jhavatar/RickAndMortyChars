package io.chthonic.rickmortychars.presentation.ktx

import androidx.compose.foundation.lazy.grid.LazyGridItemScope
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.runtime.Composable
import androidx.paging.compose.LazyPagingItems

inline fun <T : Any> LazyGridScope.items(
    items: LazyPagingItems<T>,
    crossinline itemContent: @Composable LazyGridItemScope.(item: T?) -> Unit
) {
    items(count = items.itemCount) { index ->
        itemContent(items[index])
    }
}