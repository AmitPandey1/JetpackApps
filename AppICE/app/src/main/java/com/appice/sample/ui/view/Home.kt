@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package com.appice.sample.ui.view

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.appice.sample.R
import com.appice.sample.ui.theme.AppICETheme

@Composable
fun Greeting() {
    var eventName by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var attrName by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var attrValue by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var userId by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var varName by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var varValue by remember {
        mutableStateOf(TextFieldValue(""))
    }

    val mContext = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize()
    )
    {
        Column (
            modifier = Modifier.fillMaxSize()
        ){
            Card(
                modifier = Modifier
                    .background(color = Color.White)
                    .padding(10.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(5.dp)
                )
                {
                    TextField(
                        value = eventName,
                        onValueChange = { eventName = it },
                        modifier = Modifier.fillMaxWidth(),
                        textStyle = TextStyle(color = Color.Black),
                        label = {
                            Text(text = stringResource(R.string.event_name))
                        },
                        placeholder = {
                            Text(text = stringResource(R.string.enter_event_name))
                        },
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.Cyan),
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 5.dp)
                    ) {
                        TextField(
                            value = attrName,
                            onValueChange = { attrName = it },
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 2.dp),
                            textStyle = TextStyle(color = Color.Black),
                            label = {
                                Text(text = stringResource(R.string.attribute_name))
                            },
                            placeholder = {
                                Text(text = stringResource(R.string.enter_name))
                            },
                            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Cyan),
                        )
                        TextField(
                            value = attrValue,
                            onValueChange = { attrValue = it },
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = 2.dp),
                            textStyle = TextStyle(color = Color.Black),
                            label = {
                                Text(text = stringResource(R.string.attribute_value))
                            },
                            placeholder = {
                                Text(text = stringResource(R.string.enter_value))
                            },
                            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Cyan),
                        )
                    }
                    Button(
                        onClick = {
                            Toast.makeText(mContext, eventName.text, Toast.LENGTH_LONG).show()
                        },
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .fillMaxWidth(90f)
                            .padding(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                    )
                    {
                        Text(
                            text = stringResource(R.string.submit_event),
                            modifier = Modifier.padding(5.dp),
                            color = Color.White
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .background(color = Color.White)
                    .padding(start = 10.dp, top = 2.dp, end = 10.dp, bottom = 5.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(5.dp)
                )
                {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 5.dp)
                    ) {
                        TextField(
                            value = varName,
                            onValueChange = { varName = it },
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 2.dp),
                            textStyle = TextStyle(color = Color.Black),
                            label = {
                                Text(text = stringResource(R.string.variable_name))
                            },
                            placeholder = {
                                Text(text = stringResource(R.string.enter_name))
                            },
                            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Cyan),
                        )
                        TextField(
                            value = varValue,
                            onValueChange = { varValue = it },
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = 2.dp),
                            textStyle = TextStyle(color = Color.Black),
                            label = {
                                Text(text = stringResource(R.string.variable_value))
                            },
                            placeholder = {
                                Text(text = stringResource(R.string.enter_value))
                            },
                            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Cyan),
                        )
                    }
                    Button(
                        onClick = {
                            Toast.makeText(mContext, varName.text, Toast.LENGTH_LONG).show()
                        },
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .fillMaxWidth(90f)
                            .padding(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                    )
                    {
                        Text(
                            text = stringResource(R.string.submit_variable),
                            modifier = Modifier.padding(5.dp),
                            color = Color.White
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .background(color = Color.White)
                    .padding(start = 10.dp, top = 8.dp, end = 10.dp, bottom = 5.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(5.dp)
                )
                {
                    TextField(
                        value = userId,
                        onValueChange = { userId = it },
                        modifier = Modifier.fillMaxWidth(),
                        textStyle = TextStyle(color = Color.Black),
                        label = {
                            Text(text = stringResource(R.string.userid))
                        },
                        placeholder = {
                            Text(text = stringResource(R.string.enter_userid))
                        },
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.Cyan),
                    )
                    Button(
                        onClick = {
                            Toast.makeText(mContext, userId.text, Toast.LENGTH_LONG).show()
                        },
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .fillMaxWidth(90f)
                            .padding(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                    )
                    {
                        Text(
                            text = "Submit UserID",
                            color = Color.White,
                            modifier = Modifier.padding(5.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppICETheme {
        Greeting()
    }
}