package com.example.bd

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bd.data.NameEntity

@Composable
fun ListItem(
    item:NameEntity,
    onclick:(NameEntity) -> Unit,
    onclickDelete:(NameEntity) -> Unit
) {
    Card(
        modifier = Modifier.
        fillMaxWidth().
        padding(top = 10.dp).
        clickable {
              onclick(item)
        }
    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically)
        {
            Text(item.name,
                modifier = Modifier.
                fillMaxWidth().
                weight(1f).
                padding(10.dp))
            IconButton(onClick = {
                onclickDelete(item)

            }) {
                Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete")
            }
        }
    }
}